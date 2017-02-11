import java.util.Arrays;
import java.util.Stack;


public class IterativeQuickSort {
	static int countMove= 0;
	static int countCompare=0;
		public static int quickSort(int p ,int [] arr, int left, int right){
			int i = left;
			int j = right -2 ;
			int pivot =arr[ p];
				int k = arr[p];
				arr[p] = arr[right-1 ];
				arr[right -1] = k;

			while( i< j){
				if(arr[i] < pivot){
					i++;
				}
				else if(arr[j] >= pivot){
					j--;
				}
				else {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
				countCompare++;
			}
			int index = j;
			if(arr[j] < pivot){
				index++;
			}
			int t= arr[right - 1];
			arr[right -1 ] = arr[index];
			arr[index] = t;
			return index;
		}
	public static void sort(int [] array){
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0);
		stack.push(array.length);
		
		while(!stack.isEmpty()){
			int last =   stack.pop();
			int first= stack.pop();
			if( last - first < 2){
				continue;
			}
			int part = first+((last - first)/2);
			part = quickSort(part,array,first,last);
			
			stack.push(part+1 );
			stack.push(last);
			
			stack.push(first);
			stack.push(part);
			countMove++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub{
		
		int []arr =new int [1000];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int) ( Math.random()*101);
		}
		
		sort(arr);
	System.out.println(Arrays.toString(arr));
		System.out.println("count move: " + countMove);
		System.out.println("count compare: "+countCompare);
	}
}
