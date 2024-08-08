FROM openjdk:17
EXPOSE  9966
ADD target/SpringBoot-CICD-image-new.jar SpringBoot-CICD-image-new.jar
ENTRYPOINT ["java", "-jar","/SpringBoot-CICD-image-new.jar"]