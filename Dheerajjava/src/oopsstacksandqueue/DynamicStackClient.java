package oopsstacksandqueue;

public class DynamicStackClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackUsingArrays stack = new DynamicStack(5);
		for (int i = 1; i <= 5; i++) {
			stack.push(i * 10);
			stack.Display();
		}
		stack.push(60);
		stack.push(70);
		stack.push(80);
		stack.push(90);
		stack.Display();
		System.out.println(stack.top());
		while (!stack.isEmpty()) {
			stack.pop();
			stack.Display();
		}
		// System.out.println(stack.top());
//		stack.pop();

	}

}
