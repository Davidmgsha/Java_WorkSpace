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
  javac -d out src/main/java/session1/exercise4/CLI_Calculator.java
  Run:
  java -cp out session1.exercise4.CLI_Calculator

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
  javac -d out src/main/java/session2/exercise1/FizzBuzz.java
  Run:
  java -cp out session2.exercise1.FizzBuzz

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
  javac -d out src/main/java/session2/exercise1/AsterisksTriangle.java
  Run:
  java -cp out session2.exercise1.AsterisksTriangle

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
  javac -d out src/main/java/session2/exercise1/AsterisksDiamond.java
  Run:
  java -cp out session2.exercise1.AsterisksDiamond

2. Number Guessing Game
This project is a simple Java console application that implements a Number Guessing Game.
The program randomly generates a secret number between 1 and 100 and allows the user to
guess the number within a limited number of attempts.
Features in:
- Generated a random number between 1 and 100 using Math.random()
- Used the Scanner class to read user input from the keyboard.
- Implemented a while loop to repeatedly prompt the user for guesses.
- Compared the user's guess with the secret number and displayed:
  - "Too high!" if the guess is greater than the secret number.
  - "Too low!" if the guess is less than the secret number.
  - "Correct!" if the guess matches the secret number.
- Counted the number of attempts made by the user.
- Limited the player to a maximum of 10 attempts.
- Displayed the remaining attempts after each incorrect guess.
- Provided a performance summary when the user wins.
- Revealed the secret number when the user runs out of attempts.
- Added a replay option to allow the user to start a new game without restarting the program.
- Used conditional statements (if-else) and boolean variables to control the game flow.
- Closed the Scanner object properly after the game ends.

From the project root directory:
Compile:
javac -d out src/main/java/session2/exercise2/GuessingGame.java
Run:
java -cp out session2.exercise2.GuessingGame

3. Grade Classifier
   Created a static method classify(int score) that returns a grade as a String.
   Implemented grade classification according to the following ranges:
- A : 90 and above
- B : 75 – 89
- C : 60 – 74
- D : 50 – 59
- F : Below 50
- Overloaded the method with classify(double percentage) to support decimal percentages.
- Used if-else-if statements to determine the appropriate grade.
- Returned the grade as a String.
- Tested both methods in the main() method.
- Classified a range of integer scores and decimal percentages.
- Printed the score/percentage together with its corresponding grade.
- Demonstrated the concept of method overloading in Java.
- Used arrays and enhanced for loops to iterate through test values.

From the project root directory:
Compile:
javac -d out src/main/java/session2/exercise3/GradeClassifier.java
Run:
java -cp out session2.exercise3.GradeClassifier

4. RecursiveVsIterative

This project demonstrates the implementation and comparison of iterative and recursive approaches for calculating factor
ial and Fibonacci numbers in Java.

Composed of:
- Implemented an iterative version of factorial(int n).
- Implemented a recursive version of factorial(int n).
- Implemented an iterative version of fibonacci(int n).
- Implemented a recursive version of fibonacci(int n).
- Tested both implementations for values of n from 0 to 15.
- Verified that the iterative and recursive versions produce identical results.
- Used AssertionError to detect mismatched results.
- Printed the results of each comparison to the console.
- Added comments explaining why deep recursion can cause a StackOverflowError.
- Discussed why recursive Fibonacci is inefficient due to repeated calculations.
- Used the long data type to accommodate larger factorial values.- 

Sample Output
Factorial Comparison
n = 0 Iterative = 1 Recursive = 1
n = 1 Iterative = 1 Recursive = 1
n = 2 Iterative = 2 Recursive = 2
n = 3 Iterative = 6 Recursive = 6
...
n = 15 Iterative = 1307674368000 Recursive = 1307674368000

Fibonacci Comparison
n = 0 Iterative = 0 Recursive = 0
n = 1 Iterative = 1 Recursive = 1
n = 2 Iterative = 1 Recursive = 1
n = 3 Iterative = 2 Recursive = 2
....
n = 15 Iterative = 610 Recursive = 610

From the project root directory:
Compile:
javac -d out src/main/java/session2/exercise4/RecursiveVsIterative.java
Run:
java -cp out session2.exercise4.RecursiveVsIterative

Session 3
Exercise1
Student Grade Tracker
Description
A simple Java program that stores multiple grades for each student using a `HashMap` and `ArrayList`.
Features:
- Add grades for students.
- Calculate each student's average grade.
- Find the top-performing student.
- Display a report of students, their grades, and averages.
Concepts Used: 
- HashMap
- ArrayList
- Methods
- Enhanced for-each loop
- Map.Entry
From the project root directory:
Compile:
javac -d out src/main/java/session3/exercise1/StudentGradeTracker.java
Run:
java -cp out session3.exercise1.StudentGradeTracker