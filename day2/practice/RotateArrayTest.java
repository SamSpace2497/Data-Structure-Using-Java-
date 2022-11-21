package dsa.day2.practice;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayTest {

	public static void main(String[] args) 
	{
		System.out.println("________________________________________________________");	


		int SA [] = {3,6,9,7,6};
		int K2 = 3;
			
		System.out.println("Source Array : "+Arrays.toString(SA));
		
		int rotatedArray2[] = rotateMechanism.solution(SA, K2);
		
		System.out.println("No of Rotations (K) = "+K2);
		System.out.println("Rotated Array : "+Arrays.toString(rotatedArray2));
		
		System.out.println("________________________________________________________");	

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input length of Array ?");
		int index = sc.nextInt();
		
		int[] sourceArray = new int[index];
		
		System.out.println("Input array values : ");
		for (int i =0; i<index;i++)
		{
			sourceArray[i] = sc.nextInt();
		}
		System.out.println("Source Array : "+Arrays.toString(sourceArray));
		
		System.out.println("Input No of time array to be rotated : ");
		int K = sc.nextInt();
		
		int rotatedArray[] = rotateMechanism.solution(sourceArray, K);
		
		System.out.println("Rotated Array : "+Arrays.toString(rotatedArray));
		
		System.out.println("________________________________________________________");	
		
		

	}
	class rotateMechanism
	{
		public static int[] solution(int sourceArray[], int K) 
		{
			int[] targetArray = new int[sourceArray.length];
			for(int i=0;i<sourceArray.length;i++)
			{
				int rotatedIndex = (i+K) % sourceArray.length;
				targetArray [rotatedIndex] =sourceArray[i];
			}
			return targetArray;
		}
		
	}

}
