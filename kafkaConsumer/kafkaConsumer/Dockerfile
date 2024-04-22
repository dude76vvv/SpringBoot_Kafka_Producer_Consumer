FROM eclipse-temurin:17-jdk-alpine

ARG JAR_FILE=target/*.jar

WORKDIR /opt/app

COPY ${JAR_FILE} appConsumer.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","appConsumer.jar"]