package com.qa.main;

public class ChangeSelector {

	public String changeCalculator(double money, double price) {
		double change = (money - price) + 0.00001;
		int tenNote = 0;
		int fiveNote = 0;
		int twentyP = 0;
		int oneP = 0;
		int tenCounter = 0;
		int fiveCounter = 0;
		int twentyPCounter = 0;
		int onePCounter = 0;

		while (change >= 0.0001) {

			if ((tenNote = (int) change / 10) >= 1) {
				tenCounter++;
				change -= (1 * 10);
			} else if ((fiveNote = (int) change / 5) >= 1) {
				fiveCounter++;
				change -= (1 * 5);
			} else if ((twentyP = (int) (change / (double) 0.20)) >= 1) {
				twentyPCounter++;
				change -= (1 * 0.20);
			} else if ((oneP = (int) (change / 0.01)) >= 1) {
				onePCounter++;
				change -= (oneP * 0.01);
			}

		}

		return tenCounter + " $10 notes \n" + fiveCounter + " $5 notes \n" + twentyPCounter + " 20c coins \n"
				+ onePCounter + " 1c coins";
	}

}
