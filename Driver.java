import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Driver {
	public static void main(String[] arg) throws Exception
	{
		//Created a scanner object
		Scanner Keyboard = new Scanner(System.in);
		//File Variables
		String Line;
		StringTokenizer en;
		ArrayList<String> stArrayList = new ArrayList<>();
		ArrayList<StringTokenizer> strArray = new ArrayList<>();
		
		//Scan a file
		File file = new File("inventory.txt");
		Scanner filescan = new Scanner(file);
		
		/*
		* while text file has new lines
		* Scans a text file and sets each line equal to line
		* Sets entry equal to line
		* adds each entry to ArrayList
		*/
		
		while(filescan.hasNextLine()) {
			Line = filescan.nextLine();
			stArrayList.add(Line);
			en = new StringTokenizer(Line);
			strArray.add(en);
			}
		
		//Created variables here
		
		double pri;
		boolean disc = true;
		int quan;
		double value = 0;
		int choice;
		int month;
		int day;
		int year;
		double discountCost;
		boolean validChoice = true;
		String input = "Y";
		
		//Add Strings
		String inventory;
		String choiceName = "Choice!";
		String productType;
		
		ArrayList<Product> productAL = new ArrayList<>();
		for (int i = 0; i < strArray.size(); i++) {
			Product product = new Product(strArray.get(i).nextToken(), Double.parseDouble( strArray.get(i).nextToken()), strArray.get(i).nextToken());
			productAL.add(product);}
		do {
			//Print ineventory and ask user to int choice
			choice = printInventory1(stArrayList);
			
			//ask for desired amt od units
			System.out.println("How many units you want to purchase? ");
			quan = Keyboard.nextInt();
			
			
		}
		
	}

}

