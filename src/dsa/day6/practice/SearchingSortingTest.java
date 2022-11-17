package dsa.day6.practice;

import java.util.Scanner;

public class SearchingSortingTest 
{
	static boolean found = false;
	static int data;
	
	public static void main(String[] args) 
	{
		int arr[] = { 100,90,80,70,60,50,40,30,20,10};
		
		for (int i=0; i<arr.length; i++ )
		{
			System.out.println("Array Element : "+arr[i]);
		}
		
		data = MyIOService.getInteger("Enter data to search : ");
		
		for(int i=0;i<arr.length;i++) 
		{
			if(data == arr[i]) 
			{
				found =true;
				break;
			}
		}
		if(found==true) {
			System.out.println("data found : "+data);
		}
		else {
			System.out.println("data NOT found : "+data);
		}
		

	}

}
class MyIOService
{
	public static int getInteger(String msg)
	{
		
		System.out.println(msg);
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		return temp;
	}
	
	
}