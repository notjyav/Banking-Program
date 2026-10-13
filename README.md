# Banking Program

A simple command-line banking program written in Java. It lets you check your balance, make deposits, and make withdrawals through a text menu.

## Features

- **Show Balance**: displays the current balance formatted as dollars and cents
- **Deposit**: adds money to the balance (negative amounts are rejected)
- **Withdraw**: removes money from the balance (rejects negative amounts and amounts greater than the balance)
- **Exit**: ends the program

## Requirements

- Java 14 or later (the program uses the arrow-style `switch` syntax)

## How to Run

1. Save the code as `Main.java`.
2. Compile it:
   ```bash
   javac Main.java
   ```
3. Run it:
   ```bash
   java Main
   ```

## Usage

When the program starts, you'll see a menu:

```
***************
BANKING PROGRAM
***************
1. Show Balance
2. Deposit
3. Withdraw
4. Exit
***************
Enter your choice (1-4)
```

Type a number from 1 to 4 and press Enter. The menu repeats after each action until you choose **4. Exit**.

### Example Session

```
Enter your choice (1-4) 2
Enter Deposit: 100
Enter your choice (1-4) 3
Enter Withdraw: 30
Enter your choice (1-4) 1
***************
$70.00
Enter your choice (1-4) 4
***************
Transaction completed
```

## How It Works

| Method | Returns | Purpose |
|---|---|---|
| `main` | `void` | Runs the menu loop and tracks the balance |
| `showBalance(double balance)` | `void` | Prints the current balance |
| `deposit()` | `double` | Asks for an amount and returns it (or `0` if invalid) |
| `withdraw(double balance)` | `double` | Asks for an amount and returns it (or `0` if invalid or too large) |

`showBalance` is `void` because it only prints. `deposit` and `withdraw` return a value so `main` can update the balance.
