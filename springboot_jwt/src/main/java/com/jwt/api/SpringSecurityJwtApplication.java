package com.jwt.api;

import com.jwt.api.entity.User;
import com.jwt.api.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringSecurityJwtApplication {
    @Autowired
    private UserRepository repository;

    @PostConstruct
    public void initUsers() {
    	
    	List<User> users = new ArrayList<User>();
    	User user = new User(1, "satheesh", "password", "ssatheeshcareeer@gmail.com");
    	users.add(user);
    	
        repository.saveAll(users);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJwtApplication.class, args);
    }

}
