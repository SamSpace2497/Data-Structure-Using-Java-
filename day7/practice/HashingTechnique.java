package dsa.day7.practice;

public class HashingTechnique {

	public static void main(String[] args) 
	{
		    String s = "92";
			System.out.println(s.hashCode());
			System.out.println((s.hashCode() +1*1) % 7);
			System.out.println("------------------------");
			s = "700";
			System.out.println(s.hashCode());
			System.out.println((s.hashCode() +1*1) % 7);	
			System.out.println("------------------------");
			s = "76";
			System.out.println(s.hashCode());
			System.out.println((s.hashCode() +1*1) % 7);
			System.out.println("------------------------");
			s = "85";
			System.out.println(s.hashCode());
			System.out.println((s.hashCode() +1*1) % 7);
			//System.out.println((s.hashCode() +2*2) % 7);
			System.out.println("------------------------");
			s = "92";
			System.out.println(s.hashCode());
			System.out.println((s.hashCode() +1*1) % 7);
			System.out.println((s.hashCode() +2*2) % 7);
			//System.out.println((s.hashCode() +3*3) % 7);
			System.out.println("------------------------");
			s = "73";
			System.out.println(s.hashCode());
			System.out.println((s.hashCode() +1*1) % 7);
			System.out.println((s.hashCode() +2*2) % 7);
			System.out.println((s.hashCode() +3*3) % 7);
			System.out.println((s.hashCode() +4*4) % 7);
			System.out.println((s.hashCode() +5*5) % 7);
			System.out.println((s.hashCode() +6*6) % 7);
			System.out.println((s.hashCode() +7*7) % 7);
			System.out.println("------------------------");
			s = "28";
			System.out.println(s.hashCode());
			System.out.println((s.hashCode() +1*1) % 7);
	}

}
