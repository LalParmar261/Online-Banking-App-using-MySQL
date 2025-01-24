package com.banking;

import java.util.Scanner;

/**
 * Main class to start the Online Banking application.
 * 
 * This class handles user interactions and provides options to log in or open a
 * new account.
 * 
 * 
 * Author: Permeshawar Lal Parmar
 */
public class StartApp {
	public static void main(String[] args) {

		System.out.println("<*--------* WelCome To Online Banking *--------*>");
		boolean loopFlag = true;
		Scanner in = new Scanner(System.in);

		// Main application loop
		while (loopFlag) {
			System.out.println("\n1. LogIn to Existing Account");
			System.out.println("2. Open a New Account");

			int choice = in.nextInt();

			in.nextLine(); // Consume the newline character

			switch (choice) {

			case 1:
				// Logging into an existing account
				System.out.print("Your Account ID -> ");
				int accID = in.nextInt();
				System.out.print("Account 5 Digits Pin -> ");
				int accPin = in.nextInt();

				// Calling the UserDAO to handle the account login process
				new UserDAO();
				UserDAO.accLogin(accID, accPin);

				break;

			case 2:
				// Opening a new account
				new UserDAO(); // Initializing the UserDAO (Data Access Object)

				// Collecting user information for account registration
				System.out.print("Enter Your Name -> ");
				String name = in.nextLine();
				System.out.print("Enter Your Address -> ");
				String address = in.nextLine();
				System.out.print("Enter Your Email -> ");
				String email = in.nextLine();

				// Calling the UserDAO to handle the account registration process
				UserDAO.accRegistration(name, address, email);

				break;

			default:
				System.out.println("Invalid Input!");
				System.out.println(""); // Next Line
				break;
			}
		}
	}
}
