# **FizzBuzz Application**
A simple Java application that implements the classic **FizzBuzz** problem and demonstrates modular programming using classes.
## **Table of Contents**
1. [Introduction](#introduction)
2. [Features](#features)
3. [Technologies Used](#technologies-used)
4. [Project Structure](#project-structure)
5. [How to Run](#how-to-run)
6. [Examples](#examples)
7. [Contributing](#contributing)
8. [License](#license)

## **Introduction**
This repository contains a Java implementation of the famous **FizzBuzz** problem. It also demonstrates Java basics, including:
- Use of loops
- String manipulation
- Modular programming with separate classes

The program calculates the FizzBuzz sequence for a given range and outputs corresponding results:
- Numbers divisible by 3 are replaced with `"Fizz"`.
- Numbers divisible by 5 are replaced with `"Buzz"`.
- Numbers divisible by both 3 and 5 are replaced with `"FizzBuzz"`.

## **Features**
- Calculates FizzBuzz for a defined range of numbers.
- Demonstrates modular class usage with separate files.
- Beginner-friendly code with clear comments.
- Easy to understand and extend for further functionality.

## **Technologies Used**
- **Language**: Java 21
- **Build Tools**: None (pure Java implementation, but you can integrate with Gradle or Maven if needed)
- **IDE**: IntelliJ IDEA (recommended)

## **Project Structure**
The project consists of two main files:
``` 
src/
 ├── org.fxexchange/
 │    ├── FizzBuzz.java   // The main Java file containing the main() method
 │    ├── Helper.java     // A helper class with additional functionality
```
1. **FizzBuzz.java**
    - Contains the `main()` method for execution.
    - Implements the FizzBuzz logic in a function that takes the range as input.

2. **Helper.java**
    - A modular class used to provide helper methods (e.g., printing messages).

## **How to Run**
Follow these steps to clone and run the project:
### **Clone the Repository**
1. Open your terminal or command prompt.
2. Run the following command:
``` 
   git clone https://github.com/your-username/your-repo-name.git
```
1. Navigate to the project directory:
``` 
   cd your-repo-name
```
### **Run the Application**
#### Using an IDE (IntelliJ IDEA)
1. Open the project folder in IntelliJ IDEA.
2. Navigate to `FizzBuzz.java`.
3. Click the **Run** button next to the `main` method.

#### Using Command Line
1. Compile the files:
``` bash
   javac org/fxexchange/FizzBuzz.java org/fxexchange/Helper.java
```
1. Run the main class:
``` bash
   java org.fxexchange.FizzBuzz
```
## **Examples**
Here’s what the program does:
1. The `FizzBuzz` function takes a number `n` (e.g., 15).
2. It prints:
``` 
   [1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]
```
### **Usage of Helper Class**
The `Helper` class also demonstrates modular usage:
- You can use it to print custom messages.

For example:
``` java
Helper helper = new Helper();
helper.printMessage("Running the FizzBuzz program!");
```
## **Contributing**
Contributions, fixes, and suggestions are welcome! Here's how you can contribute:
1. Fork this repository.
2. Create a branch (`git checkout -b feature-name`).
3. Commit your changes (`git commit -m "Add feature-name"`).
4. Push to the branch (`git push origin feature-name`).
5. Open a Pull Request.

## **License**
This project is licensed under the [MIT License](https://opensource.org/licenses/MIT). You are free to use, modify, and distribute this code, as long as the original license is included.
## **Contact**
Feel free to reach out if you have any questions or need assistance:
- **Author**: [Your Name]
- **Email**: your.email@example.com
- **GitHub**: [your-github-profile](https://github.com/atorpos)

Let me know if you'd like to refine it further or add specific sections! 😊
