
#The FROM instruction specifies the Parent Image from which you are building.
#Hence, here uses openjdk:11 as base image for our new image
FROM openjdk:11

#The COPY instruction copies files or directories from <src> and
#adds them to the filesystem of the container at the path <dest>
#COPY <src> <dest>

#copies the jar file from local file system to docker image at root
COPY ./target/MyScientific_Cal-1.0-SNAPSHOT-jar-with-dependencies.jar ./

#WORKDIR may likely be set by the base image you’re using.
#Therefore, to avoid unintended operations in unknown directories,
#it is best practice to set your WORKDIR explicitly.
#Sets the working directory(<WORKDIR>) to root directory for CMD
WORKDIR ./

# Specifies the intended command for the image,
#which in our case is java -jar command to run the jar file of our calculator project
CMD ["java", "-jar", "MyScientific_Cal-1.0-SNAPSHOT-jar-with-dependencies.jar"]