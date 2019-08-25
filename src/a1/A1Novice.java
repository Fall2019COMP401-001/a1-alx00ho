package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Read in total number of customers
		
				int totalCustomers = scan.nextInt();
				
				// Array to store numbers
				
				int[] cstmr = new int[totalCustomers];
				
				// Read Customer's First Name, Last Name, and Number of Item Bought
				
				for (int i=0; i<cstmr.length; i++) {
					String firstname = scan.next();
					String lastname = scan.next();
					int itemsBought = scan.nextInt();
					char firstInitial = firstname.charAt(0);
					double totalPrice = 0.0;
					
					for (int c=0; c<itemsBought; c++) {
						int numberOfItem = scan.nextInt();
						String nameOfItem = scan.next();
						double priceOfOne = scan.nextDouble();
						
						double[] totalOfOne = new double[itemsBought];
						totalOfOne[c] = priceOfOne*numberOfItem;
						
						for (int l=0; l<totalOfOne.length; l++) {
							totalPrice = totalPrice + totalOfOne[l];
						}
				}
				System.out.println(firstInitial + ". " + lastname + ": " + String.format("%.2f", totalPrice));
		}
				
	scan.close();
	
	// Print results
	
	}
}
