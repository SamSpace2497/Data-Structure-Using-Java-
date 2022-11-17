package dsa.day6.practice;

import java.util.Arrays;
import java.util.Scanner;

public class SearchSortTest2 
{

	public static void main(String[] args) 
	{
		
        int arr[] = { 100,90,80,70,60,50,40,30,20,10};
		
		MyIOService2.showArray(arr);
		
		System.out.println("Sorting Array....");
		Arrays.sort(arr);
		System.out.println("Array Sorted....");
		
		MyIOService2.showArray(arr);
		
		MyIOService2.searchArray(arr);
		MyIOService2.searchArrayByLR(arr);

	}

}
class MyIOService2
{
	static boolean found = false;
	static int data;
	
	public static int getInteger()
	{
		
		System.out.println("Enter data to search : ");
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		return temp;
	}
	public static void searchArray(int[] arr)
	{
		data = getInteger();
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println("Inside loop....");
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
	
	public static void searchArrayByLR(int[] arr)
	{
		data = getInteger();
		
		int first =0;
		int last = arr.length-1; 
		int middle = (first + last ) / 2;
		
		while(first <= last) 
		{
			System.out.println("Inside loop....");
			if(arr[middle] < data) 
			{
				first = middle + 1;
			}
			else if(arr[middle]==data) 
			{ 
				System.out.println("found the data: "+data+" at location "+(middle+1));
				break;
			}
			else 
					last = middle-1;
			
			middle = (first + last)/2;
		}
		if(first > last) 
			System.out.println("Data not found.....");
		
	}
	static void showArray(int[] arr)
	{
		for (int i=0; i<arr.length; i++ )
		{
			System.out.println("Array Element : "+arr[i]);
		}
	}
}
