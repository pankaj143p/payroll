# Employee Payroll Application - Spring Boot with JPA

## Overview:
This is a simple Spring Boot application that manages an employee payroll system. It uses **Spring Data JPA** to interact with a **MySQL** database and provides a REST API to perform CRUD operations on employee data.

### Features:
- **Create Employee**: Add new employee records.
- **Get All Employees**: Retrieve a list of all employees.
- **Update Employee**: Modify existing employee records.
- **Delete Employee**: Remove employee records.
- **Employee Validation**: Validates employee data using annotations.

---

## Prerequisites:
Before running the application, make sure you have the following installed:
- **Java 21** or later
- **Spring Boot 3.x**
- **MySQL** (installed and running)
- **Maven** (for building the project)

---

## Database Setup:

Create a MySQL database to store employee data:

```sql
CREATE DATABASE payroll_db;

