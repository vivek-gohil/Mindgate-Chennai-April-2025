package com.mindgate.main.repository;

import com.mindgate.main.domain.Book;

public class BookRepositoryImpl implements BookRepositoryInteface {

	public BookRepositoryImpl() {
		System.out.println("BookRepositoryImpl default constructor");
	}

	@Override
	public boolean addNewBook(Book book) {
		System.out.println("Book is successfully added into database");
		System.out.println(book);
		return true;
	}

}
