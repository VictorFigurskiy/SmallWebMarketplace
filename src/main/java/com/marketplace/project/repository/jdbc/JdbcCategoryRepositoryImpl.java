package com.marketplace.project.repository.jdbc;

import com.marketplace.project.controllers.model.Category;
import com.marketplace.project.controllers.model.Offer;
import com.marketplace.project.repository.CategoryRepository;
import com.marketplace.project.repository.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;

@Repository
@Transactional(readOnly = true)
public class JdbcCategoryRepositoryImpl implements CategoryRepository {

    private static final RowMapper<Category> ROW_MAPPER = BeanPropertyRowMapper.newInstance(Category.class);

    private final JdbcTemplate jdbcTemplate;

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private final SimpleJdbcInsert insertMeal;

    @Autowired
    public JdbcCategoryRepositoryImpl(DataSource dataSource, JdbcTemplate jdbcTemplate, NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.insertMeal = new SimpleJdbcInsert(dataSource)
                .withTableName("cetegory")
                .usingGeneratedKeyColumns("id");

        this.jdbcTemplate = jdbcTemplate;
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Override
    public Category save(Category category, int offerId) {
        MapSqlParameterSource map = new MapSqlParameterSource()
                .addValue("id", category.getId())
                .addValue("category", category.getNameOfCategory());

        if (category.isNew()) {
            Number newId = insertMeal.executeAndReturnKey(map);
            category.setId(newId.intValue());
        } else {
            if (namedParameterJdbcTemplate.update("" +
                            "UPDATE cetegory " +
                            " SET `category`=:category " +
                            " WHERE id=:id "
                    , map) == 0) {
                return null;
            }
        }
        return category;
    }

    @Override
    @Transactional
    public boolean delete(int id, int offerId) {
        return jdbcTemplate.update("DELETE FROM cetegory WHERE id=? AND category=?", id, offerId) != 0;
    }

    @Override
    public Category get(int id, int offerId) {
        List<Category> offers = jdbcTemplate.query(
                "SELECT * FROM cetegory WHERE id = ? AND category = ?", ROW_MAPPER, id, offerId);
        return DataAccessUtils.singleResult(offers);
    }

    @Override
    public List<Category> getAll(int offerId) {
        return jdbcTemplate.query(
                "SELECT * FROM cetegory WHERE category=? ORDER BY category DESC", ROW_MAPPER, offerId);
    }

    @Override
    public Category getWithOffer(int id, int offerId) {
        List<Category> offers = jdbcTemplate.query(
                "SELECT * FROM cetegory WHERE id = ? AND category = ?", ROW_MAPPER, id, offerId);
        return DataAccessUtils.singleResult(offers);
    }
}
