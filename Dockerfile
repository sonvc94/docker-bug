FROM maven:latest
RUN mkdir /demo
WORKDIR /demo
COPY . .
EXPOSE 8080
CMD ["mvn", "spring-boot:run"]