import java.util.Arrays;
import java.util.Scanner;

public class RecursiveShellSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub{
		
		int []arr =new int [10];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int) ( Math.random()*100);
		
		}
		System.out.print(Arrays.toString(shellSort(arr, 0)));
	}
	public static int[] shellSort(int [] array, int gap){
		 gap = 1;
		int k = 0;
		while(gap < array.length){
			for( int i = gap; i < array.length  ; i++){
				int index = i ;
				int temp = array[index];
				while( index>= gap && array[ index- gap]> temp){
					array[index] = array[index - gap];
					index = index -  gap;
				}
				array[index] = temp;
			}
			 k = k+1;
			 gap = (int)(java.lang.Math.pow(2,k) - (int)1);
			}
		return shellSort(array,gap);
		}
	}

