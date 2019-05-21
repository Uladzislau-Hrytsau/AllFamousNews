# All Famous News

## Necessary tools

* [Maven 3](https://maven.apache.org/)
* [Java 8 or latest version](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [MySQL](https://www.mysql.com/)
* [npm](https://www.npmjs.com/)
* [Vue js](https://vuejs.org/)
* [Vue cli](https://cli.vuejs.org/)
* [GIT](https://git-scm.com/)


## Getting started
Clone this repository to your local machine using:
```
git clone https://github.com/Uladzislau-Hrytsau/AllFamousNews.git
```
Install java 8 or latest version using:
```
sudo apt install openjdk-8-jdk
```
Install maven 3 using:
```
sudo apt install maven
```
Install GIT using:
```
sudo apt install git 
```

## Deployment backend application
Build the backend application using:
```
mvn clean install
```
The standard port for deploying backend application is 8080.

To change the standard port using the [server.port](../AllFamousNews/src/main/resources/application.properties)

Deployment the backend application using:
```
mvn spring-boot:run
```

##[How to install and deploy the frontend application](../AllFamousNews/front-end/vue-news/README.md)