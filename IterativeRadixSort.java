import java.util.Arrays;

public class IterativeRadixSort {
	static int countMove = 0;
	static int countCompare =0;
	public static void radix( int [] arr){
		int [] b = new int [10];  
		int e =1;
		for(int i = 1; i < arr.length; i++){
			if(arr[i] > arr[0]){
				arr[0] = arr[i];
				//
			}
		}
		while( arr[0]/e > 0){
			int []c = new int[10];
			for (int i=0; i < arr.length; i++){
				c[(arr[i]/e) % 10]++;
				countCompare++;
			}
			for( int i =1; i <10; i++){
				c[i] += c[i-1];
				
			}
			for(int i = arr.length -1; i >= 0; i--){
				b[-- c[(arr[i])/ e% 10]] = arr[i];
				
			}
			for(int i =0; i < arr.length ; i++){
				arr[i] = b[i];
				countMove++;
			}
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub{
		
		int []arr =new int [10];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int) ( Math.random()*100);
		}
		radix(arr);
	System.out.println(Arrays.toString(arr));
	System.out.println("count move: " + countMove);
	System.out.println("count compare: " + countCompare);
		
	}
}
