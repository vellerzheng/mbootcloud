FROM frolvlad/alpine-oraclejdk8:slim
RUN echo "Asia/Shanghai" > /etc/timezone
VOLUME /opt/data
ADD eurekaserver-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 8761