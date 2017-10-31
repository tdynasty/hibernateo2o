package pojo;

import java.util.HashSet;
import java.util.Set;

import javassist.expr.NewArray;

public class Category {
	private int cid;
	private String cname;
	
	private Set<Book> books=new HashSet<Book>();
	
	public Set<Book> getBooks() {
		return books;
	}
	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}

}
