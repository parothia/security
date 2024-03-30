package com.spring.Security.designpatterns.creational;

public class Factory {
}

interface Product {
	void display();
}
// concrete products
class ConcreteProductA implements Product {
	@Override
	public void display() {
		System.out.println("product a");
	}
}

class ConcreteProductB implements Product {
	@Override
	public void display() {
		System.out.println("product b");
	}
}

class ProductFactory {
	public static Product factoryMethod(String productName) {
		if(productName.equals("producta")) return new ConcreteProductA();
		else return new ConcreteProductB();
	}
}
class TestFactory {
	public static void main(String[] args) {
		Product product = ProductFactory.factoryMethod("producta");
	}
}

/*
Factory design pattern provides approach to code for interface rather than implementation
Factory pattern removes the instantiation of actual implementation classes from client code. Factory pattern makes our code more robust, less coupled and easy to extend.
	For example, we can easily change PC class implementation because client program is unaware of this.
Factory pattern provides abstraction between implementation and client classes through inheritance.
 */


