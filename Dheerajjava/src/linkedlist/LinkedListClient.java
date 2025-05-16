package linkedlist;

public class LinkedListClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.AddFirst(10);
		list.AddLast(20);
		list.AddLast(30);
		list.AddFirst(40);
		list.AddFirst(50);
		list.Display();
//		for(int i = 1;i<=5;i++) {
//		list.AddFirst(i*10);
//	}
//	list.Display();
		System.out.println(list.GetFirst());
		System.out.println(list.GetLast());
		System.out.println(list.GetAt(2));
		//System.out.println(list.GetNodeAt(2));
		list.AddAt(60,2);
		list.Display();
		System.out.println(list.RemoveFirst());
		list.Display();
		System.out.println(list.RemoveLast());
		list.Display();
		System.out.println(list.RemoveAt(2));
		list.Display();
		list.AddFirst(70);
		list.AddFirst(80);
		list.Display();
		list.ReverseLLData();
		list.Display();
		list.ReverseLLPointers();
		list.Display();
		System.out.println(list.Mid());
	}

}
