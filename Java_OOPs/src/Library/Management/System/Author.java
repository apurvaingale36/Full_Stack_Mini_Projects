package Library.Management.System;

public class Author implements Display{
	
	private String author_name;
	
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public Author(String author_name) {
		super();
		this.author_name = author_name;
	}

	@Override
	public String dispaly() {
		// TODO Auto-generated method stub
		return "Author [author_name=" + author_name + "]";
	}

	
	
	
	
	
}
