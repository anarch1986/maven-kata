# Maven Kata


The aim of this project is to provide a frame for some simple 
Maven related exercises.

### Project structure

Project is build from three independent modules:

- calculator: The main app, uses interfaces from `calculator-api`. 
You need  to create this project.
- calculator-api: provides a basic API for a calculator app.
- calculator-test: tests for the app. 

The assignment is to implement the calculator in a few, maven related steps 
(a little Java code with a lot of maven based steps).

### Exercises

1. Install Maven, if its not on your PC yet (You can use apt on Ubuntu). 
Verify that its installed by running `mvn -v` in a terminal.
1. Clone this project.
1. Create new  maven project in the root folder with `maven-archetype-quickstart`: 
`mvn archetype:generate -DarchetypeArtifactId=maven-archetype-quickstart`
   Use the following parameters:
```
   groupId: com.example.maven.calculator
   artifactId: calculator
   version: 1.0-SNAPSHOT
``` 

Make a new empty project in IDEA and import all 3 Maven projects as 
existing modules from the `pom.xml` files.    
You might need to install your new calculator project, you can do 
this either from the console (see below) or in the `Maven Projects` tab in IDEA 
(its on the right side)    
In the `pom.xml` files adjust the following:

1. Study the pom files and remove unneeded dependencies from them.
1. set java `source` and `target` runtime to Java 8.0.    
1. Install locally: Install the `calculator-api` project locally with 
```mvn clean install```. You can verify that its installed by 
checking in your `<home>/.m2` folder.
1. change `junit` to latest available version (find it on Maven Central).
1. add `calculator-api` as a dependency in the generated project
1. Implement the calculator (Run the project with `mvn clean package`)
1. Test the code: Check with the reference `calculator-test` project if 
everything works fine.
  First build the project with skipping tests: `-DskipTest=true`. Depending 
  which calculator you've implemented test it with run a desired test. 
  For `Double` calculator run ``` mvn test -Dtest=DoubleCalculatorTest```
1. Bonus exercise: compress your build directory into a `.rar` file with the
 `rar` Maven plugin.  
