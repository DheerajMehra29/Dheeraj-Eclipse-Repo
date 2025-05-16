package oopsstacksandqueue;

public class Person {
	private String name;
	private int age;

	public Person() {
		System.out.println("DEFAULT CONSTRUCTOR");
	}

	public Person(int age,String name) {
		System.out.println("PARAMETERIZED  CONSTRUCTOR");
		this.age = age;
		this.name =name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
