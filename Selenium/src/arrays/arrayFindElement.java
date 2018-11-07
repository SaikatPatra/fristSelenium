package arrays;

import java.util.Scanner;

public class arrayFindElement {

	public static void main(String[] args) {
		int i;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the find element ");
		int a = scan.nextInt();
		int[] arr = {10,15,24,29,32,36,39};
		for(i=0;i<=arr.length-1;i++)
		{
		if(a==arr[i])

		System.out.println(a + " Element is present");
	
			
		
		}
		
		

	}

}
