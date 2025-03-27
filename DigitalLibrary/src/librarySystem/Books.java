package librarySystem;


	import java.util.Scanner;





	//CLass
	public class Books {

		// Class data members
		Book theBooks[] = new Book[50];
		public static int count;

		Scanner input = new Scanner(System.in);

		// Method 1
		// To compare books
		public int compareBookObjects(Book b1, Book b2)
		{

			// If book title matches
			if (b1.Title.equalsIgnoreCase(b2.Title)) {

				// Printing book exists
				System.out.println(
					"Book of this Title Already Exists.");
				return 0;
			}

			// if book id matches
			if (b1.BookID == b2.BookID) {

				// Print book exists
				System.out.println(
					"Book of this ID Already Exists.");
				
				return 0;
			}
			return 1;
		}

		// Method 2
		// To add book
		public void addBook(Book b)
		{

			for (int i = 0; i < count; i++) {

				if (this.compareBookObjects(b, this.theBooks[i])
					== 0)
					return;
			}

			if (count < 50) {

				theBooks[count] = b;
				count++;
			}
			else {

				System.out.println(
					"No Space to Add More Books.");
			}
		}

		// Method 3
		// To search book by serial number
		public void search(int BookID)
		{

			// Display message
			System.out.println(
				"\t\t\t\tSEARCH BY SERIAL NUMBER\n");

			// Class data members
		/*	int sNo;
			System.out.println("Enter Serial No of Book:");
			sNo = input.nextInt();*/

			int flag = 0;
			System.out.println(
				"BookID\t\tTitle\t\t\tAuthor\t\tGenere\t\tStatus");

			for (int i = 0; i < count; i++) {
				if (BookID == theBooks[i].BookID) {
					System.out.println(
						theBooks[i].BookID + "\t\t"
						+ theBooks[i].Title + "\t\t"
						+ theBooks[i].Author + "\t\t"
						+ theBooks[i].Genere + "\t\t"
						+ theBooks[i].Status);
					flag++;
					return;
				}
			}
			if (flag == 0)
				System.out.println("No Book for Serial No "
								+ BookID + " Found.");
		}

		// Method 4
		// To search author by name
		public void search(String Title)
		{

			// Display message
			System.out.println(
				"\t\t\t\tSEARCH BY Title");

			/*input.nextLine();

			System.out.println("Enter Title:");
			String authorName = input.nextLine();*/

			int flag = 0;

			System.out.println(
				"BookID\t\tTitle\t\tAuthor\t\tGenere Qty\t\tStatus");

			for (int i = 0; i < count; i++) {

				// if author matches any of its book
				if (Title.equalsIgnoreCase(
						theBooks[i].Title)) {

					// Print below corresponding credentials
					System.out.println(
						theBooks[i].BookID + "\t\t"
						+ theBooks[i].Title + "\t\t"
						+ theBooks[i].Author + "\t\t"
						+ theBooks[i].Genere + "\t\t"
						+ theBooks[i].Status);
					flag++;
				}
			}

			// Else no book matches for author
			if (flag == 0)
				System.out.println("No Books of " + Title
								+ " Found.");
		}

		// Method 5
		// To display all books
		public void viewAllBooks()
		{

			System.out.println("\t\t\t\tSHOWING ALL BOOKS\n");
			System.out.println(
				"BookID\t\tTitle\t\tAuthor\t\tGenere\t\tStatus");
			int flag=0;
			for (int i = 0; i < count; i++) {
				flag=1;
				System.out.println(
					theBooks[i].BookID + "\t\t"
					+ theBooks[i].Title + "\t\t"
					+ theBooks[i].Author + "\t\t"
					+ theBooks[i].Genere + "\t\t"
					+ theBooks[i].Status);
			}
			if(flag==0) {
				System.out.println("There are no books to display");
			}
		}

		// Method 6
		// To edit the book
		public void dispUpdateMenu()
		{

			// Displaying menu
			System.out.println(
				"----------------------------------------------------------------------------------------------------------");
			System.out.println("Press 1 to Update Author.");
			System.out.println("Press 0 to Exit Application.");
			System.out.println(
				"Press 2 to Update Title of a Book.");
			System.out.println("Press 3 to update Status Book.");
			System.out.println("Press 4 to update Genere Books.");
			
			System.out.println(
				"-------------------------------------------------------------------------------------------------------");
		}
		public void updateBookDetails()
		{

			System.out.println(
				"\t\t\t\tUpdate Book details\n");
			System.out.println("Enter ID of Book");

			int BookID = input.nextInt();

			for (int i = 0; i < count; i++) {

				if (BookID == theBooks[i].BookID) {

					
					int choice;
					do {

						dispUpdateMenu();
					choice = input.nextInt();
					input.nextLine();

						// Switch case
						switch (choice) {

							// Case
						case 1:
							System.out.println(
									"Enter Author to be updated:");

								String Author = input.nextLine();
							theBooks[i].Author=Author;
							System.out.println(
									" Author of book is updated with "+theBooks[i].Author);
							break;

							// Case
						case 2:
							System.out.println(
									"Enter Author to be updated:");

								String Title = input.nextLine();
							theBooks[i].Title=Title;
							System.out.println(
									" Title of book is updated with "+theBooks[i].Title);
							break;

						// Case
						case 3:

							System.out.println(
									"Enter Status to be updated:");

								String Status = input.nextLine();
							theBooks[i].Status=Status;
							System.out.println(
									" Status of book is updated with "+theBooks[i].Status);
							break;

							// Case
						case 4:
							System.out.println(
									"Enter Genere to be updated:");

								String Genere = input.nextLine();
							theBooks[i].Genere=Genere;
							System.out.println(
									" Genere of book is updated with "+theBooks[i].Genere);
							break;

							// Case
						
						default:

							// Print statement
							System.out.println("ENTER BETWEEN 0 TO 4.");
						}

					}

					// Checking condition at last where we are
					// checking case entered value is not zero
					while (choice != 0);

					return;
				}
			}
			System.out.println("please enter valid BookID");
		}

		// Method 7
		// To create menu
		public void dispMenu()
		{

			// Displaying menu
			System.out.println(
				"----------------------------------------------------------------------------------------------------------");
			System.out.println("Press 1 to Add new Book.");
			System.out.println("Press 0 to Exit Application.");
			System.out.println(
				"Press 2 to View all books.");
			System.out.println("Press 3 to Search a Book.");
			System.out.println("Press 4 to Update Book.");
			System.out.println("Press 5 to Delete Book.");
			System.out.println(
				"-------------------------------------------------------------------------------------------------------");
		}

		// Method 8
		// To search the library
		public void Delete(int BookID)
		{
			int flag=0;
			for (int i = 0; i < count; i++) {
				
				if (BookID == theBooks[i].BookID) {
					flag=1;
					count-=1;
				}
				if(flag==1) {
					theBooks[i]=theBooks[i+1];
				}
			}
			if(flag==0) {
			System.out.println("No Book of ID "+BookID
							+ " to delete  in Library.");
			
			return;
			}
			System.out.println("The book is deleted. It is no more in the caltalog");
			
			
		}

		
	}
