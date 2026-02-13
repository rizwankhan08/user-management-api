# 🚀 User Management API

A **production-ready Spring Boot REST API** for managing users.

Built using clean architecture principles with DTOs, validation, global exception handling, and Swagger documentation — designed like a real-world backend project.

---

## 📌 Features

* ✅ CRUD Operations (Create, Read, Update, Delete)
* ✅ Layered Architecture (Controller → Service → Repository)
* ✅ DTO Pattern
* ✅ Validation using Jakarta Validation
* ✅ Global Exception Handling
* ✅ MySQL Integration
* ✅ Swagger (OpenAPI) Documentation
* ✅ Production-ready Structure

---

## 🛠 Tech Stack

| Technology          | Version   |
| ------------------- | --------- |
| Java                | 17        |
| Spring Boot         | 3.2.x     |
| Spring Data JPA     | Latest    |
| MySQL               | 8+        |
| Lombok              | Yes       |
| Swagger (SpringDoc) | OpenAPI 3 |
| Maven               | 3.9+      |

---

## 📂 Project Structure

```
com.rizwan.userapi
│
├── controller
│   └── UserController.java
│
├── service
│   └── UserService.java
│
├── repository
│   └── UserRepository.java
│
├── entity
│   └── User.java
│
├── dto
│   └── UserDTO.java
│
├── exception
│   ├── GlobalExceptionHandler.java
│   └── ResourceNotFoundException.java
│
└── PortfolioProjectApplication.java
```

---

## 🔗 API Endpoints

| Method | Endpoint          | Description   |
| ------ | ----------------- | ------------- |
| POST   | `/api/users`      | Create User   |
| GET    | `/api/users`      | Get All Users |
| PUT    | `/api/users/{id}` | Update User   |
| DELETE | `/api/users/{id}` | Delete User   |

---

## 📘 Swagger Documentation

After running the application:

```
http://localhost:8080/swagger-ui.html
```

OR

```
http://localhost:8080/swagger-ui/index.html
```

---

## ⚙️ How to Run Locally

### 1️⃣ Clone Repository

```bash
git clone https://github.com/rizwankhan08/user-management-api.git
cd user-management-api
```

---

### 2️⃣ Configure Database

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/userdb
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### 3️⃣ Build Project

```bash
mvn clean install
```

---

### 4️⃣ Run Application

```bash
mvn spring-boot:run
```

OR

```bash
java -jar target/userapi-0.0.1-SNAPSHOT.jar
```

---

## 🧪 Example JSON Request

### Create User

```json
{
  "name": "Rizwan Khan",
  "email": "rizwan@gmail.com"
}
```

---

## 📦 Production-Ready Practices Used

* DTO Layer (No direct Entity exposure)
* Centralized Exception Handling
* Clean Code Structure
* Validation Annotations
* RESTful Naming Conventions

---

## 🌍 Deployment

You can deploy this API easily on:

* Render
* Railway
* AWS
* Azure
* DigitalOcean

---

## 👨‍💻 Author

**Rizwan Khan**

GitHub:
[https://github.com/rizwankhan08](https://github.com/rizwankhan08)

---
## ⭐ If you like this project
Give it a ⭐ on GitHub!
