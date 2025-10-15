# ATM Simulator

This is a simple console-based ATM (Automated Teller Machine) simulator application written in Java. It allows users to perform basic banking operations such as checking their balance, depositing funds, and withdrawing funds. The application also persists the account balance to a file, so the balance is remembered between sessions.

## Features

*   **User Login (via Username):** Greet the user by their entered name.
*   **Account Creation:** Automatically generates an account for the user upon starting the session.
*   **Deposit:** Add funds to the account.
*   **Withdraw:** Remove funds from the account (with insufficient balance check).
*   **Check Balance:** Display the current account balance.
*   **Balance Persistence:** Saves the account balance to a file when the application quits and loads it upon startup.

## How to Run

### Prerequisites

*   Java Development Kit (JDK) 11 or higher.

### Steps

1.  **Save the Code:** Ensure `Main.java`, `User.java`, and `Account.java` (if they are separate files, otherwise, they are all in `Main.java` as per your provided code) are in a directory structure that matches their package declaration (`org.example`). For example, `src/main/java/org/example/Main.java`.
2.  **Create Resources Folder:** The application expects a `resources` folder for saving/loading the account balance. Create the following directory:
    `./src/main/resources/`
3.  **Compile:** Open a terminal or command prompt, navigate to the `src/main/java` directory, and compile the Java files:

    ```bash
    javac org/example/*.java
    ```

    (If you are in the project root, you might need to adjust the path, e.g., `javac src/main/java/org/example/*.java`)

4.  **Run:** From the `src/main/java` directory, run the `Main` class:

    ```bash
    java org.example.Main
    ```

    (Alternatively, if you're in the project root: `java -cp src/main/java org.example.Main`)

## Usage

When you run the application, you will be prompted to:

1.  **Enter your Username:**
    ```
    Welcome to the ATM Simulator
    Enter the User name :
    [Type your name and press Enter]
    ```
2.  **Interact with the ATM Menu:**
    ```
    Welcome [Your Username]
    Your account number is:[Generated Account Number]
    Your account balance 0.0
    ====ATM MENU====
    Choose an option:
    1. Deposit
    2. Withdraw
    3. Check Balance
    4. Quit
    ```
    Enter the number corresponding to your desired action.

### Balance Persistence

*   The account balance is saved to a file named `output.txt` located in `./src/main/resources/` when you choose option `4. Quit`.
*   When you start the application again, it will attempt to load the balance from this file. If the file doesn't exist or is empty/corrupted, the account will start with a `0.0` balance.

## Code Structure

*   `Main.java`: Contains the `main` method, which is the entry point of the application. It handles user input, menu display, and orchestrates interactions with `User` and `Account` objects. It also manages file I/O for balance persistence.
*   `User.java`: Represents a user with a username.
*   `Account.java`: Represents a bank account with an account number, owner name, and balance. It provides methods for `deposit`, `withdraw`, and `checkBalance`.

---
