package com.bank.mypackage;

import java.util.Scanner;

/**
 * @author asthashaw
 *
 */
public class BankMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String userId;
		String pass;
		String confirmPass;
		String userInput;
		char option;
		Double balance;
		Account account = new Account();

		/* Registration of a new user and subsequent login */

		System.out.println("********Welcome to Our Bank************");
		System.out.println("You need to register with us first!");
		System.out.println("Please enter your bank userId");
		userId = input.nextLine();
		System.out.println("Please enter your password");
		pass = input.nextLine();
		System.out.println("Re-enter your password");
		confirmPass = input.nextLine();

		/* User selects an option from the menu */

		if (confirmPass.equals(pass) && pass.length() != 0 && userId.length() != 0) {
			System.out.println("Registration Successful!\nHello User" + userId);
			System.out.println(":-You can use the following facilities:-");
			System.out.println("1. Deposit Money\n" + "2. Check Your Balance\n" + "3. Withdraw Money\n"
					+ "4. Request Overdraft\n" + "5. Logout");

			do {
				System.out.println("\n Please enter your option\n");

				option = input.next().charAt(0);

				switch (option) {
				case '1':
					System.out.println("-------------------------");
					System.out.println("\n Enter the amount you want to deposit\n");
					double depositAmount = input.nextDouble();
					if (depositAmount > 0) {
						balance = account.deposit(depositAmount);
						System.out.println("\nYour updated balance is " + balance);
					} else
						System.err.println("Please enter appropriate value to deposit");
					break;

				case '2':
					System.out.println("-------------------------");
					balance = account.getBalance();
					System.out.println("Your current balance is :" + balance);
					break;

				case '3':
					System.out.println("-------------------------");
					System.out.println("\n Enter the amount you want to withdraw\n");
					double withdrawAmount = input.nextDouble();
					if (withdrawAmount > 0) {
						balance = account.withdraw(withdrawAmount);
						if (balance >= 0)
							System.out.println("Your updated balance is " + balance);
						else
							System.err.println("Transaction failed due to insufficient funds");
					} else {
						System.err.println("Please enter appropriate value to withdraw");
					}

					break;

				case '4':
					System.out.println("-------------------------");
					if (account.overdraftResponse()) {
						System.out.println(
								"The account is overdrawn with an overdraft of 100.0. Please deposit back the overdraft in a month to avoid account getting locked");
					} else {
						System.out.println("You have already availed the overdraft facility for this month");
					}
					break;

				case '5':
					System.out.println("-------------------------");
					break;

				default:
					System.out.println("Invalid Option!! Please enter again");
					break;
				}

			} while (option != '5');

			System.out.println("You have been successfully logged out. Thank you for using our services.");

		} else {
			System.err.println("Registration Unsuccessful. Try after sometime!");
		}

	}

}
