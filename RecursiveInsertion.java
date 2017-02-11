import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RecursiveInsertion {
		
	public static int[] insertionSort(int [] array, int index){
		if( index >= array.length ){
			return array;
		}
			
		else{
			int key = array[index];
			int i = index- 1;
			while(i>=0 && array[i]>key ){
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
		}
		return insertionSort(array, index + 1);
	}
	
	
public static void main(String[] args) {
		
		int []arr =new int [10];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int) ( Math.random()*100);
		
		}
		System.out.print(Arrays.toString(insertionSort(arr, 0)));
	}
}
