package programjava;

public class pattern3 {

	public static void main(String[] args) {
		int i;
		int j;
		int k=0;
		int l=1;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=4;j++)
			{
				if(i%2==0)
				{
					System.out.print(k);
				}
				else
				{
					System.out.print(l);
				}
			
			}
			System.out.println();
		}

	}

}
