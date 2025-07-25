package LibraryMSPolymorphism;

public class Book implements Display {

	
	private String bk_name;
	private Author author;
	private int pubyear;
	
	
	
	public Book() {
		super();
	}
	public String getBk_name() {
		return bk_name;
	}
	public void setBk_name(String bk_name) {
		this.bk_name = bk_name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	public Book(String bk_name, Author author, int pubyear) {
		super();
		this.bk_name = bk_name;
		this.author = author;
		this.pubyear = pubyear;
	}
	public int getPubyear() {
		return pubyear;
	}
	public void setPubyear(int pubyear) {
		this.pubyear = pubyear;
	}

	@Override
	public String dispaly() {
		// TODO Auto-generated method stub
		return "Book [bk_name=" + bk_name + ", author=" + author.dispaly() + ", pubyear=" + pubyear + "]";
		}
	@Override
	public String toString() {
		return "Book [bk_name=" + bk_name + ", author=" + author.dispaly() + ", pubyear=" + pubyear + "]";
	}
	
	
	
	
}
