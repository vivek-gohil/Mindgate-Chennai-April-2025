package com.mindgate.main.service;

import com.mindgate.main.domain.Book;
import com.mindgate.main.repository.BookRepositoryInteface;

public class BookServiceImpl implements BookServiceInterface {

	private BookRepositoryInteface bookRepositoryInteface;

	public BookServiceImpl() {
		System.out.println("BookServiceImpl default constructor");
	}

	public BookServiceImpl(BookRepositoryInteface bookRepositoryInteface) {
		super();
		this.bookRepositoryInteface = bookRepositoryInteface;
		System.out.println("BookServiceImpl parameterized constructor");
	}


	public void setBookRepositoryInteface(BookRepositoryInteface bookRepositoryInteface) {
		System.out.println("setBookRepositoryInterface()");
		this.bookRepositoryInteface = bookRepositoryInteface;
	}

	@Override
	public boolean addNewBook(Book book) {
		return bookRepositoryInteface.addNewBook(book);
	}

}
