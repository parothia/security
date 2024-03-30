package com.spring.Security.designpatterns.creational;

public class AbstractFactory {
}

abstract class Computer {
	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	
}

class PC extends Computer {
	private String ram;
	private String hdd;
	private String cpu;
	
	public PC(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}
	
	@Override
	public String getRAM() {
		return this.ram;
	}
	
	@Override
	public String getHDD() {
		return this.hdd;
	}
	
	@Override
	public String getCPU() {
		return this.cpu;
	}
}

class Server extends Computer {
	private String ram;
	private String hdd;
	private String cpu;
	
	public Server(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}
	
	@Override
	public String getRAM() {
		return this.ram;
	}
	
	@Override
	public String getHDD() {
		return this.hdd;
	}
	
	@Override
	public String getCPU() {
		return this.cpu;
	}
}

// create abstract factory interface or abstract class
interface ComputerAbstractFactory {
	public Computer createComputer();
}

class PCFactory implements ComputerAbstractFactory {
	private String ram;
	private String hdd;
	private String cpu;
	public PCFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}
	@Override
	public Computer createComputer() {
		return new PC(ram,hdd,cpu);
	}
}

class ServerFactory implements ComputerAbstractFactory {
	private String ram;
	private String hdd;
	private String cpu;
	public ServerFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}
	@Override
	public Computer createComputer() {
		return new Server(ram,hdd,cpu);
	}
}

class ComputerFactory {
	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}
}

class TestPattern {
	public static void main() {
		Computer pc = ComputerFactory.getComputer(new PCFactory("","",""));
		Computer server = ComputerFactory.getComputer(new ServerFactory("","",""));
	}
}





