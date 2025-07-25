package Library.Management.System;

public class Book extends Author implements Display  {

	
	private String bk_name;
	private int pubyear;
	
	
	public String getBk_name() {
		return bk_name;
	}
	public void setBk_name(String bk_name) {
		this.bk_name = bk_name;
	}
	
	public int getPubyear() {
		return pubyear;
	}
	public void setPubyear(int pubyear) {
		this.pubyear = pubyear;
	}

	public Book(String author_name, String bk_name, int pubyear) {
		super(author_name);
		this.bk_name = bk_name;
		this.pubyear = pubyear;
	}
	
	@Override
	public String dispaly() {
		// TODO Auto-generated method stub
		return "Book [bk_name=" + bk_name + ", pubyear=" + pubyear + "]";
	}
	

}
