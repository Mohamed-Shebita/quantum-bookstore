![Screenshot 2025-07-13 005110](https://github.com/user-attachments/assets/aa6fc138-992e-49cd-b5ba-4319e9895771)
# 📚 Quantum Bookstore using Java

This repository contains the implementation of the Quantum Bookstore, a Java-based console application developed as part of the Fawry N² Dev Slope Challenge.

## 🚀 Project Overview

The Quantum Bookstore supports:
- Managing multiple types of books: `PaperBook`, `EBook`, and `ShowcaseBook`
- Buying books based on ISBN and type
- Stock control for physical books
- Outdated book filtering by publication year
- Simulated shipping and email delivery

## 🧱 Technologies Used

- Java 21
- Maven 
- IntelliJ IDEA 

## 💡 Key OOP Concepts Applied

- **Abstraction** via the abstract base class `Book`
- **Inheritance** with specific types of books (`PaperBook`, `EBook`, `ShowcaseBook`)
- **Encapsulation** of book properties and behaviors
- **Polymorphism** to handle book operations based on their type
- Simple service layer (`ShippingService`, `MailService`) to simulate integration.
