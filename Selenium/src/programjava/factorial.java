package programjava;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int a=scan.nextInt();
		int res=1;
		int i;
		for(i=a;i>=1;i--)
		{
			res= res*i;
			
		}
		System.out.println(res);

	}

}
