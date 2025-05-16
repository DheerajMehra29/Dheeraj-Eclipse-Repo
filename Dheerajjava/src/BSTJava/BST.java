package BSTJava;

public class BST {
	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public BST(int[] arr) {
		this.root = construct(arr, 0, arr.length - 1);
	}

	private Node construct(int[] arr, int low, int high) {
		if (low > high) {
			return null;
		}
		int mid = (low + high) / 2;
		Node node = new Node();
		node.data = arr[mid];
		node.left = construct(arr, low, mid - 1);
		node.right = construct(arr, mid + 1, high);
		return node;

	}

	public void Display() {
		this.Display(this.root);
	}

	private void Display(Node node) {
		if (node == null) {
			return;
		}
		String str = "";
		if (node.left == null) {
			str += ".";
		} else {
			str += node.left.data;
		}
		str += " -> " + node.data + " <- ";
		if (node.right == null) {
			str += ".";
		} else {
			str += node.right.data;
		}
		System.out.println(str);
		Display(node.left);
		Display(node.right);
	}

	public boolean find(int item) {
		return this.find(this.root, item);
	}

	private boolean find(Node node, int item) {
		if (node == null) {
			return false;
		}
		if (item < node.data) {
			return find(node.left, item);
		} else if (item > node.data) {
			return find(node.right, item);
		} else {
			return true;
		}
	}

	public int max() {
		return this.max(this.root);
	}

	private int max(Node node) {
		if (node.right != null) {
			return this.max(node.right);
		}
		return node.data;

	}

	public void add(int item) {
		this.add(this.root, item);
	}

	private void add(Node node, int item) {
		if (item > node.data) {
			if (node.right == null) {
				Node nn = new Node();
				nn.data = item;
				node.right = nn;
			} else {
				add(node.right, item);
			}

		} else {
			if (item < node.data) {
				if (node.left == null) {
					Node nn = new Node();
					nn.data = item;
					node.left = nn;
				} else {
					add(node.left, item);
				}

			}
		}
	}

	public void remove(int item) {
		this.remove(this.root, null, false, item);
	}

	private void remove(Node node, Node parent, boolean ilc, int item) {
		if (node == null) {
			return;
		}
		if (item > node.data) {
			remove(node.right, node, false, item);
		} else if (item < node.data) {
			remove(node.left, node, true, item);
		} else {
			if (node.left == null && node.right == null) {
				if (ilc) {
					parent.left = null;

				} else {
					parent.right = null;
				}
			}
			if (node.left == null && node.right != null) {
				if (ilc) {
					parent.left = node.right;
				} else {
					parent.right = node.right;
				}
			}
			if (node.left != null && node.right == null) {
				if (ilc) {
					parent.left = node.left;
				} else {
					parent.right = node.left;
				}
			}
			if (node.left != null && node.right != null) {
				int max = max(node.left);
				node.data = max;
				remove(node.left, node, false, max);
			}
		}

	}
}