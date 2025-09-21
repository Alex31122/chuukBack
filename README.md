## Description
This is a basic project to understand and practice how to do a CRUD
on the framework for java Springboot.

There are two ways for you to execute this springboot app, the first one is configuring and installing postgres and java on your machine.

The second way to do it is using containers and docker, for this way you'll need docker and docker desktop installed on your machine.

## How to set up your system 

### Using Docker

If you use docker for run this web app you'll need to configure first docker, docker dektop in you system and maven.

After the proper configuration you'll need to create the jar file to execute the app:

    mvn clean package

After that comand you have to create the container with de help of docker compose:

    docker compose up --build

This will create and run the containers of postgres and springboot app.

Wait until you see the Spring ascii logo and the message started FirstCrudApplication in x seconds (process running for x)
