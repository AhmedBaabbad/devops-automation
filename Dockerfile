FROM openjdk:11
EXPOSE 8080
ADD target/deveps-integration.jar deveps-integration.jar
ENTRYPOINT ["java","-jar","/deveps-integration.jar"]