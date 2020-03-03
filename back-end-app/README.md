# Study Builder
![Travis_Status](https://travis-ci.com/amol-can/digital-workflow.svg?branch=master)

The only thing better than a Maven archetype is a repo you can fork with everything already setup. Skip the documentation and just fork-and-code. 


## Built With

* 	[Maven](https://maven.apache.org/) - Dependency Management
* 	[Flyway](https://flywaydb.org/) - Version control for database
* 	[JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Java™ Platform, Standard Edition Development Kit 
* 	[Spring Boot](https://spring.io/projects/spring-boot) - Framework to ease the bootstrapping and development of new Spring Applications
* 	[MySQL](https://www.mysql.com/) - Open-Source Relational Database Management System
* 	[git](https://git-scm.com/) - Free and Open-Source distributed version control system 
* 	[Swagger](https://swagger.io/) - Open-Source software framework backed by a large ecosystem of tools that helps developers design, build, document, and consume RESTful Web services.

## External Tools Used

* [Postman](https://www.getpostman.com/) - API Development Environment (Testing Docmentation)

## To-Do

- [x] Logger (Console, File, Mail)
- [x] RESTful Web Service (CRUD)
- [x] Bootstrap - CSS
- [x] Web - HTML, JavaScript (jQuery)
- [x] Content Negotiation
- [ ] Material Design for Bootstrap
- [X] Docker
- [ ] Spring Boot Admin

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.atos.studybuilder.StudybuilderApplication` class from your IDE.

- Download the zip or clone the Git repository.
- Unzip the zip file (if you downloaded one)
- Open Command Prompt and Change directory (cd) to folder containing pom.xml
- Open Eclipse 
   - File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip
   - Select the project
- Choose the Spring Boot Application file (search for @SpringBootApplication)
- Right Click on the file and Run as Java Application

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

### Security

```
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-security</artifactId>
</dependency>
```

Spring Boot Starter Security default username is `user` and a generated security password is printed in the console like `Using generated security password: 0423bec1-6759-4ed2-8e3e-e8196effadf9`

Automated dependency updates done via [Dependabot](https://dependabot.com/)

### Actuator

To monitor and manage your application

|  URL |  Method |
|----------|--------------|
|`http://localhost:8080`  						| GET |
|`http://localhost:8080/actuator/actuator`  | GET |
|`http://localhost:8080/actuator/health`    	| GET |
|`http://localhost:8080/actuator/info`      	| GET |
|`http://localhost:8080/actuator/prometheus`| GET |
|`http://localhost:8080/actuator/httptrace` | GET |

### Sample URLs

|  URL |  Method | Remarks |
|----------|--------------|--------------|
|`http://localhost:8080/api/v0/protocols`                           | GET | Custom Response Headers|
|`http://localhost:8080/api/v0/protocols`                       | POST | |
|`http://localhost:8080/api/v0/protocols`                 | PUT | |
|`http://localhost:8080/api/v0/study-phases` | GET | |
|`http://localhost:8080/api/v0/study-phases`                             | POST | |


## Documentation

* [Postman Collection](#) - online, with code auto-generated snippets in cURL, jQuery, Ruby,Python Requests, Node, PHP and Go programming languages
* [Postman Collection](#) - offline
* [Swagger](http://localhost:8088/swagger-ui.html) - Documentation & Testing

## Files and Directories

The project (a.k.a. project directory) has a particular directory structure. A representative project is shown below:

```
.
├── StudyBuilder
├── src
│   └── main
│       └── java
│           ├── com.atos.studybuilder
│           ├── com.atos.studybuilder.config
│           ├── com.atos.studybuilder.controller
│           ├── com.atos.studybuilder.exception
│           ├── com.atos.studybuilder.model
│           ├── com.atos.studybuilder.util
│           ├── com.atos.studybuilder.repository
│           └── com.atos.studybuilder.service
├── src
│   └── main
│       └── resources
│           └── static
│           │   ├── css
│           │   │   └── bootstrap.css
│           │   ├── images
│           │   ├── js
│           │   ├── favicon.ico
│           │   └── index.html
│           ├── templates
│           │   └── view.html
│           ├── application.properties
│           ├── banner.txt
│           └── log4j2.xml
├── src
│   └── test
│       └── java
├── JRE System Library
├── Maven Dependencies
├── bin
├── logs
│   └── application.log
├── src
├── target
│   └──application-0.0.1-SNAPSHOT
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## packages

- `models` — to hold our entities;
- `repositories` — to communicate with the database;
- `services` — to hold our business logic;
- `controllers` — to listen to the client;

- `resources/` - Contains all the static resources, templates and property files.
- `resources/static` - contains static resources such as css, js and images.
- `resources/templates` - contains server-side templates which are rendered by Spring.
- `resources/application.properties` - It contains application-wide properties. Spring reads the properties defined in this file to configure your application. You can define server’s default port, server’s context path, database URLs etc, in this file.

- `test/` - contains unit and integration tests

- `pom.xml` - contains all the project dependencies
 
## Reporting Issues

This Project uses GitHub's integrated issue tracking system to record bugs and feature requests. If you want to raise an issue, please follow the recommendations below:

* Before you log a bug, please https://github.com/AnanthaRajuC/Spring-Boot-Application-Template/search?type=Issues[search the issue tracker]
  to see if someone has already reported the problem.
* If the issue doesn't already exist, https://github.com/AnanthaRajuC/Spring-Boot-Application-Template/issues/new[create a new issue]. 
* Please provide as much information as possible with the issue report.
* If you need to paste code, or include a stack trace use Markdown +++```+++ escapes before and after your text. 
  
## Resources



## License
[![FOSSA Status](#)