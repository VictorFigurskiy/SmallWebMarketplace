package com.marketplace.project.repository.jdbc;

import com.marketplace.project.controllers.model.Offer;
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
public class JdbcOfferRepositoryImpl implements OfferRepository{

    private static final RowMapper<Offer> ROW_MAPPER = BeanPropertyRowMapper.newInstance(Offer.class);

    private final JdbcTemplate jdbcTemplate;

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private final SimpleJdbcInsert insertMeal;

    @Autowired
    public JdbcOfferRepositoryImpl(DataSource dataSource, JdbcTemplate jdbcTemplate, NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.insertMeal = new SimpleJdbcInsert(dataSource)
                .withTableName("offer")
                .usingGeneratedKeyColumns("id");

        this.jdbcTemplate = jdbcTemplate;
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Override
    @Transactional
    public Offer save(Offer offer, int userId) {
        MapSqlParameterSource map = new MapSqlParameterSource()
                .addValue("id", offer.getId())
                .addValue("condition", offer.getCondition())
                .addValue("creation_time", offer.getDateTime())
                .addValue("description", offer.getDescription())
                .addValue("price", offer.getPrice())
                .addValue("title", offer.getTitle())
                .addValue("user_id", userId);

        if (offer.isNew()) {
            Number newId = insertMeal.executeAndReturnKey(map);
            offer.setId(newId.intValue());
        } else {
            if (namedParameterJdbcTemplate.update("" +
                            "UPDATE offer " +
                            " SET `condition`=:condition, creation_time=:creation_time, description=:description, title=:title " +
                            " WHERE id=:id AND seller_id=:user_id"
                    , map) == 0) {
                return null;
            }
        }
        return offer;
    }


    @Override
    @Transactional
    public boolean delete(int id, int userId) {
        return jdbcTemplate.update("DELETE FROM offer WHERE id=? AND seller_id=?", id, userId) != 0;
    }

    @Override
    public Offer get(int id, int userId) {
        List<Offer> offers = jdbcTemplate.query(
                "SELECT * FROM offer WHERE id = ? AND seller_id = ?", ROW_MAPPER, id, userId);
        return DataAccessUtils.singleResult(offers);
    }

    @Override
    public List<Offer> getAll(int userId) {
        return jdbcTemplate.query(
                "SELECT * FROM offer WHERE seller_id=? ORDER BY creation_time DESC", ROW_MAPPER, userId);
    }
}
