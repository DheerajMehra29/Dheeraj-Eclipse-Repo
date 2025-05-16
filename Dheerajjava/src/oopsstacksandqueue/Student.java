package oopsstacksandqueue;

public class Student {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) throws Exception {
		if (name == "") {
			throw new Exception(" Name Cant Be null");
		}

		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if (age < 0) {
			throw new Exception("Age Cant Be Zero");
		}
		this.age = age;
	}

}
