import java.util.Arrays;
import java.util.Scanner;

public class RecursiveQuickSort {
	
	private int arr[];
	private int length;
		public void quickSort( int left, int right){
			int i = left, j = right;
			int temp;
			int pivot = arr[left + (right - left) / 2];
			
			while( i<=j){
				while(arr[i] < pivot){
					i++;
				}
				while(arr[j] > pivot){
					j--;
				}
				if(i <= j ){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					i++;
					j--;
				}
			}
			
			if(left < j ){
				quickSort( left, j );
			}
			if( i < right){
				quickSort(i, right);
			}
		}
		public void sort(int [] array){
			if( array == null || array.length == 0){
				return;
			}
			this.arr = array;
			 length = array.length;
			quickSort(0,length - 1);
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub{
			
			int []arr =new int [10];
			RecursiveQuickSort quickSort = new RecursiveQuickSort();
			for(int i = 0; i < arr.length; i++){
				arr[i] = (int) ( Math.random()*100);
			}
			
			quickSort.sort(arr);
		System.out.println(Arrays.toString(arr));
			
			
		}
}
