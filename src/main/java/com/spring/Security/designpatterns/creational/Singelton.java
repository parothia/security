package com.spring.Security.designpatterns.creational;

public class Singelton {
	private static Singelton instance;
	
	// making constructor private to restrict create new instance;
	private Singelton() {
	}
	
	//but this will not work for when there are multiple threads
	//not thread safe
	//TYPE - 1
//	public static Singelton getInstance() {
//		if(instance == null)
//			instance = new Singelton();
//		return instance;
//	}
	
	//TYPE - 2
	// not efficient
//	public static synchronized Singelton getInstance() {
//		if(instance==null)
//			instance  = new Singelton();
//		return instance;
//	}
	
	/*TYPE - 3
	* instead of creating object in getInstance which is lazy initilzed..
	*make it eager by
	* private static Singelton instance = new Singelton();
	* JVM executes initializer when the class is loaded and hence this
	* is guaranteed thread safe
	 */
//	public static synchronized Singelton getInstance() {
//		return instance;
//	}
	
	/* TYPE - 4
	* USE DOUBLE-CHECKED LOCKING
	 */
	
	private static volatile Singelton obj = null;
	
	public static Singelton getInstance() {
		if(obj == null) {
			//to make thread safe
			synchronized (Singelton.class)
			{
				// check again as multiple thread can reach above step
				if(obj == null)
					obj = new Singelton();
			}
		}
		return obj;
	}
	
	/*
	 We have declared the obj volatile which ensures that
	 multiple threads offer the obj variable correctly
	 when it is being initialized to the Singleton instance.
	 This method drastically reduces the overhead of calling
	 the synchronized method every time.
	 */
}

/*
Database Connections: In applications where creating and managing database connections is an expensive operation
Printing Service: In systems that involve printing documents or reports, a Singleton printing service can coordinate and manage print jobs, ensuring efficient use of printing resources.
 */
