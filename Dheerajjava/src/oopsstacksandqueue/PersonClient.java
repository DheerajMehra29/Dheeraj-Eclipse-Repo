package oopsstacksandqueue;

public class PersonClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person(25,"Dheeraj");
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		p1.setName("Dheeraj");
		p1.setAge(19);
		p2.setName("Soul");
		p2.setAge(19);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		System.out.println(p3.getAge());
		System.out.println(p3.getName());
	}

}
