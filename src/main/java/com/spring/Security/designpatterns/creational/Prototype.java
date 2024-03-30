package com.spring.Security.designpatterns.creational;

import org.springframework.beans.factory.annotation.Autowired;

/*
A Prototype Design Pattern is a creational pattern
that helps to create new objects by copying an existing object.
 */
/*
Imagine you own a sheep farm, and you need to create multiple sheep with similar characteristics.
Instead of creating each sheep from scratch, you can use the Prototype Pattern to clone existing sheep.
Each cloned sheep will retain the common attributes while allowing for individual customization.
 */

interface Sheep {
	Sheep clone();
	String getName();
	void setName(String name);
}
/* Implement sheep in blacksheep class
 */
class BlackSheep implements Sheep {
	private String name;
	
	public BlackSheep(String name) {
		this.name=name;
	}
	@Override
	public Sheep clone() {
		return new BlackSheep(this.name);
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public void setName(String name) {
		this.name=name;
	}
}


class SheepFarm {
	public static void main(String[] args) {
		// create prototype sheep
		Sheep blackPrototype = new BlackSheep("Black sheep");
		// clone sheep as needed;
		Sheep cloneBlackSheep = blackPrototype.clone();
		//customized cloned sheep
		cloneBlackSheep.setName("customized Black Sheep");
	}
}

/*
Easy Object Cloning
Individual Customization
Streamlined Object Creation: The pattern provides a structured and consistent way to create objects, making the codebase more organized and easier to maintain.
 */
/*
Shallow vs Deep Copy: In scenarios where objects contain references to other objects (e.g., nested objects), cloning might result in shallow copies by default. This means that changes to the nested objects in a cloned object can affect the original object and vice versa. Deep copying may be required, which can be complex to implement.
Creating Concrete Prototypes: Implementing the Prototype Pattern often involves creating concrete prototype classes and customizing their clone methods. This can introduce additional classes and complexity.
Compatibility with Serialization: If you need to clone objects that are serializable, you might encounter challenges related to object serialization and deserialization.
 */
