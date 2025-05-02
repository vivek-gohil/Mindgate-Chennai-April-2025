package com.mindgate.main.domain;

public class Book {
	private int bookId;
	private String title;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int bookId, String title) {
		super();
		this.bookId = bookId;
		this.title = title;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + "]";
	}

}
