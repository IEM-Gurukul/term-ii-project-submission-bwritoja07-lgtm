# Online Quiz Engine using Factory Pattern

## 📌 Problem Statement
This project is an Online Quiz Engine that supports different types of questions like Multiple Choice Questions (MCQ) and True/False questions. The system uses the Factory Design Pattern to create question objects dynamically based on user input.

## 🎯 Target Users
- Students preparing for quizzes
- Beginners learning Java and OOP concepts

## ⚙️ Core Features
- Supports multiple question types (MCQ, True/False)
- Dynamic object creation using Factory Pattern
- Score calculation system
- Input validation and error handling

## 🧠 OOP Concepts Used
- **Abstraction:** Question is an abstract class
- **Inheritance:** MCQQuestion and TrueFalseQuestion extend Question
- **Polymorphism:** checkAnswer() behaves differently for each type
- **Encapsulation:** Data is handled inside classes

## 🏗️ Architecture Description
The system uses a Factory Pattern where QuestionFactory creates objects of different question types without exposing creation logic.

## ▶️ How to Run
1. Compile all Java files
2. Run Main.java
3. Answer the questions in console
4. Final score will be displayed