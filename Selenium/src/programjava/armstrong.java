package programjava;

public class armstrong {
public static int noOfDigits(int num)
{
	int count = 0;
while(num>0){
	count++;
	num= num/10;
}
return count;
}
public static int power(int num, int count){
	int mul=1;
	for(int i=1;i<=count;i++)
	{
		mul=mul*num;
	}
	
	return mul;
	
}



	public static void main(String[] args) {
		int num = 153; int temp = num;
		int count = noOfDigits(num);
		int res=0;
		while(num>0){
			int rem=num%10;
			res=res+power(rem,count);
			num = num/10;
		}
		
		if (temp== res){
			System.out.println("aramstrong number");
		}
		else
		{
			System.out.println("not aramstrong number");
		}

	}

}
