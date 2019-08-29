package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int storeItems = scan.nextInt();
		String[] stock = new String[storeItems];
		double[] stockPrice = new double[storeItems];
		
		for (int i=0; i<storeItems; i++) {
			stock[i] = scan.next();
			stockPrice[i] = scan.nextDouble();
		}
		
		int storeCustomers = scan.nextInt();
		String customerFirstName[] = new String[storeCustomers];
		String customerLastName[] = new String[storeCustomers];
		int itemsBought[] = new int[storeCustomers];
		double totalPrice[] = new double[storeCustomers];
		
		for (int j=0; j<storeCustomers; j++) {
			customerFirstName[j] = scan.next();
			customerLastName[j] = scan.next();
			itemsBought[j] = scan.nextInt();
			
			int quantityBought[] = new int[itemsBought[j]];
			String nameBought[] = new String[itemsBought[j]];
			
			for (int k=0; k<itemsBought[j]; k++) {
				quantityBought[k] = scan.nextInt();
				nameBought[k] = scan.next();
				double subTotal = 0.0;
				
				for (int l=0; l<storeItems; l++) {
					if (nameBought[k].equals(stock[l])) {
						subTotal = subTotal + (stockPrice[l] * quantityBought[k]);
						totalPrice[j] = totalPrice[j] + subTotal;
					}
				}
			}
		}
	scan.close();
	
	double testHighPrice = 0.0;
	int highestID = 0;
	
	for (int m=0; m<storeCustomers; m++) {
		if (testHighPrice < totalPrice[m]) {
			testHighPrice = totalPrice[m];
			highestID = m;
		}
	}
	
	double testLowPrice = totalPrice[0];
	int lowestID = 0;
	
	for (int n=1; n<storeCustomers; n++) {
		if (testLowPrice > totalPrice[n]) {
			testLowPrice = totalPrice[n];
			lowestID = n;
		}
	}
	
	double averagePrice = 0.0;
	
	for (int o=0; o<storeCustomers; o++) {
		averagePrice += totalPrice[o];
	}
	
	averagePrice /= storeCustomers;
	
	System.out.print("Biggest: " + customerFirstName[highestID] + " " + customerLastName[highestID]
			+ " (" + String.format("%.2f", totalPrice[highestID]) + ")");
	System.out.print("\r\nSmallest: " + customerFirstName[lowestID] + " " + customerLastName[lowestID]
			+ " (" + String.format("%.2f", totalPrice[lowestID]) + ")");
	System.out.print("\r\nAverage: " + String.format("%.2f", averagePrice));
	}
}
