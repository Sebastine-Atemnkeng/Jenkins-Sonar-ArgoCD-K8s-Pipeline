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
        model.addAttribute("title", "Congratulations! You have successfully automated a Spring Boot application.");
        
        StringBuilder msgBuilder = new StringBuilder();
        msgBuilder.append("This project was created using various open-source DevOps CI/CD tools, including:\n");
        msgBuilder.append(" - Linux distributions: Amazon Linux, Ubuntu 23.04 Server, and CentOS 9\n");
        msgBuilder.append(" - Git & GitHub for version control\n");
        msgBuilder.append(" - Jenkins with a Jenkinsfile for defining the pipeline stages and steps\n");
        msgBuilder.append(" - Maven for build and compilation\n");
        msgBuilder.append(" - SonarQube & Quality Gates for Static Application Security Testing (SAST) and code quality checks\n");
        msgBuilder.append(" - Docker & DockerHub for packaging and artifact management\n");
        msgBuilder.append(" - Bash shell scripting to update the GitHub deployment repository with the latest Build Number\n");
        msgBuilder.append(" - Slack integration with Jenkins to notify the development team about the build status\n");
        msgBuilder.append(" - ArgoCD controller for periodic scanning of the GitHub Deployment repository for updates\n");
        msgBuilder.append(" - Minikube Cluster as a container orchestrator for the application\n\n");
        msgBuilder.append("SUCCESS = When Opportunity Meets Preparation. Keep Learning.");

        model.addAttribute("msg", msgBuilder.toString());
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }
}
