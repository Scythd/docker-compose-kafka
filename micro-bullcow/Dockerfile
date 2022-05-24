FROM openjdk:17
COPY . /app
WORKDIR /app
RUN ["./mvnw", "clean", "install"]
ENTRYPOINT ["./mvnw", "spring-boot:run"]