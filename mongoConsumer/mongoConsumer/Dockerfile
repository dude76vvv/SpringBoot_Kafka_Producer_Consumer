FROM eclipse-temurin:17-jdk-alpine

ARG JAR_FILE=target/*.jar

WORKDIR /opt/app

COPY ${JAR_FILE} appMongoConsume.jar

#ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://mongodb:27017/kafkaDemo","-Djava.security.egd=file:/dev/./urandom","-jar","appMongoConsume.jar"]
ENTRYPOINT ["java","-jar","appMongoConsume.jar"]