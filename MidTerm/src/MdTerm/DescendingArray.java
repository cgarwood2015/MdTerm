package MdTerm;

import java.util.Arrays;  //Arrays class user for array manipulation.

public class DescendingArray {

	public static void main(String[] args) {
		int a[] = {1,5,3,7,9,0,2,6,4,8};
		Arrays.sort(a);  //sort the array
		
		//Print the array in descending order.
		for(int counter = a.length -1; counter >= 0;counter--){
			System.out.println(a[counter]);
		}
		
		

	}

}
