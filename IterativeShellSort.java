import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;
public class IterativeShellSort {
	static int countMove = 0;
	static int countCompare =0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub{
		
		int []arr =new int [1000];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int) ( Math.random()*101);
		
		}
		System.out.println(Arrays.toString(shellSort(arr)));
		System.out.println("count move: " + countMove);
		System.out.println("count compare: " + countCompare);
		
	}
	
	public static int[] shellSort(int [] array){
		int gap = 1;
		int k = 0;
		while(gap < array.length){
			for( int i = gap; i < array.length  ; i++){
				int index = i ;
				int temp = array[index];
				while( index>= gap && array[ index- gap]> temp){
					array[index] = array[index - gap];
					index = index -  gap;
					countCompare++;
				}
				array[index] = temp;	
				countMove++;
			}
			 k = k+1;
			gap = (int)(java.lang.Math.pow(2,k) - (int)1);
			 
			}
		return array;
		}
	}


