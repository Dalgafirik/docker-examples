FROM maven:3.9.6-eclipse-temurin-17

WORKDIR /opt/java-app
COPY . .

RUN mvn package -DskipTests

EXPOSE 4000
CMD ["java", "-jar", "target/java-mongo-todo-0.0.1-SNAPSHOT.jar"]
