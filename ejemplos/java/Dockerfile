# For Java 11

# For Java 11, try this
FROM maven:3.8.5-jdk-11

# Refer to Maven build -> finalName
ARG JAR_FILE=target/api.jar

# cd /opt/app
WORKDIR /opt/app

# cp target/api.jar /opt/app/app.jar
COPY ${JAR_FILE} app.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]