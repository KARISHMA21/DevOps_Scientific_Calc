#uses openjdk:11 as base image for our new image
FROM openjdk:11

#copies the jar file from local file system to image
COPY ./target/MyScientific_Cal-1.0-SNAPSHOT-jar-with-dependencies.jar ./

#changes the working directory to root directory
WORKDIR ./

#executes java -jar command to run the jar file.
CMD ["java", "-jar", "MyScientific_Cal-1.0-SNAPSHOT-jar-with-dependencies.jar"]





