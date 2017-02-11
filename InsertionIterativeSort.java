import java.util.Arrays;
import java.util.Scanner;


public class InsertionIterativeSort {
	static int countCompare;
	static int countMove;
	public  static int[] insertionSort(int [] array){
		for( int i = 0; i < array.length; i++){
			for( int  j = i; j> 0 ; j--){
				countCompare++;
				if(array[j] < array[j - 1]){	
				int temp = array[j];
				array[j] = array[j-1];
				array[j-1] = temp;
				countMove++;
				}
			}
		}
		return array;
	}
	public static void main(String[] args) {
		
		int arr[] = new int[1000];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int) ( Math.random()*100);
		
		}
		System.out.println(Arrays.toString(insertionSort(arr)));
		System.out.println("count move: " + countMove);
		System.out.println("count compare: " + countCompare);
	}
}
