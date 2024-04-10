FROM openjdk:21-oracle

COPY build/libs/bento-sushi-web*.jar /app.jar

EXPOSE 8080

CMD ["java", "-jar", "/app.jar"]