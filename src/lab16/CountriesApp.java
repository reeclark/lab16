package lab16;

import java.util.Scanner;

public class CountriesApp {
	public static void main(String[] args) {
		String fileName = "countries.txt";
		String directoryFolder = "country";
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Countries Maintenance Application!");
		int userChoice = 0;
		do {
			System.out.println("1 - See the list of countries");
			System.out.println("2 - Add a country");
			System.out.println("3 - Exit");
			userChoice = LabValidator.getInt(scan, "Enter menu number: ", 1, 3);
			if (userChoice == 1) {
				CountriesTextFile.readFromFile(directoryFolder, fileName);
			} else if (userChoice == 2) {
				String userInput = LabValidator.getString(scan, "Enter country: ");
				CountriesTextFile.writeToFile(directoryFolder, fileName, userInput);
				CountriesTextFile.readFromFile(directoryFolder, fileName);
			}
		} while (userChoice == 1 || userChoice == 2);
		{
			System.out.println("Buh-Bye!");
		}
	}
}
