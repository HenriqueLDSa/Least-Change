package theLeastChangeAssignment;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		final int MAX_CHANGE = 100;
		final int halfDollar = 50, quarter = 25, dime = 10, nickel = 5, penny = 1;
		int numHalfDollarCoins = 0, numQuarterCoins = 0, numDimeCoins = 0, numNickelCoins = 0, numPennyCoins = 0;
		int changeTransaction;
		int remainingChange = 0;
		int numTransactions = 0;

		// loops the code until the number of transactions hit 5
		while (numTransactions < 5) {

			// generates a random number between 0 and 99
			Random randChange = new Random();
			changeTransaction = randChange.nextInt(MAX_CHANGE);

			// executes line of code if the random number generated is greater than 0
			if (changeTransaction > 0) {

				// gets the number of half dollar coins and calculates how much is left of
				// change
				numHalfDollarCoins = changeTransaction / halfDollar;
				remainingChange = changeTransaction % halfDollar;

				// gets the number of quarters and calculates how much is left of change
				numQuarterCoins = remainingChange / quarter;
				remainingChange %= quarter;

				// gets the number of dimes and calculates how much is left of change
				numDimeCoins = remainingChange / dime;
				remainingChange %= dime;

				// gets the number of nickels and calculates how much is left of change
				numNickelCoins = remainingChange / nickel;
				remainingChange %= nickel;

				// gets the number of pennies and calculates how much is left of change
				numPennyCoins = remainingChange / penny;
				remainingChange %= penny;

				numTransactions++;

				// if the random number is 0, line of code executes
			} else {
				System.out.println("There is no change for this transaction!");
			}

			// outputs the total change
			System.out.println("Total change: " + changeTransaction);

			// outputs the amount of half dollars if it is greater than 0
			if (numHalfDollarCoins != 0) {

				if (numHalfDollarCoins > 1) {
					System.out.println("Half dollars: " + numHalfDollarCoins);
				} else {
					System.out.println("Half dollar: " + numHalfDollarCoins);
				}
			}

			// outputs the amount of quarters if it is greater than 0
			if (numQuarterCoins != 0) {
				if (numQuarterCoins > 1) {
					System.out.println("Quarters: " + numQuarterCoins);
				} else {
					System.out.println("Quarter: " + numQuarterCoins);
				}
			}

			// outputs the amount of dimes if it is greater than 0
			if (numDimeCoins != 0) {
				if (numDimeCoins > 1) {
					System.out.println("Dimes: " + numDimeCoins);
				} else {
					System.out.println("Dime: " + numDimeCoins);
				}
			}

			// outputs the amount of nickels if it is greater than 0
			if (numNickelCoins != 0) {
				if (numNickelCoins > 1) {
					System.out.println("Nickels: " + numNickelCoins);
				} else {
					System.out.println("Nickel: " + numNickelCoins);
				}
			}

			// outputs the amount of pennies if it is greater than 0
			if (numPennyCoins != 0) {
				if (numPennyCoins > 1) {
					System.out.println("Pennies: " + numPennyCoins);
				} else {
					System.out.println("Penny: " + numPennyCoins);
				}
			}

			System.out.println();
		}

	}

}
