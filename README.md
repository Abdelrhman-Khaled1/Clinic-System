# Clinic System - Microservices Architecture
This project is a clinic system built using Java Spring Boot in a microservices architecture. The application is modular, scalable, and resilient, leveraging various Spring Boot components and tools for effective communication, monitoring, and deployment.

## 🏥 Modules Overview
1. Doctor Service
    - Manages doctor-related operations like profiles, schedules, and availability.
    - Handles patient registration

2. Patient Service
   - Handles patient registration, profiles, and medical history.
   - Handles payments

3. Payment Service
   - Mocks the payment process for clinic services.

4. API Gateway
   - A single entry point for all client requests, routing them to the respective services.

5. Eureka Server
   - A service registry for enabling service discovery and communication.

6. Admin Server
   - Provides system monitoring and management functionalities.

## 💡 Key Features
* **Service Discovery**: <br/> -> Implemented using Eureka Server for dynamic service registration and discovery.
* **Communication Between Services**: <br/> -> Achieved with OpenFeign, simplifying RESTful communication.
* **API Gateway**: <br/> -> Centralized routing and request handling via Spring Cloud Gateway.
* **Circuit Breaker**: <br/> -> Ensured service resilience using Resilience4j for fallback mechanisms.
* **Monitoring**: <br/> -> Used Spring Boot Admin for real-time monitoring of service health and logs.
* **Logging and Analytics**: <br/> -> Integrated ELK Stack (Elasticsearch, Logstash, Kibana) for effective log management and analysis.
* **Containerization**: <br/> -> Dockerized all services for isolated and consistent deployments.
* **Kubernetes Deployment**: <br/> -> Added Kubernetes (K8s) scripts for deploying and managing services efficiently.

## 🛠️ Tech Stack
* Java
* Spring Boot
* Spring Cloud
* Docker
* Resilience4j
* Elasticsearch, Logstash, Kibana (ELK Stack)
* Kubernetes 

## Access the services:
* Eureka Dashboard: ``` http://localhost:8761 ```
* API Gateway: ``` http://localhost:7777 ```
* Spring Boot Admin: ``` http://localhost:8888 ```
* Kibana Dashboard: ``` http://localhost:5601 ```

## Check out the diagram below to see the workflow of a request: Client → Doctor Service → Patient Service.
![Clinic System PNG](https://github.com/user-attachments/assets/3b7af705-9061-4600-8eb5-25a780fc66d0)


## Testing on postman
[Clinic System Using API Gateway.postman_collection.json](https://github.com/user-attachments/files/18049740/Clinic.System.Using.API.Gateway.postman_collection.json)
