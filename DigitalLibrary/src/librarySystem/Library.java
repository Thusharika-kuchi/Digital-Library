package librarySystem;

import java.util.Scanner;



public class Library {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating object of Scanner class
		// to take input from user
		Scanner input = new Scanner(System.in);

		// Displaying menu
		System.out.println(
			"********************Welcome to the Digital Library!********************");
		System.out.println(
			"				 Select From The Following Options:			 ");
		System.out.println(
			"**********************************************************************");

		// Creating object of book class
		Books ob = new Books();
		// Creating object of Users class

		int choice;
		int searchChoice;

		// Creating menu
		// using do-while loop
		do {

			ob.dispMenu();
			choice = input.nextInt();

			// Switch case
			switch (choice) {

				// Case
			case 1:
				Book b = new Book();
				ob.addBook(b);
				break;

				// Case
			case 2:
				ob.viewAllBooks();
				break;

			// Case
			case 3:

				System.out.println(
					" press 1 to Search with BookID.");
				System.out.println(
					" Press 2 to Search with Book's Title.");
				searchChoice = input.nextInt();
				input.nextLine();

				// Nested switch
				switch (searchChoice) {

					// Case
				case 1:
					System.out.println(
							" Enter BookID to search...");
					ob.search(input.nextInt());
					input.nextLine();
					break;

					// Case
				case 2:
					System.out.println(
							" Enter Book Title to search...");
					ob.search(input.nextLine());
				}
				break;

				// Case
			case 4:
				ob.updateBookDetails();
				break;

				// Case
			case 5:
				System.out.println(
						" Enter BookID to delete book");
				ob.Delete(input.nextInt());
				break;

				// Case
			
			default:

				// Print statement
				System.out.println("ENTER BETWEEN 0 TO 5.");
			}

		}

		// Checking condition at last where we are
		// checking case entered value is not zero
		while (choice != 0);
	}
}

