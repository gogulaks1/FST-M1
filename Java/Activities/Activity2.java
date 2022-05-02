

//In this activity, we are writing a program to check if the sum of all the 10's in the array is exactly 30.
//
//The program returns false if the condition does not satisfy, otherwise returns true.
//
//Instructions:
//
//    Add a Class named Activity2.
//    In the main() method:
//    Initialize an array with 6 number: [10, 77, 10, 54, -11, 10]
//    Find the 10's in the array and add them
//    Check if value is equal to 30.

package FST_Java;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] numarr = {10, 77, 10, 54, -11, 10};
       System.out.println("Arraylist:" +Arrays.toString(numarr));
       int searchnum=10;
       int totalvalue=30;
       System.out.println("Result:" + result (numarr,searchnum,totalvalue));
      
	}

	private static int result(int[] numarr, int searchnum, int totalvalue) {

		int tempsum=0;
		
		for (int number: numarr) {
			if(number==searchnum) {
				tempsum+=searchnum;
				
			}
			if(tempsum>searchnum) {
				break;
				
				
			}
		}
		return tempsum=totalvalue;
	}

}
