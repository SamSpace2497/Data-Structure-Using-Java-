package dsa.day1.arraylist;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		int score[] = new int [11];
		score[0] = 90;
		score[1] = 89;
		score[2] = 0;
		score[3] = 10;
		score[4] = 89;
		score[5] = 99;
		score[6] = 12;
		
		for(int i=0;i<score.length;i++)
		{
			System.out.println("Score :"+score[i]);
		}
		
		ArrayList scoreList = new ArrayList();
		
		scoreList.add(10);
		scoreList.add(90);
		scoreList.add(88);
		scoreList.add(0);
		scoreList.add(56);
		
		for(int i=0 ; i<scoreList.size(); i++)
		{
			System.out.println("Score List : "+scoreList.get(i));
		}
		
		

	}

}
