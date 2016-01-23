# World Service

This is a super awesome microservice that uses some of the cool stuff like Spring Boot & Gradle.

It's a simple microservice that provides access to some country data.

To get runnning:

1. Install PostgreSQL (I'm running 9.3)
2. Setup user "postgres" with password "true"
3. Import the world.sql file in the root of repo into a database called "world"
4. Build app with ./gradlew build
5. Run app with java -jar build/libs/world-service-0.0.1-SNAPSHOT.jar

And BOOM the app should be running on port 80.

Send a Rest request like this: http://192.168.1.15:8080/greeting?name=Roger

It will echo your name back with a random country in JSON. Enjoy! :)
