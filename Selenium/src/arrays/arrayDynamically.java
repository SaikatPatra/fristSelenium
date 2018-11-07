package arrays;

import java.util.Scanner;

public class arrayDynamically {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the size of array length");
	int[] arr = new int[scan.nextInt()];
	System.out.println("Enter the element");
	for(int i=0;i<=arr.length-1;i++)
		System.out.println(arr[i]);
	

	}

}
