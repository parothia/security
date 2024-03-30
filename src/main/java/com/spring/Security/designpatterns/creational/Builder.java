package com.spring.Security.designpatterns.creational;

// Builder Design pattern
public class Builder {

}
//@Builder
class Merchant {
	private final String firstName;
	private final String lastName;
	private final Integer age;
	private final String phone;
	
	public Merchant(builder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
	}
	
	public static class builder {
		private String firstName;
		private String lastName;
		private Integer age;
		private String phone;
		
//		public builder() {
//		}
		
		public builder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		public builder lastName(String lastName) {
			this.lastName=lastName;
			return this;
		}

		
		public builder age(Integer age) {
			this.age = age;
			return this;
		}
		
		public builder phone(String phone) {
			this.phone = phone;
			return this;
		}
		
		public Merchant build() {
			return new Merchant(this);
		}
	}
}
