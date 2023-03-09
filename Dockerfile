FROM openjdk:11
COPY ./target/MyScientific_Cal-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "MyScientific_Cal-1.0-SNAPSHOT-jar-with-dependencies.jar"]
