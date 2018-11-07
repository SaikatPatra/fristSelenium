package arrays;

public class arraySwap {

	public static void main(String[] args) {
		int i;
		int[] arr ={12,20,25,4,0};
		System.out.println(arr.length);
		System.out.println("----------------------");
		for( i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("-----------------");
		for(i=arr.length-1;i>=0;i--)
		{
          System.out.println(arr[i]);
		}
	}

}
