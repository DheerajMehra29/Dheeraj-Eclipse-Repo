package linkedlist;

public class LinkedList {
	private class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public void Display() {
		System.out.println("----------------------");
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + ", ");
			temp = temp.next;

		}
		System.out.println(".");
		System.out.println("--------------------");
	}

	public void AddLast(int item) {
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		if (this.size >= 1) {
			this.tail.next = nn;

		}
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.tail = nn;
			this.size++;
		}
	}

	public void AddFirst(int item) {
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		if (this.size >= 1) {
			nn.next = head;
		}
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.head = nn;
			this.size++;
		}
	}

	public int GetFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is Empty");
		}
		return this.head.data;

	}

	public int GetLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is Empty");
		}
		return this.tail.data;
	}

	public int GetAt(int index) throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is Empty");
		}
		if (index < 0 || index >= size) {
			throw new Exception("Index Out Of Bound");
		}
		Node temp = head;
		for (int i = 1; i <= index; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	private Node GetNodeAt(int index) throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is Empty");
		}
		if (index < 0 || index >= size) {
			throw new Exception("Index Out Of Bound");
		}
		Node temp = head;
		for (int i = 1; i <= index; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void AddAt(int item, int index) throws Exception {
		if (index < 0 || index > size) {
			throw new Exception("Index Out Of Bound");
		}

		if (index == 0) {
			AddFirst(item);
		} else if (index == size) {
			AddLast(item);
		} else {
			Node nn = new Node();
			nn.data = item;
			nn.next = null;
			Node nm1 = GetNodeAt(index - 1);
			Node np1 = nm1.next;
			nm1.next = nn;
			nn.next = np1;
			this.size++;
		}

	}

	public int RemoveFirst() throws Exception {
		if (size == 0) {
			throw new Exception("Ll Is Empty");
		}
		int rv = this.head.data;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			this.head = head.next;
			this.size--;
		}
		return rv;
	}

	public int RemoveLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL Is Empty");
		}
		int rv = this.tail.data;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			Node lm1 = GetNodeAt(this.size - 2);
			this.tail = lm1;
			tail.next = null;
			this.size--;
		}
		return rv;
	}

	public int RemoveAt(int index) throws Exception {
		if (this.size == 0) {
			throw new Exception("LL Is Empty");
		}
		if (index < 0 || index >= size) {
			throw new Exception("Index Out Of Bound");
		}
		if (index == 0) {
			return this.RemoveFirst();
		} else if (index == this.size - 1) {
			return this.RemoveLast();
		} else {
			Node nm1 = GetNodeAt(index - 1);
			Node n = nm1.next;
			Node np1 = n.next;
			nm1.next = np1;
			this.size--;
			return n.data;
		}

	}

	public void ReverseLLData() throws Exception {
		int left = 0;
		int right = this.size - 1;
		while (left < right) {
			Node ln = GetNodeAt(left);
			Node rn = GetNodeAt(right);
			int temp = ln.data;
			ln.data = rn.data;
			rn.data = temp;
			left++;
			right--;

		}

	}

	public void ReverseLLPointers() {
		Node prev = this.head;
		Node curr = prev.next;
		while (curr != null) {
			Node ahead = curr.next;
			curr.next = prev;
			prev = curr;
			curr = ahead;
		}
		Node t = this.head;
		this.head = this.tail;
		this.tail = t;
		this.tail.next = null;
	}

	public int Mid() {
		Node slow = this.head;
		Node fast = this.head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}
}
