# Spring Boot World Demo

This is a demo of Spring Boot that shows some simple REST controllers and database calls.

To get running:

1. Install PostgreSQL (I'm running 9.3)
2. Setup user "postgres" with password "true"
3. Import the world.sql file in the root of repo into a database called "world" [e.g. "psql -U postgres world < world.sql" ]
4. Build & Run app with ./gradlew bootRun

And BOOM the app should be running on port 8080.

Send a Rest request with your browser like this: http://localhost:8080/greeting?name=Roger

It will echo your name back with a random country in JSON. Enjoy! :)
