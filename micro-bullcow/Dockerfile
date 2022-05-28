FROM openjdk:17-alpine
COPY . /app
WORKDIR /app
RUN ["./mvnw", "clean", "install", "-Dmaven.test.skip=true"]
ENTRYPOINT ["./mvnw", "spring-boot:run"]