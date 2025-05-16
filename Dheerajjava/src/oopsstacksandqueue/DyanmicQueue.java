package oopsstacksandqueue;

public class DyanmicQueue extends QueueUsingArray {

	public DyanmicQueue() throws Exception {
		this(DEFAULT_CAPACITY);

	}

	public DyanmicQueue(int capacity) throws Exception {
		super(capacity);
	}

	@Override
	public void enqueue(int item) throws Exception {
		if(this.size()==this.data.length) {
			int[] arr = new int[2*this.data.length];
			for(int i = 0;i<this.size();i++) {
				arr[i]=this.data[(this.front+1)%this.data.length];
				
			}
			this.data = arr;
			front = 0;
		}
		super.enqueue(item);
	}

}
