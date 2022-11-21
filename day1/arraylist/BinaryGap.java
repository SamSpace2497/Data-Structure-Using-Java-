package dsa.day1.arraylist;

import java.util.ArrayList;

public class BinaryGap {

	public static void main(String[] args) 
	{
	
	int count1 = Solution.solveThis(1041);
	System.out.println("Max 0 count : "+count1);
	
	int count2 = Solution.solveThis(991);
	System.out.println("Max 0 count : "+count2);
	
	int count3 = Solution.solveThis(2147483647);
	System.out.println("Max 0 count : "+count3);
	
	System.out.println(count1);

		
	}
	

}

class Solution 
{
	public static int solveThis (int N)
	{
		System.out.println("--------------------------");
		
		String binaryRepresentation = Integer.toBinaryString(N);
		System.out.println("Binary Representation of "+N+" : "+binaryRepresentation);
		
		System.out.println("");
		
		int longestGap = 0;
		
		ArrayList<Integer> onesList = new ArrayList<Integer>();
		
		System.out.println("List of String index containing value = 1 :");
		for(int i=0; i<binaryRepresentation.length();i++)      //Loop to catch Index number of String containing value 1.
		{
			if(binaryRepresentation.charAt(i)  == '1')
			{
				//continue;
			    onesList.add(i);
			    System.out.println(onesList);
		    }
		}
		System.out.println(binaryRepresentation.length());
		
		System.out.println("");
		
		System.out.println("Index of String containing longest gap :");		
	    for (int i=0; i<onesList.size()-1;i++)             //Loop to 
	    {
	    	int indicesDiff = onesList.get(i + 1) - onesList.get(i)-1;
	    	longestGap = Math.max(longestGap, indicesDiff);
	    	System.out.println(longestGap);
	    }
		return longestGap;
	}
}

