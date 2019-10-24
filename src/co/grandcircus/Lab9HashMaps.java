package co.grandcircus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab9HashMaps {

	public static void main(String[] args) {
		Map<String, Double> userItems = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		String userInput;
		
		double sum = 0;
		String userQuest = "y";

		while (userQuest.equals("y")) {

			Map<String, Double> menu = new HashMap<>();// Maps have to Index
			menu.put("Apple", 2.99);
			menu.put("Blue Berry", 3.99);
			menu.put("Raspberry", 11.98);
			menu.put("Coffee", 1.99);
			menu.put("Milk", 2.99);
			menu.put("Flower", 4.99);
			menu.put("Power Bar", 3.98);
			menu.put("Banana", 0.99);

			ArrayList<String> itemName = new ArrayList<>();
			ArrayList<Double> itemPrice = new ArrayList<>();
			
			int counter = 1;
			for (String key : menu.keySet()) {
				System.out.println(counter++ + ". " + key + " $" + menu.get(key));

			}

			System.out.println("Please choose a item from the menu... ");

			userInput = scan.next();

			if (!menu.containsKey(userInput)) {
				System.out.println("Not a item on the menu...");
				continue;

			}

			System.out.println(menu.get(userInput));
			itemPrice.add(menu.get(userInput));
			itemName.add(userInput);

			//userItems.put(userInput, menu.get(userInput));
			/*
			 * double[] prices = {menu.get(userInput)};
			 * 
			 * for (double i : prices) { sum += i; }
			 */
			System.out.println("If you like to enter a another item is press y");

			userQuest = scan.next();

		}

		System.out.println(userItems);
		System.out.println(sum);
//		Arrays.sort(prices);
//		double max = prices[0];
//		double min =  prices[prices.length -1];

		scan.close();

		System.out.println("Thanks for using the menu app, GoodBye");

	}
//public static double addPrices() {

}
