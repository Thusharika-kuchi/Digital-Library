package librarySystem;

import java.util.Scanner;

public class Book {
		public int BookID;
		public String Title;
		public String Author;
		public String Genere;
		public String Status;
		Scanner input = new Scanner(System.in);

		 // Method
		 // To add book details
		Books ob=new Books();
		 public Book()
		 {
		     // Display message for taking input later
		     // taking input via
		     // nextInt() and nextLine() standard methods
			
			 System.out.println("Enter ID of Book:");
				 this.BookID=input.nextInt();
				 input.nextLine();
			 
			 
		     String title;
		     do {
		     System.out.println("Enter Title of Book:");
		     	title=input.nextLine();
		     	if(title.equals("")) {
		     		System.out.println("Title can't be empty");
		     	}
		     	else {
		     		this.Title=title;
		     		break;
		     	}
		     }while(title.equals(""));
		     
		     String author;
		     do {
		     System.out.println("Enter Author of Book:");
		     	author=input.nextLine();
		     	if(author.equals("")) {
		     		System.out.println("Author can't be empty");
		     	}
		     	else {
		     		this.Author=author;
		     		break;
		     	}
		     }while(author.equals(""));

		     
		     System.out.println("Enter Genere of Books:");
		     this.Genere = input.nextLine();
		     
		     
		     String status;
		     do {
		     System.out.println("Enter Status of Book:");
		     	status=input.nextLine();
		     	if(!(status.equalsIgnoreCase("Available")||status.equalsIgnoreCase("Checked Out"))) {
		     		System.out.println("Availability status should be either Available or Checked Out");
		     	}
		     	else {
		     		this.Status=status;
		     		break;
		     	}
		     }while(!(status.equalsIgnoreCase("Available")||status.equalsIgnoreCase("Checked Out")));
		 }
		}
