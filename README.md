Session 1
Exercise 1
Installed and verified the toolchain carefully.
Exercise 2
Written my first Hello World Java program where I modified it and printed out my name and current date using hardcoded string.
I also declared variable of different data types and printed each one with a descriptive label
I experienced type casting where I found out Wide casting or Implicit casting and also seen about Truncation
Type casting was about taking values from a small container to a wide container and vise versa
Exercise 3
The Temperature Converter is working properly and its results is verified using known benchmarks 
Exercise 4
A Command Line Interface (CLI) Calculator that:
- Read two numbers using Scanner.
- Reads an operator (+, -, *,/)
- Performs the selected operation using an if/else chain.
- Handles division by zero by printing a user-friendly error message instead of crashing.
  - Prints out a user-friendly error message requesting the user to use a valid operator whenever the entered operator is invalid.
  To Compile and Run the CLI Calculator use:
  From the project root directory:
  Compile:
  javac -d out src/main/java/Session1/Exercise4/CLI_Calculator.java
  Run:
  java -cp out Session1.Exercise4.CLI_Calculator

Session 2
Exercise 1
This exercise implements the classic FizzBuzz problem. The program iterates through the numbers from 1 to 100 and applies:
- If a number is divisible by both 3 and 5, it prints "FizzBuzz".
- If a number is divisible only by 3, it prints "Fizz".
- If a number is divisible only by 5, it prints "Buzz".
Otherwise, it prints the number itself and used:
- for loops
- Conditional statements (if, else if, else)
- Logical operators (&&)
- The modulus operator (%) for checking divisibility
  From the project root directory:
  Compile:
  javac -d out src/main/java/Session2/Exercise1/FizzBuzz.java
  Run:
  java -cp out Session2.Exercise1.FizzBuzz

Exercise 2
This exercise demonstrates how to print a right-angled triangle pattern of asterisks (`*`).
The following concepts and operations were used:
- Used an outer for loop to control the number of rows (from 1 to 8).
- Used an inner for loop (nested loop) to determine how many asterisks are printed on each row.
- Used `System.out.print("*")` to display asterisks on the same line.
- Used `System.out.println()` to move to the next line after completing each row.
* Practised nested loops, loop control, and pattern printing techniques in Java.
  From the project root directory:
  Compile:
  javac -d out src/main/java/Session2/Exercise1/AsterisksTriangle.java
  Run:
  java -cp out Session2.Exercise1.AsterisksTriangle

Exercise 3
This exercise prints a hollow diamond pattern using asterisks (`*`). The diamond is generated through a method named
printDiamond(int size), where the size parameter determines the height and width of the diamond. By changing the
value passed to the method, the program can produce larger or smaller diamonds without modifying the core logic.
This involved:
- Method creation and method parameters
- Nested for loops
- Pattern generation using loops
- Conditional statements (if and else)
- Working with spaces and character positioning
- Building symmetrical shapes algorithmically
- Breaking a complex problem into smaller logical parts
  From the project root directory:
  Compile:
  javac -d out src/main/java/Session2/Exercise1/AsterisksDiamond.java
  Run:
  java -cp out Session2.Exercise1.AsterisksDiamond
