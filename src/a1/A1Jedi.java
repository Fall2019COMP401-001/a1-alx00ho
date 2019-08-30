package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
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
			int stockBought[] = new int[storeItems];
			int customersBought[] = new int[storeItems];
			
			for (int j=0; j<storeCustomers; j++) {
				customerFirstName[j] = scan.next();
				customerLastName[j] = scan.next();
				itemsBought[j] = scan.nextInt();
				
				int quantityBought[] = new int[itemsBought[j]];
				String nameBought[] = new String[itemsBought[j]];
				
				for (int k=0; k<itemsBought[j]; k++) {
					quantityBought[k] = scan.nextInt();
					nameBought[k] = scan.next();
					
					for (int l=0; l<storeItems; l++) {
						if (nameBought[k].equals(stock[l])) {
							stockBought[l] += quantityBought[k];
							customersBought[l]++;
						}
					}
				}
			}
		scan.close();
		
		for (int p=0; p<storeItems; p++) {
			if (stockBought[p]>0) {
				System.out.print("\r\n" + customersBought[p] + " customers bought " + stockBought[p] + " " + stock[p]);
			} else {
				System.out.print("\r\nNo customers bought " + stock[p]);
			}
		}
		
	}
}
