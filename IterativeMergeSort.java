import java.util.Arrays;
import java.util.Scanner;

public class IterativeMergeSort {
	static int countMove;
	static int countCompare;
	public static void main(String[] args) {
		// TODO Auto-generated method stub{
		
		int []arr =new int [10];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int) ( Math.random()*100);
		
		}
		//System.out.println((merge(arr, 0)));
	}
	
	public static  void mergeSort(int [] array, int n){
		if( array.length > 1){
			 int mid = array.length /2;

			int [] first = new int[mid];
			for(int i = 0; i < mid; i++){
				first[i] = array[i];
			}
			int [] last = new int[array.length - mid];
			for(int i = mid; i < array.length; i++){
				last[ i - mid] = array[i];
			}
			
			
			
			int i = 0;
			int j =0;
			int l = 0;
			while ( i < first.length && l < last.length ){
				if(first[i] < last[l]){
					array[j] = first[i];
							i++;
				}
				else{
					array[j] = last[l];
					l++;
				}
				j++;
			}
			while ( i < first.length){
				array[j] = first[i];
				i++;
				j++;
			}
			while(l < last.length){
				array[j] = last[l];
				j++;
				l++;
			}
		}
		
	}
	
	public static void merge(int [] array, int n){
		int size;
		int firstStart;
		
		for( size =1 ; size <= n -1; size = 2 * size){
			for(firstStart = 0; firstStart< n -1; firstStart += 2 * size){
				int mid = firstStart + size - 1;
				
				int last = Math.min(firstStart + 2*size - 1, n -1);
				
				 mergeSort(array, firstStart);
			}
		}
		
	}
}
