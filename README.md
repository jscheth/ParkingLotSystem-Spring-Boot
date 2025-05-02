# 🚗 Parking Lot System (Spring Boot - Java 23)

This is a learning-focused Parking Lot System implemented in **Java 23** using **Spring Boot**. It demonstrates key object-oriented principles and modular design following a basic Low-Level Design (LLD) approach.

---

## 📆 Status

> **Currently:** Core service logic is implemented. No REST controller yet. Ready for integration with web endpoints.

---

## 🛠️ Features

* Vehicle assignment and unassignment to parking spots
* Availability tracking at level-wise parking
* Rate-based invoice calculation (Hourly, Daily, Weekly, Monthly)

---

## 🚀 Technologies Used

* Java 23
* Spring Boot
* Gradle

---

## 📂 Project Structure

```bash
src/main/java/
├── model/        # Domain models like Vehicle, ParkingSpot, Invoice
├── service/      # Business logic in ParkingLotSystem (Spring @Service)
└── controller/   # (Planned) REST API controllers
```

---

## 🚧 Upcoming Improvements

* Add REST API endpoints for parking actions
* Introduce in-memory data storage or simple persistence
* Unit and integration tests

---

## 📅 Example Use Cases (planned via API)

* Assign a vehicle to a spot
* Free a parking spot
* Display available spots by level
* Calculate parking fee based on duration

---

## 🎓 Learning Objectives

* Understand how to structure OOP systems
* Practice encapsulation and domain modeling
* Learn Spring Boot fundamentals (Dependency Injection, REST controllers, services)

---

## 📚 License

This project is provided for educational purposes under the MIT License.
