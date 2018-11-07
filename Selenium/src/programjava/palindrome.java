package programjava;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	int a=scan.nextInt();
	int temp=a;
	int rev=0;
	while(a!=0)
	{
	int rem=a%10;
	 a=a/10;
	rev= (rev*10)+rem;
	}
	if(rev==temp)
	{
	System.out.println(temp+" is palindrome number");
	}
	else
	{
		System.out.println(temp+" is not palindrome number");
	}

	
	}
}
