# ATM Simulator System

A Java Swing-based ATM simulator application that connects to a MySQL database for user registration, login, deposits, withdrawals, fast cash, mini statements, balance enquiry, and PIN management.

## Features

- User registration and account setup
- Login authentication using PIN
- Cash deposit and withdrawal
- Fast cash options
- Mini statement display
- Balance enquiry
- PIN change support
- Uses MySQL database for persistent storage

## Project Structure

- `src/ASimulatorSystem/` — Java Swing source files
- `lib/` — third-party libraries (MySQL Connector/J)
- `build/classes/` — compiled class files
- `nbproject/` — NetBeans project metadata

## Requirements

- Java JDK 8 or later
- MySQL server
- `mysql-connector-j-8.0.33.jar`

## Database Setup

Create a database named `bankmanagementsystem` and the required tables. Example schema for the `bank` table:

```sql
CREATE DATABASE IF NOT EXISTS bankmanagementsystem;
USE bankmanagementsystem;

CREATE TABLE IF NOT EXISTS bank (
  pin VARCHAR(20),
  trans_date DATETIME,
  type VARCHAR(50),
  amount VARCHAR(50)
);
```

The app also expects tables for user registration and login such as `signup`, `signup2`, `signup3`, and `login`.

## Configuration

Update the MySQL connection settings in `src/ASimulatorSystem/Conn.java` if needed:

```java
c = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/bankmanagementsystem?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
    "root",
    "your_password"
);
```

## Build and Run

From the project root, compile the source files:

```bash
javac -d build/classes -cp "lib/mysql-connector-j-8.0.33.jar;." src/ASimulatorSystem/*.java
```

Run the application:

```bash
java -cp "build/classes;lib/mysql-connector-j-8.0.33.jar" ASimulatorSystem.Login
```

## Notes

- The project was originally created with NetBeans and includes `nbproject` metadata.
- Ensure the MySQL Connector/J JAR is available on the runtime classpath.
- If any `datetime` or schema mismatch errors occur, verify that the `bank` table uses `trans_date` as a `DATETIME` column.

## License

This project is provided as-is for educational purposes.

