FROM maven:3.9.6-eclipse-temurin-11

WORKDIR /opt/java-server
COPY . .

RUN mvn package -DskipTests

EXPOSE 3000

CMD ["java", "-jar", "target/java-http-server-1.0.0.jar"]
