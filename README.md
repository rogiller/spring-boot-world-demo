# World Service

This is a super awesome microservice that uses some cool stuff like Spring Boot & Gradle.

It's a simple microservice that provides access to some country data.

To get running:

1. Install PostgreSQL (I'm running 9.3)
2. Setup user "postgres" with password "true"
3. Import the world.sql file in the root of repo into a database called "world" [e.g. "psql -U postgres world < world.sql" ]
4. Build & Run app with ./gradlew bootRun

And BOOM the app should be running on port 8080.

Send a Rest request with your browser like this: http://192.168.1.15:8080/greeting?name=Roger

It will echo your name back with a random country in JSON. Enjoy! :)
