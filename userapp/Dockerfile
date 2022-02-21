FROM openjdk:17-jdk-slim
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Dfile.encoding=UTF8","-jar","/app.jar"]
