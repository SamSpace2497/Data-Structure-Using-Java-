package dsa.day8.practice;

public class HashingCalculaor 
{

	public static void main(String[] args) 
	{
		System.out.println("------------------------");
		String s = "chi";
		int size = 7;
		int prime = 0;
		int hashVal1 = s.hashCode();
		
		hashVal1 %= size;
        if (hashVal1 < 0)
            hashVal1 += size;
        System.out.println("myhash1() : "+hashVal1);
		
        System.out.println("------------------------");
        
        int hashVal2 = s.hashCode( );
		
        hashVal2 %= size;
        if (hashVal2 < 0)
            hashVal2 += size;
		
        for (int i = (size - 1); i >= 1; i--)
        {
            int fact = 0;
            for (int j = 2; j <= (int) Math.sqrt(i); j++)
                if (i % j == 0)
                    fact++;
            if (fact == 0) {
                prime = i;
                break;}
        }
        if(prime==0)
        	prime = 3;
        System.out.println("prime no : "+prime);
        
        hashVal2 = prime - hashVal2 % prime;
        System.out.println("myhash2() : "+hashVal2);
        System.out.println("------------------------");
               
        hashVal1 += hashVal2;
        hashVal1 %= size;
        System.out.println("Updated hashVal1 : "+hashVal1);
	}
}
