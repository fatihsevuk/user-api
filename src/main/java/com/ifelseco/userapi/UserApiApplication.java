package com.ifelseco.userapi;

import com.ifelseco.userapi.config.SecurityUtility;
import com.ifelseco.userapi.entity.Role;
import com.ifelseco.userapi.entity.User;
import com.ifelseco.userapi.entity.UserRole;
import com.ifelseco.userapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class UserApiApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(UserApiApplication.class, args);
    }


    @Autowired
    private UserService userService;


    @Override
    public void run(String... arg0) throws Exception {
        /*User user1=new User();
        user1.setFirstname("Fatih");
        user1.setLastname("SEvük");
        user1.setUsername("F");
        user1.setPassword(SecurityUtility.passwordEncoder().encode("f"));
        user1.setEmail("fatih@fatih.com");
        Set<UserRole> userRoles=new HashSet<>();
        Role role1=new Role();
        role1.setName("ROLE_USER");
        userRoles.add(new UserRole(user1,role1));

        userService.createUser(user1,userRoles);

        userRoles.clear();

        User user2=new User();
        user2.setFirstname("admin");
        user2.setLastname("ADMIN");
        user2.setUsername("admin");
        user2.setPassword(SecurityUtility.passwordEncoder().encode("f"));
        user2.setEmail("admin@fatih.com");

        Role role2=new Role();
        role2.setName("ROLE_ADMIN");
        userRoles.add(new UserRole(user2,role2));

        userService.createUser(user2,userRoles);*/



    }

}
