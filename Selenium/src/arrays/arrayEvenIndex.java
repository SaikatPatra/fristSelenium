package arrays;

public class arrayEvenIndex {

	public static void main(String[] args) {
		int i;
		int[] arr = {10,15,23,29,33,36,39};
		System.out.println(arr.length);
		System.out.println("------------------");
		for(i=0;i<=arr.length-1;i++)
		{
			if(i%2==0)
				System.out.println(arr[i]);
			//else
			//	System.out.println("Not displayed odd index value");
		}

	}

}
