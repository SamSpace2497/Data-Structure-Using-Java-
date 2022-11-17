package dsa.day2.practice;

public class StackTest 
{

	public static void main(String[] args) 
	{
		MyStack theStack = new MyStack(5);
		
		
		theStack.push(10);
		theStack.push(20);
		theStack.push(30);
		theStack.push(40);
		theStack.push(50);
		
		theStack.push(60);
		
		System.out.println(theStack.pop());
		System.out.println(theStack.pop());
		
        System.out.println("=> element of the top : "+theStack.peek());
		
		System.out.println(theStack.pop());
		System.out.println("=> element of the top : "+theStack.peek());
		
		System.out.println(theStack.pop());
		System.out.println(theStack.pop());
		
		//System.out.println(theStack.pop());


	}
}
class MyStack
{
	int index = -1;
	int size;
	int array [];
		
	MyStack(int size) 
	{
		
		this.size = size;
		array= new int [size];
		System.out.println("Mystack created with "+size+" integers");
	}
	
	void push(int item) throws MyStackOverFlowException
	{
		
		if (index > size-2)
		{
			System.out.println(index);
			throw new MyStackOverFlowException("Stack size is overflown.....");
		}
		array [++index] = item;
		System.out.println("Pushing "+item+ " to the Stack......"+index);
	}
	
	int pop() throws MyStackEmptyException
	{
		
		if (index < 0)
		{
			System.out.println(index);
			throw new MyStackEmptyException("Stack is empty.....");
		}
		System.out.println("Popping items from the Stack......"+index);
		return array [ index--];
	}
	int peek()
	{
		return array [index];
	}
		
}
class MyStackOverFlowException extends RuntimeException
{
	MyStackOverFlowException (String str)
	{
		super(str);
	}
}
class MyStackEmptyException extends RuntimeException
{
	MyStackEmptyException (String str)
	{
		super(str);
	}
}

