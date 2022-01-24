package com.bridgelabz.day_11_12;

import java.util.Scanner;

public class ShowMenu {

	Scanner scanner = new Scanner(System.in);

	public void menu() {
		StockRepo stockRepo = StockRepo.getInstance();
		StockService stockService = new StockService();

		while (true) {
			System.out.println("Enter Option \n1. For Buy \n2. For Sell\n3. Print Report\n4. Exit ");
			int option = scanner.nextInt();
			
			switch (option) {
			case 1:
				System.out.println("Enter your name:");
				String traderName = scanner.next();
				stockService.traderName(traderName);

				System.out.println("Enter how much money you want to invest: ");
				int balance = scanner.nextInt();

				System.out.println("Enter which company's share you want to buy: ");
				stockRepo.companyName();
				String companyName = scanner.next();

				System.out.println("Enter how many shares you want to buy: ");
				int noOfShares = scanner.nextInt();

				stockService.buy(companyName, noOfShares, balance);
				break;

			case 2:
				System.out.println("Enter which company's share you want to sell: ");
				stockRepo.companyName();
				String companyName1 = scanner.next();

				System.out.println("How many share you want to sell: ");
				int noOfShares1 = scanner.nextInt();

				stockService.sell(companyName1, noOfShares1);
				break;

			case 3:
				stockService.printReport();
				break;

			default:
				System.out.println("Enter correct option please!!");

			}
		}
	}
}
