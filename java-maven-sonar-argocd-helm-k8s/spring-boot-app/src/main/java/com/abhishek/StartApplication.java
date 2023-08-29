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
        model.addAttribute("title", "Congratulations!! You have successfully automated a sprint boot application.");
        
        model.addAttribute("msg", "This project was realized with the following opensource DevOps CI/CD tools,");
        
        model.addAttribute("msg", "Linux distros: Amazon-linux, Ubuntu-23.04-server, and CentOs-9");

        model.addAttribute("msg", "Git & GitHub");

        model.addAttribute("msg", "Jenkins: Jenkinfile for the Pipleline code with the various stages and step");

        model.addAttribute("msg", "Maven: For the build and compiler tool");

        model.addAttribute("msg", "SonarQube & QualityGates: Static Application Security Testing, SAST and code quality check");

        model.addAttribute("msg", "Docker & DokcerHub: Package Manager and Artifactory");

        model.addAttribute("msg", "Bash shell script: To update the deployment the GitHub deployment repo with the latest Build Number");

        model.addAttribute("msg", "Slack Integration with jenkins, to update the dev team of the current build status");

        model.addAttribute("msg", "ArgoCD controller to periodically scan the GitHub Deployment repo for any new updates");

        model.addAttribute("msg", "Minikube Cluster, as container orchastrator for the application");
        
        model.addAttribute("msg",  "SUCCESS = OPPORTUNITY MEETS PREPARATION. KEEP LEARNING.");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
