package oopsstacksandqueue;

public class StudentClient {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Student s1 = new Student();
//		s1.setName("A");
//		s1.setAge(-12);
	try {
		s1.setAge(19);
		System.out.println("Age Set , No Error");
		}
		catch(Exception e) {
			System.out.println("Negative Age");
		}
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		
		try {
			s1.setName("");
			System.out.println("your name");
		}catch(Exception e) {
			System.out.println("you entered no name");
		}
		System.out.println(s1.getAge());
	}

}
