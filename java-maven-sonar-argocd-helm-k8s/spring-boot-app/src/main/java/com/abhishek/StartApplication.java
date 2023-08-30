package com.abhishek; // Make sure this package path matches your project structure

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication

public class StartApplication {

    public static void main(String[] args) {

        SpringApplication.run(StartApplication.class, args);

    }

    @Controller

    public class WebController {

        @GetMapping("/")

        public String getHomePage(Model model) {

            model.addAttribute("title", "Congratulations!! You have successfully automated a Spring Boot application.");

            return "index"; // This should match the name of your HTML file (without the extension)

        }

    }

}
