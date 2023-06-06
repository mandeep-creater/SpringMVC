package com.springcore.auto.wireannotation;

public class Address {
	private String Street;
	private String City;
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public Address(String street, String city) {
		super();
		Street = street;
		City = city;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [Street=" + Street + ", City=" + City + "]";
	}
	
	
}
