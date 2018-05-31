FROM frolvlad/alpine-oraclejdk8:slim
RUN echo "Asia/Shanghai" > /etc/timezone
VOLUME /opt/data
ADD eurekaserver-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS="-agentlib:jdwp=transport=dt_socket,address=8761,server=y,suspend=n"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
