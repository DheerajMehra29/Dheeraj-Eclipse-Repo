package BinaryTreeJava;

public class BinaryTreeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BinaryTree BT = new BinaryTree();
BT.Display();
System.out.println(BT.height());
BT.preOrder();
BT.postOrder();
BT.inOrder();
BT.levelOrder();

	}

}
 //50 true 25 true 38 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
