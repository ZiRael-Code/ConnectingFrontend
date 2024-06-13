FROM maven:3.8.7 as build
COPY . .
RUN mvn -B clean package -DskipTests

FROM openjdk:17-jdk-slim
COPY --from=build ./target/TodoLists-1.0-SNAPSHOT.jar ConnectingFrontEnd.jar
EXPOSE 8181
ENTRYPOINT ["java","-jar","ConnectingFrontEnd.jar"]



