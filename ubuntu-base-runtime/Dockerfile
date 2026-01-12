FROM ubuntu:18.04

RUN apt-get update
RUN apt-get install openjdk-11-jdk -y

WORKDIR /opt/java-app/

COPY . /opt/java-app/

RUN javac Main.java

CMD ["java", "Main"]
