package programjava;

import java.util.Scanner;


public class deciTobinary {
	static String str="";
	public static String tobinary(int a)
	{
		
		if(a>0)
		{
			tobinary(a/2);
		}
		str=str+(a%2);
		return str;
	}

	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String res=tobinary(a);
		System.out.println(res);


	}
	
}

