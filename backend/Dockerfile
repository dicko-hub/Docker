FROM maven:3.6.3-adoptopenjdk-8 as MAVEN_BUILD

WORKDIR /build
COPY pom.xml .
COPY /src ./src

RUN mvn package

# 2nd stage

FROM adoptopenjdk/openjdk8:alpine-jre

RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

WORKDIR /app
COPY --from=MAVEN_BUILD /build/target/spring-ari2-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "spring-ari2-0.0.1-SNAPSHOT.jar"]