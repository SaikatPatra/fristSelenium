package programjava;


public class febonacci {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int i;
		for(i=0;i<=10;i++)
		{
			System.out.print(a+ " ");
			int res= a+b;
			a=b;
			b=res;
		}
		
	}

}
