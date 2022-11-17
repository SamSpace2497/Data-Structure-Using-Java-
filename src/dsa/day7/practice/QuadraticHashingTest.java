package dsa.day7.practice;

public class QuadraticHashingTest 
{
	public static void main(String[] args) 
	{
		int arr[] = { 103, 700, 76, 85, 92, 73, 28};
		//int L = arr.length;		
		int size = arr.length;
		int hashTable[] = new int[size];
		
		for (int i = 0; i < hashTable.length; i++) 
		{
			 hashTable[i]= -1;
		}
		
		quadraticHashing(hashTable,size,arr);//,N);
		
		
    }	
	
	private static void printValues(int arr[]) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println("arr: "+arr[i]);
			
		}
	}
	public static void quadraticHashing(int table[], int size, int arr[])//, int N) 
	{
		//int N=size;
			for(int i=0;i<size;i++) 
			{
				int hashValue = arr[i] % size;
				
				if(table[hashValue]== -1)
					
					table[hashValue] = arr[i];
				else 
				{
					for(int j=1;j<size;j++) 
					{
						int t = (hashValue + j * j) %size;
						
						if(table[t] == -1) 
						{
							table[t]= arr[i];
							break;
						}
					}
				}
			}
			printValues(table);	
	} 
}
