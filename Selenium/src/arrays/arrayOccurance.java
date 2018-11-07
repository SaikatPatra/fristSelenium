package arrays;

import java.util.Scanner;

public class arrayOccurance {

	public static void main(String[] args) {
		int i;
		int b= 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the element");
		int a = scan.nextInt();
		int[] arr ={10,20,22,22,20,10,10,30};
		for( i=0;i<=arr.length-1;i++ )
		{
			if(a==arr[i])
				for(b=1;b<10;b++)
			System.out.println(b);
		}	
			

	}

}
