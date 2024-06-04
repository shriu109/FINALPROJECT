# Shopping System

## Overview
This project is a simplified shopping system demonstrating SOLID principles and design patterns.

## Components
- User Authentication
- Product Catalog
- Order Processing
- Payment Processing
- Logging

## Design Patterns
- Singleton
- Factory
- Builder

## Requirements
- Java 8 or above
- JUnit 4 for testing

## How to Run
1. Compile the project:
   
   javac -d bin src/*.java
2. Run the project:
    java bin main
3. Run tests:
java -cp bin---- ShoppingCartTest



User -> AuthenticationService: login(username, password)
AuthenticationService -> User: returns User

User -> ShoppingCart: addProduct(product)
User -> ShoppingCart: addProduct(product)

User -> OrderProcessor: createOrder(user)
OrderProcessor -> ShoppingCart: getProducts()
ShoppingCart -> OrderProcessor: returns List<Product>
OrderProcessor -> Order: new Order(user, products, totalAmount)

OrderProcessor -> PaymentGateway: processPayment(totalAmount)
PaymentGateway -> OrderProcessor: returns boolean (success/failure)

OrderProcessor -> Logger: log("Order processed for user " + user.getUsername())

OrderProcessor -> User: returns Order

