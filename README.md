# APIs
## Pre-requisites
### Download Docker
Go to https://docs.docker.com/get-docker/ and download Docker based on your machine's OS

Confirm that Docker is installed on your machine by running the following command:

```
docker --version
```

### Clone this repository to your local machine

```
git clone https://github.com/appstate-cisco-demos/api.git
```

## Local development pre-requisites
### Download Java 20.0.2
Go to https://www.oracle.com/java/technologies/javase/jdk20-archive-downloads.html and download Java based on your machine's OS

Confirm that Java is installed on your machine by running the following command:

```
java --version
```

## Running Docker containers

To deploy the api and initialize the database, run the following command:

```
docker compose up --build
```

## Stopping Docker containers

If you didn't detach from the docker-compose:

```
ctrl + c
```

If you detached from the docker-compose or are using another terminal:
```
docker compose down
```

## Using endpoints

This api contains [GET, PUT, POST, and DELETE](https://www.contrive.mobi/aviorapi/HTTPMETHODS.html) endpoints. To use them, you can either use [postman](https://www.postman.com/downloads/) (recommended) or curl

Example of curl command:

```
curl -X POST -H "Content-Type: application/json" -d '{"key1": "value1", "key2": "value2"}' http://example.com/api/endpoint
```