package programjava;

import java.util.Scanner;

public class divisible3And5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if(a%3==0 && a%5==0)
		{
		System.out.println("FIZZBUZZ");	
		}
		else if(a%3==0) 
		{
			System.out.println("FIZZ");
			
		}
		else if (a%5==0)
		{
			System.out.println("BUZZ");
		}
		
			
		
	}

}
