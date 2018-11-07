package programjava;


public class gcdOrHcf {
	public static int gcd(int a,int b){
		if(b!=0)
		{
			return gcd(b,a%b);
		}
		else
		{
		
		return a;
		}
		
	}
	
	public static void main(String[] args) {
		int res = gcd(60,36);
		System.out.println("GCD is " +res );

	}}
