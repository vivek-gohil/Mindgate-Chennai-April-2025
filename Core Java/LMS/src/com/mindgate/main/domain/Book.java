package com.mindgate.main.domain;

public class Book {
	private int bookId;
	private String title;
	private String author;
	private boolean isIssuable;
	private boolean isIssued;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int bookId, String title, String author, boolean isIssuable, boolean isIssued) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.isIssuable = isIssuable;
		this.isIssued = isIssued;
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isIssuable() {
		return isIssuable;
	}

	public void setIssuable(boolean isIssuable) {
		this.isIssuable = isIssuable;
	}

	public boolean isIssued() {
		return isIssued;
	}

	public void setIssued(boolean isIssued) {
		this.isIssued = isIssued;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", isIssuable=" + isIssuable
				+ ", isIssued=" + isIssued + "]";
	}

}
