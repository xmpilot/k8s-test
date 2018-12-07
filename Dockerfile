FROM java:latest
ADD k8s-test-1.1.war app.war
RUN bash -c 'touch /app.war'
ENTRYPOINT ["java","-jar","/app.war"]