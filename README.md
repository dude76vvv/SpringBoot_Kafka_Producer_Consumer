# SpringBoot_Kafka_Producer_Consumer 
The aim of this project is to create event-driven data-pipeline using kafka.<br/>
Upon request, Producer application will publish data to kafka topic.<br/>
Consumer application(s) subscribed to kafka topic will listen to incoming data, consume and load into MongoDB database.

Project is dockerized for fast & easy deployment.

## Technologies used
* Spring Boot
* Maven
* Kafka
* MongoDB
* Docker



![image](https://github.com/dude76vvv/SpringBoot_Kafka_Producer_Consumer/assets/131178280/27d858d4-b63f-4239-969b-ffb061afe788)




## Setting up (create .jar file)
#### Ensure Java and Maven is installed before proceeding #### 

1. **CD** into respective application folder and run command to create the .jar file.
    - **mvn package**


## Running

1. **CD** to the folder containing docker compose.yml file and run commnad to build docker image(s) and start the containers.

    - **docker compose up -d**
  
![image](https://github.com/dude76vvv/SpringBoot_Kafka_Producer_Consumer/assets/131178280/6773bcc9-268d-4025-92c8-eaafabf7e999)


## Screenshots

![image](https://github.com/dude76vvv/SpringBoot_Kafka_Producer_Consumer/assets/131178280/ac8ee45c-3034-44f5-82c5-49cf2eec7c5f)

![image](https://github.com/dude76vvv/SpringBoot_Kafka_Producer_Consumer/assets/131178280/c5266b64-d7c2-438b-ac4d-da844454c25b)

![image](https://github.com/dude76vvv/SpringBoot_Kafka_Producer_Consumer/assets/131178280/07cac73c-0ad9-46cc-8377-e4edcf705ae7)

![image](https://github.com/dude76vvv/SpringBoot_Kafka_Producer_Consumer/assets/131178280/92922772-794b-4989-bd97-f4bdd6186179)

![image](https://github.com/dude76vvv/SpringBoot_Kafka_Producer_Consumer/assets/131178280/b8e84ad6-61cf-4409-8f27-ea2a249d17f3)






















