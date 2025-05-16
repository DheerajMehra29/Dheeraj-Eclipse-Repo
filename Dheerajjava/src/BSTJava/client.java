package BSTJava;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {10,20,30,40,50,60,70};
BST bst = new BST(arr); 
bst.Display();
System.out.println(bst.find(50));
System.out.println();
bst.add(55);
bst.Display();
System.out.println("_______________");
bst.remove(55);
bst.Display();
System.out.println("__________________");
bst.remove(40);
bst.Display();
	}

}
