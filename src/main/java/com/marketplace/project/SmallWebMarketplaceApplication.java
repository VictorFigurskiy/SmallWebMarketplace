package com.marketplace.project;

import com.marketplace.project.entities.Category;
import com.marketplace.project.entities.Image;
import com.marketplace.project.entities.Offer;
import com.marketplace.project.entities.User;
import com.marketplace.project.entities.UserRole;
import com.marketplace.project.entities.enums.CategoryTypes;
import com.marketplace.project.entities.enums.RoleType;
import com.marketplace.project.services.CategoryService;
import com.marketplace.project.services.ImageService;
import com.marketplace.project.services.OfferService;
import com.marketplace.project.services.UserRoleService;
import com.marketplace.project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigurationExcludeFilter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//@ComponentScan(value = {"com.marketplace.project.controllers", "com.marketplace.project.services", "com.marketplace.project.dao", "com.marketplace.project.entities"})
@SpringBootApplication
public class SmallWebMarketplaceApplication implements CommandLineRunner {

    @Autowired
    UserService userService;
    @Autowired
    OfferService offerService;
    @Autowired
    ImageService imageService;
    @Autowired
    CategoryService categoryService;
    @Autowired
    UserRoleService userRoleService;

    public static void main(String[] args) {

        ApplicationContext appCtx = SpringApplication.run(SmallWebMarketplaceApplication.class, args);


//        for (String name: appCtx.getBeanDefinitionNames()) {
//            System.out.println(name);
//        }
    }


    @Override
    public void run(String... args) throws Exception {

        Category category = new Category();
        category.setCategory(CategoryTypes.ELECTRONIKS.getCategoryType());

        Category category2 = new Category();
        category2.setCategory(CategoryTypes.MOTORS.getCategoryType());

        Category category3 = new Category();
        category3.setCategory(CategoryTypes.FASHION.getCategoryType());

        Category category4 = new Category();
        category4.setCategory(CategoryTypes.HOME_AND_GARDEN.getCategoryType());

        Category category5 = new Category();
        category5.setCategory(CategoryTypes.SPORTING_GOODS.getCategoryType());

        categoryService.save(category);
        categoryService.save(category2);
        categoryService.save(category3);
        categoryService.save(category4);
        categoryService.save(category5);

        //****** // ----------- \\ *******

        UserRole buyerUserRole = new UserRole(); // default buyer

        UserRole sellerUserRole = new UserRole();
        sellerUserRole.setRoleType(RoleType.SELLER.getRoleType());

        UserRole adminUserRole = new UserRole();
        adminUserRole.setRoleType(RoleType.ADMIN.getRoleType());

        userRoleService.save(buyerUserRole);
        userRoleService.save(sellerUserRole);
        userRoleService.save(adminUserRole);

        //****** // ----------- \\ *******

        Set<UserRole> userRoles = new HashSet<>();

        userRoles.add(buyerUserRole);
        userRoles.add(sellerUserRole);

        User user1 = new User();
        user1.setFirsName("Ivan");
        user1.setSecondName("Silivanov");
        user1.setCity("Kiev");
        user1.setEmail("trulala@dotnet.com");
        user1.setPhone("096-22-66-999");
        user1.setPassword("qwerty");
        user1.setPurchasedItems(new ArrayList<>());
        user1.setSellList(new ArrayList<>());
        user1.setUserRoles(userRoles);

        userService.save(user1);

        // ----- **** -----

        Set<UserRole> userRoles2 = new HashSet<>();

        userRoles2.add(buyerUserRole);
        userRoles2.add(sellerUserRole);
        userRoles2.add(adminUserRole);

        User user2 = new User();
        user2.setFirsName("Ирина");
        user2.setSecondName("Шрайк");
        user2.setCity("Киев");
        user2.setEmail("hsrike@gmail.com");
        user2.setPhone("096-12-68-979");
        user2.setPassword("irina");
        user2.setPurchasedItems(new ArrayList<>());
        user2.setSellList(new ArrayList<>());
        user2.setUserRoles(userRoles2);

        userService.save(user2);

        //****** // ----------- \\ *******

        Image image = new Image();

        image.setName("Hayabusa offer");
        image.setPath("static/images/33b812666a4fc125263644a19e99d378.png");

        imageService.save(image);

        //****** // ----------- \\ *******

        Offer offer1 = new Offer();

        offer1.setCategory(category);
        offer1.setCondition("New");
        offer1.setBuyer(null);
        offer1.setSeller(user1);
        offer1.setStatus(true);
        offer1.setTitle("MSI GF72VR-7RF Laptop");
        offer1.setPrice(BigDecimal.valueOf(1200.00));
        offer1.setImages(null);
        offer1.setOfferDescription("Ноутбук; Классический; 17,3\"; IPS; 1920x1080; Intel Core i7-7700HQ; 2,8-3,8 ГГц; ОЗУ: 16 ГБ; NVIDIA GeForce GTX 1060, 6 ГБ; HDD: 1000 ГБ; 2,7 кг; ОС: Windows 10; цвет: черный");

        offerService.save(offer1);


        Offer offer2 = new Offer();

        offer2.setCategory(category2);
        offer2.setCondition("Used");
        offer2.setBuyer(null);
        offer2.setSeller(user2);
        offer2.setStatus(true);
        offer2.setTitle("Мотоцикл Suzuki Hayabusa ABS GSX1300RA");
        offer2.setPrice(BigDecimal.valueOf(12500.00));
        offer2.setImages(Arrays.asList(image));
        offer2.setOfferDescription("Задумом інженерів SUZUKI було створення великовагового, але напрочуд маневреного велетня. Оскільки водію не так вже й часто потрібно «зриватися» з місця, неперевершена потужність і спритність мотоцикла роблять його надзвичайно надійним компаньйоном у повсякденному житті. Приборкана та водночас рафінована енергія мотоцикла неодмінно привертає погляди оточуючих до Hayabusa та його «вершника». ");

        offerService.save(offer2);

        //****** // ----------- \\ *******
    }
}

