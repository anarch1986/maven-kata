Maven Kata
===============

This is the Maven Kata project.

The aim of this project is to provide a frame for some simple Maven related exercises.

Project structure
-----

Project is build from three independent modules:

calculator-api:: provides a basic API for calculation
calculator-test:: verification code for the calculator

The assignment is to implement the calculator in a few, maven related steps (a little Java code with a lot of maven based steps).

Exercises
--

- Clone this project.
- Study the pom files and remove unneded things from them.
- Install locally: Install the `calculator-api` project locally with ```mvn clean install```
- Create new  maven project with based on `maven-archetype-quickstart` : ```mvn archetype:generate -DarchetypeArtifactId=maven-archetype-quickstart```

   Use the following parameters:
```
   groupId: com.example.maven.calculator
   artifactId: calculator
   version: 1.0-SNAPSHOT
```
    This project can be easily imported to any IDE. 


In the generated project adjust the following:

- set java `source` and `target` runtime to Java 8.0
- change the default `junit` to latest available version.
- add `calculator-api` as a dependency in the generated project
- Implement the calculator (Run the project with `mvnw clean package`)
- And don't forget the tests!
- Test the reference. Check with the reference `calculator-test` project if everything works fine.
  First build the project with skipping tests: `-DskipTest=true`. Depending which calculator you've implemented test it with run a desired test. For `Double` calculator run ``` mvn test -Dtest=DoubleCalculatorTest```
