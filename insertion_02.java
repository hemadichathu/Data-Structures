package dd;
import java.util.Arrays;

public class InsertionsortOptimization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] array=new int[5];
			
			array[0]=11;
			array[1]=22;
			array[2]=33;
			array[3]=44;
			array[4]=55;
	        
			System.out.println("Original array: " + Arrays.toString(array));
	        insertionSort(array);
	        System.out.println("Sorted array: " + Arrays.toString(array));

	}
	static void insertionSort(int[] array) {
      int n = array.length;
      for (int i = 1; i < n; ++i) {
          int key = array[i];
          int j = i - 1;

        
          
          while (j >= 0 && array[j] > key) {
              array[j + 1] = array[j];
              j = j - 1;
          }
          array[j + 1] = key;
      }
  }

}

