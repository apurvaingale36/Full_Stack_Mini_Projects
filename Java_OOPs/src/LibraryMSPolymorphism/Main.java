package LibraryMSPolymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static ArrayList<Book> lib = new ArrayList<Book>();
	static Scanner sc = new Scanner(System.in);
	static Book save = new Book();
	static int status = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Author a1 = new Author("apurva");
		Book b1 = new Book("life", a1, 2002);

		Author a2 = new Author("vedant");
		Book b2 = new Book("The Curse", a2, 2020);

		Author a3 = new Author("chetan");
		Book b3 = new Book("wisdom", a3, 2017);

		Author a4 = new Author("jaya");
		Book b4 = new Book("cool fool", a4, 2023);

		lib.add(b1);
		lib.add(b2);
		lib.add(b3);
		lib.add(b4);

		display();
		System.out.println("book list added!");

		lib.remove(b2);
		System.out.println("book list after removing!");
		display();

		while (true) {
			System.out.println("Choose below:");
			System.out.println("Add a book");
			System.out.println("Borrow Book");
			System.out.println("Return Book");
			System.out.println("Show available books");
			System.out.println("Exit");

			int ch = sc.nextInt();
			sc.nextLine();

			switch (ch) {
			case 1:

				addBook();
				break;

			case 2:
				removeBook();
				status = 1;
				break;

			case 3:

				if (status == 0) {
					System.out.println("no bk to returned");
				} else {
					bookReturned();
					status = 0;
				}
				// System.out.println("enter bk to return");
				break;
			case 4:
				display();

				break;

			case 5:
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice!");
			}

		}

	}

	private static void bookReturned() {
		// TODO Auto-generated method stub
		lib.add(save);
	}

	public static void addBook() {
		System.out.println("enter book name");
		String bk_name = sc.nextLine();
		
			if (!findbk(bk_name)) {

				System.out.println("enter author name");
				String a_name = sc.nextLine();
				Author a = new Author(a_name);
				System.out.println("enter year");
				int yr = sc.nextInt();
				Book bookn = new Book(bk_name, a, yr);
				lib.add(bookn);
			}

			else {
				throw new BookNotFound("book not found " + bk_name);

			}
		}

	

	public static void removeBook() {
		System.out.println("bk to delete");
		String del = sc.nextLine();
		for (Book bb : lib) {
			if (bb != null && bb.getBk_name().equals(del)) {
				save.setBk_name(bb.getBk_name());
				save.setAuthor(bb.getAuthor());
				save.setPubyear(bb.getPubyear());
				lib.remove(bb);
				System.out.println("Book deleted");
			} else {
				throw new BookNotFound("book not found " + del);
			}
		}
	}

	public static void display() {
		for (Book i : lib) {
			System.out.println(i.dispaly());
		}
	}

	public static boolean findbk(String bk_name) throws BookNotFound {
		for (Book book : lib) {
			if (book.getBk_name().equals(bk_name)) {
				return true;
			}

		}
		return false;
	}
	// throw new BookNotFound("book not found " + bk_name);
}
