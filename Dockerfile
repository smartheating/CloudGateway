FROM java:8-jdk-alpine
VOLUME /tmp
EXPOSE 9001
ARG JAR_FILE=target/CloudGateway-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} cloudgateway.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=docker","-jar","/cloudgateway.jar"]