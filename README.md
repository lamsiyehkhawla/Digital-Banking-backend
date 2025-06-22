# 🏦 E-Banking Backend

This is a Spring Boot backend application that simulates a basic e-banking system with features like customer creation, current and saving accounts, and account operations (credit/debit). It uses an in-memory H2 database and demonstrates object-relational mapping (ORM) with Spring Data JPA.

## 📦 Project Structure

- **Domain Models**: `Customer`, `BankAccount`, `CurrentAccount`, `SavingAccount`, `AccountOperation`
- **Enum Types**: `AccountStatus`, `OperationType`
- **Repositories**: Spring Data JPA interfaces for DB access
- **Data Initialization**: Preloads sample customers and accounts using `CommandLineRunner`

## 🧰 Technologies Used

- Java 11
- Spring Boot 3.5.3
- Spring Data JPA
- H2 Database (in-memory)
- Maven
- Lombok

## 🗂️ Modules

### Entity Classes
- `Customer`: Bank client
- `BankAccount` (abstract): Base class for accounts
    - `CurrentAccount`: With overdraft
    - `SavingAccount`: With interest rate
- `AccountOperation`: Represents credit or debit on an account

### Enum Types
- `AccountStatus`: CREATED, ACTIVATED, SUSPENDED
- `OperationType`: DEBIT, CREDIT

## 🚀 Getting Started

### Prerequisites

- Java 11+
- Maven 3.6+

### Running the App

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/ebanking-backend.git
   cd ebanking-backend
📄 License
This project is for educational purposes. Feel free to fork and adapt it.

👩‍💻 Author
Khawla Lamsiyeh – Spring Boot & Java Backend Enthusiast