package dsa.day8.practice;

public class PassingCarCount 
{

	public static void main(String[] args) 
	{
		int arr[] = {0, 1, 0, 1, 1,0};
		int ans = solution.getSolution(arr);
		System.out.println(ans);
	}
}
class solution
{
	static int getSolution(int arr[]) 
	{
		int countZero = 0;
		int count = 0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==0)
				countZero++;
			else 
				count += countZero;
		}
		if(arr.length > 1000000000)
		   return -1;
		return count;

	}
}

class LimitExceededExcpetion extends RuntimeException
{
	String str = "-1";

	public LimitExceededExcpetion(String str) {
		super();
		this.str = str;
	}
	
}