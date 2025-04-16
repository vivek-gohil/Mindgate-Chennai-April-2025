package com.mindgate.main.domain;

public class Member {
	private int memberId;
	private String name;
	private String type;
	public static final int MAX_BOOK_ISSUE_COUNT_FACULTY = 10;
	public static final int MAX_BOOK_ISSUE_COUNT_STUDNET = 5;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(int memberId, String name, String type) {
		super();
		this.memberId = memberId;
		this.name = name;
		this.type = type;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", name=" + name + ", type=" + type + "]";
	}
	
	
	
}
