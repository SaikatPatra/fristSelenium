package programjava;

import java.util.Scanner;

public class perfectNumber {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	int temp = num;
	int sum=0;
	
for(int i=1;i<=num/2;i++){
	if(num%i==0){
	
	sum=sum+i;
	}
}
	
if(temp==sum){
	System.out.println("Number is perfect");
}
else{
	System.out.println("Number is not perfect");
}
	
}
	}

