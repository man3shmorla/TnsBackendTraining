package com.tnsif.ExceptionHandling;


import java.util.Scanner;

// Custom Exception for Invalid PIN
class InvalidPinException extends Exception {
    public InvalidPinException(String message) {
        super(message);
    }
}

// Custom Exception for Insufficient Balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// ATM Class
class AtmDemo {
    private double accountBalance = 1500;
    private final int savedPin = 7979;

    // Validate PIN
    void validatePin(int enteredPin) throws InvalidPinException {
        if (savedPin != enteredPin) {
            throw new InvalidPinException("❌ The PIN you entered is incorrect. Please try again.");
        } else {
            System.out.println("✅ Correct PIN. Proceed...");
        }
    }

    // Validate Balance & Withdraw
    void withdraw(double withdrawalAmount) throws InsufficientBalanceException {
        if (accountBalance < withdrawalAmount) {
            throw new InsufficientBalanceException("❌ Withdrawal amount exceeds account balance. Insufficient funds.");
        } else {
            accountBalance -= withdrawalAmount;
            System.out.println("✅ Transaction successful! Remaining Balance: " + accountBalance);
        }
    }
}