package com.esh.creational;

abstract class Computer {

	public abstract String getRAM();

	public abstract String getHDD();

	public abstract String getCPU();

	@Override
	public String toString() {
		return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ", CPU=" + this.getCPU();
	}
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
class ComputerFactory1 {
	public static Computer getComputer(String type, String ram, String hdd, String cpu){
		if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
		else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);
		
		return null;
	}
}

interface ComputerAbstractFactory{
	Computer createComputer();
}

class PCFactory implements ComputerAbstractFactory{
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
		return new PC(ram, hdd, cpu);
	}
}

class ServerFactory implements ComputerAbstractFactory{
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
		return new PC(ram, hdd, cpu);
	}
}

class ComputerFactory2{
	 static Computer getComputer(ComputerAbstractFactory factory){
		 return factory.createComputer();
	 }
}
public class FactoryEx {
	public static void main(String[] args) {
		//Factory pattern
		System.out.println(ComputerFactory1.getComputer("PC", "ram", "hdd", "cpu").toString());
		//Abstract factory pattern
		System.out.println(ComputerFactory2.getComputer(new PCFactory("ram", "hdd", "cpu")).toString());
	}
}
