import java.util.Arrays;
import java.util.Scanner;

public class RecursiveSelection {

	public static void main(String[] args) {
		
		int arr[] = new int[10];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int) ( Math.random()*100);
		}
		System.out.print(Arrays.toString(selectionSort(arr, 0)));
		
	}

	
	
	public static int [] selectionSort(int[] array, int index){
		if( index == array.length - 1){
			return array;
		}
		
		int low= index;
	
		for(int i = index + 1; i < array.length; i++){
			if(array[i] < array[low]){
				low = i;
			}
		}
		int temp = array[index];
		array[index] = array[low];
		array[low] = temp;
		return selectionSort(array, index + 1);
	}

}
