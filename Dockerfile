FROM openjdk:1.8-jdk-alpine
EXPOSE 8081
ADD target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]