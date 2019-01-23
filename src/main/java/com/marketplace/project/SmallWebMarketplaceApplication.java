package com.marketplace.project;

import com.marketplace.project.entities.User;
import com.marketplace.project.entities.UserRole;
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

import java.util.ArrayList;
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


//        UserRole buyerUserRole = new UserRole(); // default buyer
//
//        UserRole sellerUserRole = new UserRole();
//        sellerUserRole.setRoleType(RoleType.SELLER.getRoleType());
//
//        UserRole adminUserRole = new UserRole();
//        adminUserRole.setRoleType(RoleType.ADMIN.getRoleType());
//
//        userRoleService.save(buyerUserRole);
//        userRoleService.save(sellerUserRole);
//        userRoleService.save(adminUserRole);
//
//        //****** // ----------- \\ *******
//
//        Set<UserRole> userRoles = new HashSet<>();
//
//        userRoles.add(buyerUserRole);
//        userRoles.add(sellerUserRole);
//
//        User user1 = new User();
//        user1.setFirsName("Ivan");
//        user1.setSecondName("Silivanov");
//        user1.setCity("Kiev");
//        user1.setEmail("trulala@dotnet.com");
//        user1.setPhone("096-22-66-999");
//        user1.setPassword("qwerty");
//        user1.setPurchasedItems(new ArrayList<>());
//        user1.setSellList(new ArrayList<>());
//        user1.setUserRoles(userRoles);
//
//        userService.save(user1);


        //****** // ----------- \\ *******
    }
}

