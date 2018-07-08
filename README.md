# BIGDATA MONGODB SPRING-BOOT

The goal is to have a scaffold with Spring Boot, MongoDb and Bootstrap 4.

## 1.1	Environment
- Java 		8

- Maven 	3

- MongoDb 	3.6.2

- NodeJS 	6.11.1

- Npm 		3.10.10

- Bower 	1.8.4

- Gulp 		3.9.1 CLI version

- IDE like Eclipse


## 1.2 Dependencies

Main dependencies for JAVA are

*Spring Boot*

*Spring Data MongoDb*

*Spring Web MVC*

*AspectJ*

Main dependencies for FE are

*Bootstrap 4*

*jQuery*

*Babel*

## 1.3 Configuration

Move to root folder of project /bigdata-application

**mvn clean install**

Move to /bigdata-application-webapp/ module

**npm install -g bower**

**npm install**

**bower install**

**npm install gulp**

**gulp build:default**

Come back to root folder of project

**mvn clean package -Pdev**

Update maven project (only for Eclipse)

Deploy .war in tomcat

## 1.4 Database creation and configuration

start database server v3.6.2

**mongod --dbpath "c:\DevRootPersonal\mongodb\data\customer_db"**

connect to database

**mongo**

switch to schema

**use customer_db**

test query on customer collection

**db.customer.find()**

or something like this

**db.customer.find({$and : [{_id : ObjectId("5b17a151a1929d7ef1c1daa7")}, {dateBirth : new Date("1988-04-09")}]}).pretty();**

## 1.5 Profiles and Build


## 1.6 Execution


## 1.7 dataTables configuration history

bower install --save bootstrap@4.1.1

bower install --save datatables.net@1.10.16

bower install --save datatables.net-bs4@1.10.16


## 1.8 Refs

https://spring.io/guides/gs/accessing-data-mongodb/

https://docs.mongodb.com/manual/reference/

https://getbootstrap.com/docs/4.0/getting-started/introduction/

https://datatables.net/examples/styling/bootstrap4.html





