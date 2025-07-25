package Library.Management.System;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import LibraryMSPolymorphism.Author;

public class Main {
	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		while(true) {
			System.out.println("Choose below:");
			System.out.println("Add a book");
			System.out.println("Borrow Book");
			System.out.println("Return Book");
			System.out.println("Show available books");
			System.out.println("Exit");
			
////			int ch=sc.nextInt();
////			sc.nextLine();
//
//			switch(ch) {
//			case 1:
//				addBook();
//				break;
//				
//			case 2:
//				removeBook();
//				
//				break;
//				
//			case 3:
//				System.out.println("enter bk to return");
//				
//			case 4: 
//				//display();
//				
//				break;
//			
//			case 5:
//				System.exit(0);
//				break;
//				
//			default:
//				System.out.println("Invalid choice!");
//			}
//			
//		}
//		
//	}
//	ArrayList<Book> list=new ArrayList<Book>();
//	Map<String,Book> map=new HashMap<String, Book>();;
//	int status;
//
//	private static void addBook() {
//		Scanner sc=new Scanner(System.in);
//		// TODO Auto-generated method stub
//		System.out.println("enter book");
//		String name=sc.nextLine();
//		
//		System.out.println("enter publishing year");
//		int yr=sc.nextInt();
//		
//		System.out.println("enter author name");
//		String auth=sc.nextLine();
//		
//		Book bk=new Book(auth,name,yr);
//		
//	}
//	
//	public void remove(Book book) {
//		map.remove(book.getBk_name());
//	}
//
//	private static void removeBook() {
//		// TODO Auto-generated method stub
//		
//	}
//	public void display() {
//		for (Book book : map.values()) {
//			System.out.println(book.dispaly());
//		}
//	}
//
//	public Book findbk(String bk_name) throws BookNotFound {
//		for (Book book : map.values()) {
//			if (book.getBk_name().equals(bk_name)) {
//				return book;
//			}
//		}
//		throw new BookNotFound("book not found " + bk_name);
	}
}
}
