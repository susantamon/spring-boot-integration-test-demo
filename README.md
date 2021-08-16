# Spring Boot Integration Test Demo
This demo project is intended to show different approaches with respect to usage of in-memory database in Integration Test phase of a Spring Boot application.

This example is focusing on Postgres Database, but the same concept can be extended to other databases as well.

## Good Old h2 Database
Add the following dependency
```xml
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>test</scope>
</dependency>
```
## Docker Container
Add the following dependency
```xml
<dependency>
    <groupId>io.zonky.test</groupId>
    <artifactId>embedded-database-spring-test</artifactId>
    <version>2.0.1</version>
    <scope>test</scope>
</dependency>
```
Add the following properties
```properties
zonky.test.database.postgres.docker.image=postgres:11-alpine
```
Add the following in Test class

    @AutoConfigureEmbeddedDatabase

## Native Library
Add the following dependency for ZONKY provider. There are other providers available, please check reference for more info.
```xml
<dependency>
    <groupId>io.zonky.test</groupId>
    <artifactId>embedded-database-spring-test</artifactId>
    <version>2.0.1</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>io.zonky.test</groupId>
    <artifactId>embedded-postgres</artifactId>
    <version>1.3.0</version>
    <scope>test</scope>
</dependency>
```
Add the following properties
```properties
zonky.test.database.provider=ZONKY
```
Add the following in Test class

    @AutoConfigureEmbeddedDatabase

## Run the Tests

    mvn -e clean test

## Source Code Repo
If you want to try it out, please check this GitHub Repo [Link](https://github.com/susantamon/spring-boot-integration-test-demo) for sample application.

## Reference
The power of [zonky](https://github.com/zonkyio/embedded-database-spring-test)