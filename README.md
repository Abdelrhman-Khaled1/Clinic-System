# Clinic System - Microservices Architecture
This project is a clinic system built using Java Spring Boot in a microservices architecture. The application is modular, scalable, and resilient, leveraging various Spring Boot components and tools for effective communication, monitoring, and deployment.

## 🏥 Modules Overview
1. Doctor Service
    - Manages doctor-related operations like profiles, schedules, and availability.

2. Patient Service
   - Handles patient registration, profiles, and medical history.

3. Payment Service
   - Mocks the payment process for clinic services.

4. API Gateway
   - A single entry point for all client requests, routing them to the respective services.

5. Eureka Server
   - A service registry for enabling service discovery and communication.

6. Admin Server
   - Provides system monitoring and management functionalities.

## 💡 Key Features
* **Service Discovery**: Implemented using Eureka Server for dynamic service registration and discovery.
* **Communication Between Services**: Achieved with OpenFeign, simplifying RESTful communication.
* **API Gateway**: Centralized routing and request handling via Spring Cloud Gateway.
* **Circuit Breaker**: Ensured service resilience using Resilience4j for fallback mechanisms.
* **Monitoring**: Used Spring Boot Admin for real-time monitoring of service health and logs.
* **Logging and Analytics**: Integrated ELK Stack (Elasticsearch, Logstash, Kibana) for effective log management and analysis.
* **Containerization**: Dockerized all services for isolated and consistent deployments.

## 🛠️ Tech Stack
* Java
* Spring Boot
* Spring Cloud
* Docker
* Resilience4j
* Elasticsearch, Logstash, Kibana (ELK Stack)


## 🚀 Next Steps

* Kubernetes (K8s): Plan to integrate the project with Kubernetes for orchestration and scaling.


## Access the services:
* Eureka Dashboard: ``` http://localhost:8761 ```
* API Gateway: ``` http://localhost:8080 ```
* Spring Boot Admin: ``` http://localhost:8081 ```
* Kibana Dashboard: ``` http://localhost:5601 ```
