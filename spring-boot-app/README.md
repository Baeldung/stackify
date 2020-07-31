# Building and running the application

## Option 1
``mvn clean install``\
``mvn spring-boot:run``

## Option 2
``mvn package spring-boot:repackage``\
``java -Dspring.profiles.active=default -jar target/spring-boot-app-0.0.1-SNAPSHOT.war``

# Accessing the application
http://localhost:8081/springbootapp/employees