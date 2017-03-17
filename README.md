# SpringHibernateMysqlTemplate
A simple template application integrating Spring-Hibernate-Mysql


Based on: http://websystique.com/springmvc/spring-4-mvc-and-hibernate4-integration-example-using-annotations/

Run this script to add table into your mysql:

`CREATE TABLE EMPLOYEE(
    id INT NOT NULL auto_increment, 
    name VARCHAR(50) NOT NULL,
    joining_date DATE NOT NULL,
    salary DOUBLE NOT NULL,
    ssn VARCHAR(30) NOT NULL UNIQUE,
    PRIMARY KEY (id)
);`

Change `<outputDirectory>` value in `pom.xml` as per your tomcat `webapps` folder location and run

`mvn clean install`

Go to `bin` folder inside your tomcat install directory.
Start your tomcat server using : `./catalina.sh start`

Your application should now be reachable at:

http://localhost:8080

port number may vary based on your tomcat tweaks. 