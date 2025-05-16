package oopsstacksandqueue;

public class DynamicQueueClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		QueueUsingArray queue = new DyanmicQueue();
		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i * 10);
			queue.Display();
		}
		queue.enqueue(60);
		queue.enqueue(70);
		queue.enqueue(80);
		queue.Display();
		System.out.println(queue.front());
		System.out.println("********************");
//		while(!queue.IsEmpty()) {
//			queue.Display();
//			queue.dequeue();
//			queue.Display();
//		}

		queue.dequeue();
		queue.dequeue();
		queue.Display();
		queue.enqueue(60);
		queue.enqueue(70);
		queue.Display();
		queue.dequeue();
		queue.Display();
		System.out.println(queue.IsEmpty());
	}

}
