import java.util.ArrayList;

public class RecursiveRadixSort {
	
	public static int[] sort(int[] numbers, int d) {

	     if (numbers.length == 0 || d <= 0)
	           return numbers;

	     int[][]gap = new int[10][1];
	     int[] l = new int[10];
	     int i, j = 0;

	      for (j = 0; j < numbers.length; j++) {
	            i = (numbers[j] / d) % 10;
	            l[i]++;
	            gap[i] = add(gap[i], numbers[j]);
	      }
	      for (i = 0; i < 10; i++) {
	          int[] bucket = new int[l[i]];
	          for (int k = 0; k < l[i]; k++) 
	              bucket[k] = gap[i][k];
	          gap[i] = sort(bucket, d / 10); 
	      }
	      int k = 0;
	      for (i = 0; i < 10; i++) {
	          for (j = 0; j < l[i]; j++) {
	              numbers[k] = gap[i][j];
	              k++;
	          }
	      }

	      return numbers; 
	}

	private static int[] add(int[] b, int number) {

	    int[] b2= new int[b.length+1];


	    for (int i = 1; i < b2.length; i++) {
	        b2[i] = b[i-1];
	    }
	    b2[0] = number;

	    return b;

	}
}
