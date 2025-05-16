package BinaryTreeJava;

import java.util.LinkedList;
import java.util.Scanner;

public class BinaryTree {
	private class Node {
		int data;
		Node left;
		Node right;

		Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;

		}
	}

	private Node root;
	private int size;

	BinaryTree() {
		Scanner s = new Scanner(System.in);
		this.root = takeInput(s, null, false);
	}

	private Node takeInput(Scanner s, Node Parent, boolean isLeftOrRight) {
		if (Parent == null) {
			System.out.println("Enter the data for root node");
		} else {
			if (isLeftOrRight) {
				System.out.println("Enter the data for leftchild of" + Parent.data);
			} else {
				System.out.println("Enter the data for right child" + Parent.data);

			}

		}
		int nodeData = s.nextInt();
		Node node = new Node(nodeData, null, null);
		this.size++;
		boolean choice = false;
		System.out.println("Do you have left child of" + node.data);
		choice = s.nextBoolean();
		if (choice) {
			node.left = takeInput(s, node, true);

		}
		choice = false;
		System.out.println("Do you have right child of" + node.data);
		choice = s.nextBoolean();
		if (choice) {
			node.right = takeInput(s, node, false);

		}
		return node;

	}

	public void Display() {
		this.Display(this.root);
	}

	private void Display(Node node) {
		if (node.left != null) {
			System.out.print(node.left.data + "=>");
		} else {
			System.out.print("END=>");
		}
		System.out.print(node.data);
		if (node.right != null) {
			System.out.print("<=" + node.right.data);
		} else {
			System.out.print("<=END");
		}
		System.out.println();
		if (node.left != null) {
			this.Display(node.left);
		}
		if (node.right != null) {
			this.Display(node.right);
		}
	}

	public int height() {
		return this.height(this.root);
	}

	private int height(Node node) {
		if (node == null) {
			return -1;
		}
		int lheight = this.height(node.left);
		int rheight = this.height(node.right);
		int fheight = Math.max(lheight, rheight) + 1;
		return fheight;

	}

	public void preOrder() {
		this.preOrder(this.root);
	}

	private void preOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + ",");
		preOrder(node.left);
		preOrder(node.right);

	}

	public void postOrder() {
		System.out.println();
		this.postOrder(this.root);
	}

	private void postOrder(Node node) {
		if (node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + ",");
	}
	public void inOrder() {
		System.out.println();
		this.inOrder(this.root);
	}

	private void inOrder(Node node) {
		if (node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.data + ",");
		inOrder(node.right);
		
	}
	public void levelOrder() {
		System.out.println();
		this.levelOrder(this.root);
	}

	private void levelOrder(Node node) {
		LinkedList<Node> queue  = new LinkedList<>();
		queue.add(this.root);
		while(!queue.isEmpty()) {
			Node rv = queue.removeFirst();
			System.out.print(rv.data+ ",");
			if(rv.left!=null) {
				queue.addLast(rv.left);
			}
			if(rv.right!=null) {
				queue.addLast(rv.right);
			}
			
		}
	}

}
