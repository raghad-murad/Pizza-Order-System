# 🍕 Pizza Order System

A JavaFX application that allows users to place pizza orders, calculate prices based on toppings and size, and manage order details.

## 📑 Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [How to Run](#how-to-run)
- [Code Structure](#code-structure)

## 🌟 Overview

This project is a JavaFX-based application designed to simulate a pizza ordering system. The application allows users to:
- Place pizza orders with customizable toppings and sizes.
- Calculate the total price of an order based on selected options.
- Manage multiple orders and print them out.

The project is divided into two phases:
- **Phase I:** Core functionality implemented using Java classes.
- **Phase II:** User interface developed using JavaFX for a more interactive experience.

## ✨ Features

### Phase I
- **Pizza Ordering:** Basic logic for creating and managing pizza orders.
- **Toppings and Sizes:** Ability to select different toppings and pizza sizes.
- **Price Calculation:** Calculates the total price based on selected options.

### Phase II
- **JavaFX Interface:** Interactive GUI for placing orders.
- **Order Management:** Allows users to process orders, print order details, and reset forms.
- **Dynamic Pricing:** Automatically updates the order price as toppings and sizes are selected.

## ⚙️ Technologies Used

- **Programming Language:** Java
- **GUI Framework:** JavaFX
- **IDE:** IntelliJ IDEA
- **Tools:** JavaFX SDK 21.0.6

## 🏃‍♀️ How to Run

### Prerequisites
- Ensure you have Java installed on your system.
- Install JavaFX SDK 21.0.6.
- Use an IDE like IntelliJ IDEA or Eclipse (optional).

### Steps to Run

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/pizza-order-system.git
   cd pizza-order-system
   ```

2. **Compile the Program:**
   - Open the project in your IDE.
   - Build the project to compile the `.java` files.

3. **Run the Program:**
   - Execute the `Main` class as the entry point.
   - Alternatively, use the command line:
     ```bash
     # Compile the program
     javac --module-path "path/to/javafx-sdk-21.0.6/lib" --add-modules javafx.controls,javafx.fxml Main.java

     # Run the program
     java --module-path "path/to/javafx-sdk-21.0.6/lib" --add-modules javafx.controls,javafx.fxml -cp . Main
     ```

4. **Instructions:**
   - Upon running the application, you will see a welcome screen.
   - Click "Order now!" to proceed to the order form.
   - Select customer name, order type, pizza size, and toppings.
   - The total order price will be calculated dynamically.
   - Click "Process Order" to save the order.
   - Use "Print Orders" to view all placed orders.
   - Use "Reset" to clear the form fields.

### Notes
- Replace `"path/to/javafx-sdk-21.0.6/lib"` with the actual path to your JavaFX SDK directory.
- Ensure that the JavaFX modules (`javafx.controls`, `javafx.fxml`) are correctly added.

## 🧩 Code Structure

The project is organized into two main phases:

### Phase I
- **Core Classes:**
  - `PizzaOrder`: Represents a pizza order with details like toppings, size, and price.
  - `Delivery`: Handles delivery-related logic.
  - `ToGo`: Handles takeout orders.
  - `Driver`: Contains the main logic for managing orders.

### Phase II
- **JavaFX Interface:**
  - **Main.java:** Entry point of the application.
  - **PizzaOrderProject:** Contains the JavaFX components and logic.
  - **src Folder:** Includes all Java source files.
  - **lib Folder:** Contains the JavaFX SDK libraries.

## 🤝 Contact

If you have any questions or suggestions, feel free to reach out!

- **Email:** raghadmbuzia@gmail.com
- **LinkedIn:** [in/raghad-murad](http://linkedin.com/in/raghad-murad-02690433a)

---

### Thank you for checking out this project! 🚀
