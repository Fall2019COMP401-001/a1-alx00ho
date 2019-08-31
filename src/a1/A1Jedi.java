package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Store Different Item Count, Name of Items, and Price of Items
		
			int storeItems = scan.nextInt();
			String[] stock = new String[storeItems];
			double[] stockPrice = new double[storeItems];
			
			// Read in stock name and price
			for (int i=0; i<storeItems; i++) {
				stock[i] = scan.next();
				stockPrice[i] = scan.nextDouble();
			}
			
			// Store customer information
			int storeCustomers = scan.nextInt();
			String customerFirstName[] = new String[storeCustomers];
			String customerLastName[] = new String[storeCustomers];
			int itemsBought[] = new int[storeCustomers];
			int stockBought[] = new int[storeItems];
			int customersBought[] = new int[storeItems];
			
			// Read in customer information
			for (int j=0; j<storeCustomers; j++) {
				customerFirstName[j] = scan.next();
				customerLastName[j] = scan.next();
				itemsBought[j] = scan.nextInt();
				
				// Store how many of what they bought
				int quantityBought[] = new int[itemsBought[j]];
				String nameBought[] = new String[itemsBought[j]];
				int[] didBuy = new int[storeItems];
				
				// Read in how many of what items they bought
				for (int k=0; k<itemsBought[j]; k++) {
					quantityBought[k] = scan.nextInt();
					nameBought[k] = scan.next();
					
					// Count how much stock what bought
					for (int l=0; l<storeItems; l++) {
						if (nameBought[k].equals(stock[l])) {
							stockBought[l] += quantityBought[k];
							didBuy[l]++;
						}
					}
				}
				// Add 1 to see how many customers bought an item
				for (int q=0; q<storeItems; q++) {
					if (didBuy[q]>0) {
						customersBought[q] += 1;
					}
				}
			}
		scan.close();
		
		for (int p=0; p<storeItems; p++) {
			if (stockBought[p]>0) {
				System.out.println(customersBought[p] + " customers bought " + stockBought[p] + " " + stock[p]);
			} else {
				System.out.println("No customers bought " + stock[p]);
			}
		}
	}
}
