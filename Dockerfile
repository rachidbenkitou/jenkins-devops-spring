FROM openjdk:17-jdk-alpine
EXPOSE 8080
ADD target/devops-jenkins.jar devops-jenkins.jar
ENTRYPOINT ["java", "-jar","/devops-jenkins.jar"]
