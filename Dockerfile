FROM maven:3.8.5-openjdk-17

WORKDIR /app

COPY . .
RUN mvn dependency:resolve
EXPOSE 1568

CMD ["mvn", "spring-boot:run"]
