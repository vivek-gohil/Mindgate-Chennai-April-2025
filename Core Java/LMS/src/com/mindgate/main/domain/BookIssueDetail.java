package com.mindgate.main.domain;

import java.time.LocalDate;

public class BookIssueDetail {
	private int bookIssueId;
	private LocalDate issueDate;
	private LocalDate returnDate;
	//Composition = Has a 
	private Book book;
	private Member member;

	public BookIssueDetail() {
		// TODO Auto-generated constructor stub
	}

	public BookIssueDetail(int bookIssueId, LocalDate issueDate, LocalDate returnDate, Book book, Member member) {
		super();
		this.bookIssueId = bookIssueId;
		this.issueDate = issueDate;
		this.returnDate = returnDate;
		this.book = book;
		this.member = member;
	}

	public int getBookIssueId() {
		return bookIssueId;
	}

	public void setBookIssueId(int bookIssueId) {
		this.bookIssueId = bookIssueId;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	@Override
	public String toString() {
		return "BookIssueDetail [bookIssueId=" + bookIssueId + ", issueDate=" + issueDate + ", returnDate=" + returnDate
				+ ", book=" + book + ", member=" + member + "]";
	}

}
