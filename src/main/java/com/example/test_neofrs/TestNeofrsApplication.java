package com.example.test_neofrs;

import com.example.test_neofrs.testConnect.SpringRestTemplateApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestNeofrsApplication {

//    public static void main(String[] args) {
//        SpringApplication.run(TestNeofrsApplication.class, args);
//    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringRestTemplateApp.class, args);
    }
}

