FROM openjdk:11
EXPOSE 4040
ADD target/department-service.jar department-service.jar
ENTRYPOINT ["java","jar","/department-service.jar"]