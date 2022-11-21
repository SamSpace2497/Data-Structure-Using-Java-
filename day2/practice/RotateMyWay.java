package dsa.day2.practice;

import java.util.ArrayList;
import java.util.Arrays;


public class RotateMyWay {

	public static void main(String[] args) 
	{
		int SA [] = {3,6,9,7,6};
		int K2 = 3;
		
        System.out.println("Source Array : "+Arrays.toString(SA));
		
		/*int rotatedArray2[] = rotateMechanism.solution(SA, K2);
		
		System.out.println("No of Rotations (K) = "+K2);
		System.out.println("Rotated Array : "+Arrays.toString(rotatedArray2));
*/
	}
	/*class rotateMechanism
	{
		public static int[] solution(int sourceArray[], int K) 
		{
			ArrayList<Integer> targetArray = new ArrayList<Integer>(sourceArray.length);
			
			for(int i=0;i<sourceArray.length;i++)
			{
				int rotatedIndex = (i+K) % sourceArray.length;
				//targetArray [rotatedIndex] =sourceArray[i];
			}
			//return targetArray;
		}
		
	}
		*/

}
