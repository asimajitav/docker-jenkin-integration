FROM openjdk:17
EXPOSE 8080
ADD build/libs/springboot-docker-jenkin.jar springboot-docker-jenkin.jar
ENTRYPOINT ["java","-jar","/springboot-docker-jenkin.jar"]