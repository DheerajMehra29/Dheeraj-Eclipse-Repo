package HashMapJava.Generics;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

import BinaryTreeJava.topview.QueueNode;

public class LinkedList<T> implements Queue<QueueNode> {
		private class Node {
			T data;
			Node next;

			Node(T data, Node next) {
				this.data = data;
				this.next = next;
			}
		}

		Node head;
		Node tail;
		int size;

		public LinkedList() {
			// TODO Auto-generated constructor stub
			this.head = null;
			this.tail = null;
			this.size = 0;
		}

		public int size() {
			return this.size;
		}

		public boolean isEmpty() {
			return this.size() == 0;
		}

		public void addFirst(T data) {
			Node node = new Node(data, this.head);
			this.head = node;
			if (this.isEmpty()) {
				this.tail = node;
			}
			this.size++;
		}

		public void addLast(T data) {
			Node node = new Node(data, null);
			if (this.isEmpty()) {
				this.head = node;
				this.tail = node;
			} else {
				this.tail.next = node;
				this.tail = node;
			}
			this.size++;
		}

		private Node getNodeAt(int index) throws Exception {
			if (index < 0 || index >= this.size) {
				throw new Exception("Invalid index");
			}
			int counter = 0;
			Node temp = this.head;
			while (counter < index) {
				temp = temp.next;
				counter++;
			}
			return temp;
		}

		public void addAt(int index, T data) throws Exception {
			if (index < 0 || index > this.size) {
				throw new Exception("Invalid Index");
			}
			if (index == 0) {
				this.addFirst(data);
			} else if (index == this.size) {
				this.addLast(data);
			} else {
				Node temp = this.getNodeAt(index - 1);
				Node node = new Node(data, temp.next);
				temp.next = node;
				this.size++;
			}
		}

		public T getFirst() throws Exception {
			if (this.isEmpty()) {
				throw new Exception("List is Empty");
			}

			return this.head.data;
		}

		public T getLast() throws Exception {
			if (this.isEmpty()) {
				throw new Exception("List is Empty");
			}

			return this.tail.data;
		}

		public T getAt(int index) throws Exception {
			if (this.isEmpty()) {
				throw new Exception("List is Empty");
			}

			if (index < 0 || index >= this.size) {
				throw new Exception("Invalid index");
			}

			return this.getNodeAt(index).data;
		}

		public T removeFirst() throws Exception {
			if (this.isEmpty()) {
				throw new Exception("List is Empty");
			}

			Node rv = this.head;
			if (this.size() == 1) {
				this.head = null;
				this.tail = null;
			} else {
				this.head = this.head.next;
			}

			this.size--;
			return rv.data;
		}

		public T removeLast() throws Exception {
			if (this.isEmpty()) {
				throw new Exception("List is Empty");
			}

			Node rv = this.tail;
			if (this.size() == 1) {
				this.head = null;
				this.tail = null;
			} else {
				Node temp = this.getNodeAt(this.size - 2);
				temp.next = null;
				this.tail = temp;
			}

			this.size--;
			return rv.data;
		}

		public T removeAt(int index) throws Exception {
			if (index < 0 || index >= this.size) {
				throw new Exception("Invalid index");
			}

			if (this.isEmpty()) {
				throw new Exception("List is Empty");
			}

			if (index == 0) {
				return this.removeFirst();
			} else if (index == this.size - 1) {
				return this.removeLast();
			} else {
				Node temp = this.getNodeAt(index - 1);
				Node rv = temp.next;
				temp.next = temp.next.next;
				this.size--;
				return rv.data;
			}
		}

		public void display() {
			Node temp = this.head;
			while (temp != null) {
				System.out.print(temp.data + "=>");
				temp = temp.next;
			}
			System.out.println("END");
		}

		public int find(T data) {
			int index = 0;
			for (Node temp = this.head; temp != null; temp = temp.next) {
				if (temp.data.equals(data)) {
					return index;
				}
				index++;
			}

			return -1;
		}

		public String toString() {
			String str = "";
			Node temp = this.head;
			while (temp != null) {
				str = str + temp.data + "=>";
				temp = temp.next;
			}
			str = str + "END";
			return str;
		}

		@Override
		public boolean addAll(Collection<? extends QueueNode> arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean contains(Object arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean containsAll(Collection<?> arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Iterator<QueueNode> iterator() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean remove(Object arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean removeAll(Collection<?> arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean retainAll(Collection<?> arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object[] toArray() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <T> T[] toArray(T[] arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean add(QueueNode e) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public QueueNode element() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean offer(QueueNode e) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public QueueNode peek() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public QueueNode poll() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public QueueNode remove() {
			// TODO Auto-generated method stub
			return null;
		}
	}

