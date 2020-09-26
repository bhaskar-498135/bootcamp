 FROM tomcat:8.0
 
 EXPOSE 8888
 
 ARG WAR_FILE=target/*.war
 ARG conf=tomcat-users.xml
 COPY ${conf} /usr/local/tomcat/conf/tomcat-users.xml
 COPY ${WAR_FILE} /opt/tomcat/webapps/app.war
 
 
 MAINTAINER "mavurubhaskar@gmail.com"
