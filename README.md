# DecodeLabs_Java_P3
# Project 3: ATM Interface — Java (OOP)

The third project in the **DecodeLabs Java Programming Internship (Batch 2026)**. This project marks the shift from procedural scripts to **Object-Oriented Programming (OOP)** — using classes, objects, and encapsulation to model a real-world banking system.

## 📌 Description
This console-based Java program simulates a basic ATM interface using two classes: `BankAccount`, which encapsulates account data (balance, account number) and enforces business rules through private fields and public methods, and `DecodeLabs_Java_P3`, which handles the console-based menu and user interaction.

The program allows users to deposit, withdraw, and check their balance through a continuously running menu, until they choose to exit. All transactions are validated before processing — rejecting invalid amounts (zero or negative) and preventing withdrawals that exceed the current balance — ensuring the account's internal state can never become inconsistent.

## ✨ Features
- Menu-driven interface (Deposit / Withdraw / Check Balance / Exit) running in a loop
- Encapsulated `BankAccount` class with private fields and public getters/setters
- Input validation for both deposit and withdrawal amounts
- Insufficient balance protection on withdrawals
- Clear transaction feedback messages

## 🛠️ Concepts Used
- Classes & objects
- Encapsulation (private fields, public methods)
- Constructors
- Method design (getters, setters, business logic methods)
- Menu-driven loops (`do-while` + `switch`)
- Defensive input validation

## 🚀 How to Run
1. Clone this repository
2. Compile: `javac DecodeLabs_Java_P3.java`
3. Run: `java DecodeLabs_Java_P3`

## 👩‍💻 Author
**Anza Nawaz**
BS Software Engineering Student, University of Central Punjab (UCP)
