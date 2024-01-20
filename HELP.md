# Read Me First
The following was discovered as part of building this project:

* No Docker Compose services found. As of now, the application won't start! Please add at least one service to the `compose.yaml` file.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.1/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.1/maven-plugin/reference/html/#build-image)
* [Spring Boot Testcontainers support](https://docs.spring.io/spring-boot/docs/3.2.1/reference/html/features.html#features.testing.testcontainers)
* [Testcontainers R2DBC support Reference Guide](https://java.testcontainers.org/modules/databases/r2dbc/)
* [Docker Compose Support](https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#features.docker-compose)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#using.devtools)
* [Spring for GraphQL](https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#web.graphql)
* [WebSocket](https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#messaging.websockets)
* [Spring Batch](https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#howto.batch)
* [Resilience4J](https://docs.spring.io/spring-cloud-circuitbreaker/docs/current/reference/html/#configuring-resilience4j-circuit-breakers)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#web)
* [Hilla](https://hilla.dev/)
* [Vaadin](https://vaadin.com/docs)
* [Spring Reactive Web](https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#web.reactive)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#appendix.configuration-metadata.annotation-processor)
* [Spring Security](https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#web.security)
* [Spring Data R2DBC](https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#data.sql.r2dbc)
* [Spring Data JDBC](https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#data.sql.jdbc)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#actuator)
* [Spring REST Docs](https://docs.spring.io/spring-restdocs/docs/current/reference/html5/)
* [Testcontainers](https://java.testcontainers.org/)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a GraphQL service](https://spring.io/guides/gs/graphql-server/)
* [Using WebSocket to build an interactive web application](https://spring.io/guides/gs/messaging-stomp-websocket/)
* [Creating a Batch Service](https://spring.io/guides/gs/batch-processing/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Next Steps with Hilla](https://hilla.dev/docs/react/start/quick/#coming-from-spring-initializr)
* [Creating CRUD UI with Vaadin](https://spring.io/guides/gs/crud-with-vaadin/)
* [Building a Reactive RESTful Web Service](https://spring.io/guides/gs/reactive-rest-service/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [Accessing data with R2DBC](https://spring.io/guides/gs/accessing-data-r2dbc/)
* [Using Spring Data JDBC](https://github.com/spring-projects/spring-data-examples/tree/master/jdbc/basics)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)

### Additional Links
These additional references should also help you:

* [R2DBC Homepage](https://r2dbc.io)

## GraphQL code generation with DGS

This project has been configured to use the Netflix DGS Codegen plugin.
This plugin can be used to generate client files for accessing remote GraphQL services.
The default setup assumes that the GraphQL schema file for the remote service is added to the `src/main/resources/graphql-client/` location.

You can learn more about the [plugin configuration options](https://github.com/deweyjose/graphqlcodegen) and
[how to use the generated types](https://netflix.github.io/dgs/generating-code-from-schema/) to adapt the default setup.


### Docker Compose support
This project contains a Docker Compose file named `compose.yaml`.

However, no services were found. As of now, the application won't start!

Please make sure to add at least one service in the `compose.yaml` file.

## Missing R2DBC Driver

Make sure to include a [R2DBC Driver](https://r2dbc.io/drivers/) to connect to your database.
### Testcontainers support

This project uses [Testcontainers at development time](https://docs.spring.io/spring-boot/docs/3.2.1/reference/html/features.html#features.testing.testcontainers.at-development-time).

Testcontainers has been configured to use the following Docker images:


Please review the tags of the used images and set them to the same as you're running in production.

