## Blog Post

:scroll: See this [blog post](https://jvdevlab.com/blog/jee/properties-loading) for more details about this project.

## Description

This [GitHub project](https://github.com/jvdevlab/jee-tomcat-properties-loading) demonstrates the difference between loading the common properties from the `tomcat/lib` folder versus loading them from an application-specific WAR file.

## Setup

- Install [Docker](https://docs.docker.com/get-docker/).
- Clone the repo.
- To build the app run:

```bash
docker compose up build
```

## Demo

- To start the app run:

```bash
docker compose up app
```

- Confirm property values were read from both places by opening <http://localhost:9090/app>.

![](https://jvdevlab.com/img/jee-tomcat-properties-loading/01.PNG)

## Cleanup

```bash
docker compose down
```
