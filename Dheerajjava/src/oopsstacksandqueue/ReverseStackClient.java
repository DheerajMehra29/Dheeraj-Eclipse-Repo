package oopsstacksandqueue;

public class ReverseStackClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackUsingArrays stack = new StackUsingArrays();
		StackUsingArrays helper = new StackUsingArrays();
		for (int i = 1; i <= 5; i++) {
			stack.push(i * 10);

		}
		stack.Display();
		reverseStack(stack, helper, 0);
		stack.Display();

	}

	public static void reverseStack(StackUsingArrays stack, StackUsingArrays helper, int index) throws Exception {
		if (stack.isEmpty()) {
			return;
		}
		int item = stack.pop();
reverseStack(stack,helper,index+1);
helper.push(item);
if(index==0) {
	while(!helper.isEmpty()) {
		stack.push(helper.pop());
	}
}
	}
}
