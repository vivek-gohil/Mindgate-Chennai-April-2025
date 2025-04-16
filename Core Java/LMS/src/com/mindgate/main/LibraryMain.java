package com.mindgate.main;

import java.time.LocalDate;

import com.mindgate.main.domain.Book;
import com.mindgate.main.domain.BookIssueDetail;
import com.mindgate.main.domain.Member;

public class LibraryMain {
	public static void main(String[] args) {

		// Issue a book from library
		Book book = new Book(1, "Java Reference", "Sun Microsystems", true, false);
		Member member = new Member(1000, "Deepak", "Student");
		BookIssueDetail bookIssueDetail = null;
		if (member.getType().equals("Student")) {
			bookIssueDetail = new BookIssueDetail(101, LocalDate.now(), LocalDate.now().plusDays(10), book, member);
		}
		if (member.getType().equals("Faculty")) {
			bookIssueDetail = new BookIssueDetail(101, LocalDate.now(), LocalDate.now().plusDays(30), book, member);
		}

		System.out.println(bookIssueDetail);
	}
}
