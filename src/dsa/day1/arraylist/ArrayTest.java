package dsa.day1.arraylist;

public class ArrayTest {

	public static void main(String[] args) 
	{
		Account accArray[] = new Account[5];
		
		
		System.out.println("Begin main..");
		
		Account accObj = new Account(101,"John", 5000 );
		
		System.out.println(accObj);
		
		accObj.withdraw(400);
		
		System.out.println(accObj);
		
		System.out.println("End main...");
	}

}
class Account
{
	private int accountNumber;
	private String accountholdName;
	private float accountBalance;
	
	void transfer(float amtTOTransfer) {};
	public Account(int accountNumber, String accountholdName, float accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountholdName = accountholdName;
		this.accountBalance = accountBalance;
	}

	float withdraw(float amtToWithdraw) { 
		accountBalance = accountBalance - amtToWithdraw;
		return accountBalance;
	}
	
	float deposit(float amtToDeposit) { 
		accountBalance = accountBalance + amtToDeposit;
		return accountBalance;
	}


	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountholdName=" + accountholdName + ", accountBalance="
				+ accountBalance + "]";
	}
	
	/*
	 * 
	 * 
	 * 
	 * First Java
	 * main{
	 *    clearscreen();  //invoke
	 * }
	 * 
	 *   
	 * 1. Function without argument and without return type :
	     
          without return               without argument
             
              void clearScreen(void)
              {
              
                   
              }
                  
       2.  Function with argument but without return value :
         
               void gotoThisLocation(float longitude, float latitude)
               {
               
               }
               
       3. Function with argument and with return value :
       
               void calSimpleInterst(float principle, int numYears, float rate)
               {
                   float interest = (principle * numYears * rate ) / 100;
                   return interest;
               
               }
               
       4. Function without argument but with return value :
       
               void calDistance(float principle, int numYears, float rate)
               {
                   float speedOfLight = 186000.519;
                   int timeTook = 480;
                   double distance = speedOfLight * timeTook;          
                   return interest;
               }
  
  
	 */
	
}