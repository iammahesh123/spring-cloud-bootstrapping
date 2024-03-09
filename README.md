# Spring Cloud Bootstrapping Demo

This project demonstrates the concept of bootstrapping in a Spring Cloud environment using Spring Cloud Config Server.

## Overview

Bootstrapping in Spring Cloud refers to the process of initializing the application's context and obtaining its configuration before the main application starts. Spring Cloud Config Server plays a crucial role in bootstrapping by providing centralized configuration management for distributed applications.

In this demo, we'll showcase how to set up a Spring Cloud Config Server and how client applications can bootstrap their configurations from it.

## Features

- Setup of Spring Cloud Config Server
- Configuration of client applications to bootstrap their configurations from the Config Server
- Demonstration of how changes in configurations are dynamically refreshed in client applications

## Project Structure

- `config-server`: Contains the Spring Cloud Config Server application.
- `client-app`: Contains a sample client application that bootstraps its configurations from the Config Server.

## Usage

1. Clone the repository:

```bash
git clone https://github.com/iammahesh123/spring-cloud-task-demo.git
```
2. Navigate to the project directory:
 ```bash
  cd spring-security-csrf-demo
 ```
3. Build the project using Maven:
 ```bash
mvn clean package
 ```
4. Run the application:
```bash
mvn run
 ```
5. Access the application in your web browser: http://localhost:8080
6. Modify configurations in the Config Server and observe how they are dynamically refreshed in the client application.

## Configuration
- application.properties: Contains configurations for the Config Server and bootstrapping configuration.
## Dependencies
- Java 8 or higher
- Spring Boot
- Spring Cloud Config
- Maven
## Contributing
Contributions are welcome. Please fork the repository, make your changes, and submit a pull request.

## License
This project is licensed under the MIT License.
