package oopsstacksandqueue;

public class StackUsingArrayClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackUsingArrays stack = new StackUsingArrays(5);
		for (int i = 1; i <= 5; i++) {
			stack.push(i * 10);
			stack.Display();
		}
		// stack.push(60);
		System.out.println(stack.top());
		while (!stack.isEmpty()) {
			stack.pop();
			stack.Display();
		}
		// System.out.println(stack.top());
//		stack.pop();

	}
}
