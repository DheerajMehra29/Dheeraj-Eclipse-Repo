package HeapJava;

public class HeapClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap heap = new Heap();
		heap.add(10);
		heap.Display();
		heap.add(20);
		heap.Display();
		heap.add(30);
		heap.Display();
		heap.add(40);
		heap.Display();
		heap.add(5);
		heap.Display();
		heap.add(3);
		heap.Display();
		System.out.println(heap.remove());
		heap.Display();
		System.out.println(heap.get());
		
		

	}

}
