package Library.Management.System;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import LibraryMSPolymorphism.Display;

public class Library extends Book{
	
	
	private long contactno;

	

	public Library(String author_name, String bk_name, int pubyear, long contactno) {
		super(author_name, bk_name, pubyear);
		this.contactno = contactno;
	}

	public long getContactno() {
		return contactno;
	}

	public void setContactno(long contactno) {
		this.contactno = contactno;
	}
	
}	