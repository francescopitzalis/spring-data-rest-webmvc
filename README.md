# Spring Data REST Exporter Example

This deployable web application is an example project that illustrates how to deploy your own artifacts into a WAR that uses the [Spring Data REST Exporter](https://github.com/SpringSource/spring-data-rest).

### Use

Either use this project as a template for your own project, or simply include your own artifacts as dependencies in the `pom.xml` file.

The easiest way to get going with the REST exporter is to simply run the embedded Jetty servlet container:

    mvn jetty:run

This will expose a server at `http://localhost:8080/`. Issue curl requests to find out what services are available.

Alternatively, you can build a WAR file using `mvn package`, and deploy that into your servlet container.