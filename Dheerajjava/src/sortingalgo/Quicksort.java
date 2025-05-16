package sortingalgo;

public class Quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {40,20,90,30,70,10,80,60,50};
		QuickSort(arr,0,arr.length - 1);
		for(int val:arr) {
			System.out.print(val +"," + "");
		}

	}
	public static void QuickSort(int[] arr,int lo,int hi) {
		if(lo>=hi) {
			return;
		}
		int mid = (lo +hi)/2;
		int pivot  = arr[mid];
		int left = lo;
		int right = hi;
		while(left<=right) {
			while(arr[left]<pivot) {
				left ++;
				
				
			}
			while(arr[right]>pivot) {
				right --;
			}
			if(left<=right) {
				int temp = arr[left];
				arr[left] = arr[right]; 
			arr[right] = temp;
			left++;
			right--;
			}
			
		}
		QuickSort(arr,lo,right);
		QuickSort(arr,left,hi);
	}

}
