FROM maven:3-jdk-8
RUN git clone https://github.com/smartheating/CloudGateway.git
WORKDIR /CloudGateway/
RUN mvn clean install -DskipTests -q
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=docker","-jar","target/CloudGateway-0.0.1-SNAPSHOT.jar"]

