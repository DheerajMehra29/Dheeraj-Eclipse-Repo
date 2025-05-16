package Interfacejava;

public class Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arrI = { 10, 20, 30, 40, 50 };
		String[] arrS = { "A", "B", "C", "D", "E" };
		display(arrI);
		display(arrS);
		Car[] cars = new Car[5];
		cars[0] = new Car(1000, 100, "red");
		cars[1] = new Car(2000, 200, "green");
		cars[2] = new Car(300, 300, "white");
		cars[3] = new Car(400, 400, "black");
		cars[4] = new Car(500, 500, "yellow");
		bubbleSort(cars);
		display(cars);
		
	}

	public static <T> void display(T[] arr) {
		for (T val : arr) {
			System.out.println(val + " ");
		}
		System.out.println();

	}
	public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
		for(int counter = 0;counter<arr.length-1;counter++) {
			for(int  j =0;j<arr.length-1-counter;j++) {
				if(arr[j].compareTo(arr[j+1])>0) {
					T temp   = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
		
	}

}
