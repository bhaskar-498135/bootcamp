 FROM tomcat:8.0
 
 EXPOSE 8888
 
 ARG WAR_FILE=target/cicd-pipeline-dj.war
 ARG conf=tomcat-users.xml
 ARG context=context.xml
 COPY ${context} /usr/local/tomcat/webapps/manager/META-INF/context.xml
 COPY ${context} /usr/local/tomcat/conf/Catalina/localhost/manager.xml
 COPY ${conf} /usr/local/tomcat/conf/tomcat-users.xml
 COPY ${WAR_FILE} /usr/local/tomcat/webapps/cicd-pipeline-dj.war
 
 
 MAINTAINER "mavurubhaskar@gmail.com"
