package com.tnsif.ExceptionHandling;

import java.util.Scanner;

public class AtmDemoMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        AtmDemo atm = new AtmDemo();

        try {
            // Step 1: Enter PIN
            System.out.print("Enter your PIN: ");
            int pin = sc.nextInt();
            atm.validatePin(pin);

            // Step 2: Enter Withdrawal Amount
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();
            atm.withdraw(amount);

        } catch (InvalidPinException | InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("🙏 Thank you for using our ATM!");
        }

        sc.close();
    }

	
	}

