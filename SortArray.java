import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
		static int countMove = 0;
		static int countCompare = 0;
	public static int[] selectionSort(int [] array){
		
		for(int i = 0; i < array.length - 1; i++){
			int index = i;
			
			for(int j = i+1; j<array.length; j++)
				if(array[j] < array[index]){
					index = j;
					countCompare++;
				}
			int temp = array[index];
			array[index] = array[i];
			array[i] = temp;
			countMove++;
		}
		
		return array;
	}
	public static void main(String args[]){
		
		final int  size = 1000; 
		int arr[] = new int[size];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int) ( Math.random()*100);
		}
		
		System.out.println(Arrays.toString(selectionSort(arr)));
		System.out.println("count move:" +countMove);
		System.out.print("count compare:"+countCompare);
	}
}
