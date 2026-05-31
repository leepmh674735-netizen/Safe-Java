package ch12.sec03.exam03;

public class Person {
	private final String name;
	private final int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String name() { return this.name; }
	public int age() { return this.age; }
	
	@Override
	public int hashCode() { }
	
	@Override
	private boolean equals(0bject obj) { }
	
	@Override
	public String toString() { }
}