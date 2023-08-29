package com.abhishek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class StartApplication {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "Congratulations!! You have soccessfully automated a sprint boot application using CI/CD Pipeline.");
        model.addAttribute("msg", "This application is deployed on to Kubernetes using ArgoCD as a deployer. Other open source tools used in this project includes");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
