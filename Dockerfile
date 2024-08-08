FROM openjdk:17
ADD target/SpringBoot-CICD-image-new.jar SpringBoot-CICD-image-new.jar
ENTRYPOINT ["java", "-jar","SpringBoot-CICD-image-new.jar"]
EXPOSE  9966