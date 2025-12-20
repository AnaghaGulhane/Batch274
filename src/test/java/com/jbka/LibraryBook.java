package com.jbka;

public class LibraryBook {
	
	//Variables
	String title;
	String author;
	String isbn;
	boolean available;
	
	//Parameterized constructor
	 LibraryBook(String title, String author, String isbn) {
	        this.title = title;
	        this.author = author;
	        this.isbn = isbn;
	        available = true;   // book is available by default
	    }
	
	//Method to borrow the book
	void borrowBook() {
		if (available ==true) {
			 available = false;
			 System.out.println(title + " book borrowed successfully.");
		}else {
			System.out.println(title + " book is already borrowed.");
		}
	}
			 
        
       // Method to return the book
      void returnBook() {
        available = true;
    System.out.println(title + " book returned successfully.");
}

      // Main Method
      public static void main(String[] args) {

    // Creating book objects
    LibraryBook book1 = new LibraryBook("Java Basics", "James Gosling", "ISBN101");
    LibraryBook book2 = new LibraryBook("Python Intro", "Guido van Rossum", "ISBN102");

    // Borrow and return operations
    book1.borrowBook();
    book1.borrowBook();   // trying to borrow again
    book1.returnBook();
    book2.borrowBook();
}

	}
	
	
