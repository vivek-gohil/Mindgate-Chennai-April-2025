package com.mindgate.main.domain;

import org.springframework.stereotype.Component;
//<bean id="address" class="com.mindgate.main.domain.Address"></bean>
@Component("address")
public class Address {

	private int addressId;
	private String block;
	private String street;
	private String city;
	private long pin;

	public Address() {
		
		System.out.println("Address defualt constructor");
	}

	public Address(int addressId, String block, String street, String city, long pin) {
		super();
		this.addressId = addressId;
		this.block = block;
		this.street = street;
		this.city = city;
		this.pin = pin;
		System.out.println("Adress parameterized constructor");
	}

	public int getAddressId() {
		System.out.println("getAddressId()");
		return addressId;
	}

	public void setAddressId(int addressId) {
		System.out.println("setAddressId() "+ addressId);
		this.addressId = addressId;
	}

	public String getBlock() {
		System.out.println("getBlock()");
		return block;
	}

	public void setBlock(String block) {
		System.out.println("setBlock: " + block);
		this.block = block;
	}

	public String getStreet() {
		System.out.println("getStreet()");
		return street;
	}

	public void setStreet(String street) {
		System.out.println("setStreet(): " + street);
		this.street = street;
	}

	public String getCity() {
		System.out.println("getCity()");
		return city;
	}

	public void setCity(String city) {
		System.out.println("setCity(): "+ city);
		this.city = city;
	}

	public long getPin() {
		System.out.println("getPin()");
		return pin;
	}

	public void setPin(long pin) {
		System.out.println("setpin(): " + pin);
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", block=" + block + ", street=" + street + ", city=" + city
				+ ", pin=" + pin + "]";
	}

}
