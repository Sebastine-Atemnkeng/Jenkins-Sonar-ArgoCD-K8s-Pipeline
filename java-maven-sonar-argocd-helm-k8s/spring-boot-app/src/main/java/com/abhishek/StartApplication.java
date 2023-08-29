@GetMapping("/")
public String index(final Model model) {
    model.addAttribute("title", "Congratulations!! You have successfully automated a Spring Boot application.");

    // First line of the message
    model.addAttribute("msgFirstLine", "This project was realized with the following open-source DevOps CI/CD tools:");

    // List of messages
    List<String> msgLines = Arrays.asList(
        "- Linux distros: Amazon Linux, Ubuntu 23.04 Server, and CentOS 9",
        "- Git & GitHub",
        "- Jenkins: Jenkinsfile for the Pipeline code with various stages and steps",
        "- Maven: For build and compilation",
        "- SonarQube & QualityGates: Static Application Security Testing (SAST) and code quality check",
        "- Docker & DockerHub: Package Manager and Artifactory",
        "- Bash shell script: To update the deployment GitHub repo with the latest Build Number",
        "- Slack Integration with Jenkins, to update the dev team on the current build status",
        "- ArgoCD controller to periodically scan the GitHub Deployment repo for any new updates",
        "- Minikube Cluster as container orchestrator for the application",
        "SUCCESS = OPPORTUNITY MEETS PREPARATION. KEEP LEARNING."
    );

    model.addAttribute("msgLines", msgLines);
    return "index";
}
