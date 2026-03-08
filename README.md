# springboot-order-calculation
Simple project built with Spring Boot that simulates an order system. The application calculates the final price of an order based on the base value, discount percentage, and shipping cost using service layer architecture.

# Order Processing with Spring Boot

## Overview

This project is a simple backend application built with Spring Boot. It demonstrates the use of dependency injection and a basic service-layer architecture to calculate the total cost of an order.

The application receives an order with a base value and discount percentage, calculates the discounted price, adds the shipping cost, and prints the final result to the console.

## Concepts Demonstrated

* Dependency Injection
* Service Layer Architecture
* Basic Object-Oriented Programming (OOP)
* Separation of Concerns
* Console execution using CommandLineRunner

## Technologies

* Java
* Spring Boot
* Maven

## Project Structure

```
src
 └─ main
     └─ java
         └─ com.desafio1.demo
             ├─ DemoApplication.java
             ├─ entities
             │   └─ Order.java
             └─ services
                 ├─ OrderService.java
                 └─ ShippingService.java
```
