package dsa.day2.practice;

public class QueueTest {

	public static void main(String[] args) 
	{
		MyQueue que = new MyQueue(6);
		que.add(10);
		que.add(20);

		que.add(30);
		System.out.println("Removing : "+que.remove());

		que.add(40);
		que.add(50);
		
        


		System.out.println("Removing : "+que.remove());
		System.out.println("Removing : "+que.remove());
		System.out.println("Removing : "+que.remove());
		System.out.println("Removing : "+que.remove());
		
		que.add(60);
		
		System.out.println("Removing : "+que.remove());
		System.out.println("Removing : "+que.remove());


	}

}
class MyQueue 
{
	int front= -1;
	int index = -1;
	int length;
	int array[];
	
	MyQueue(int length)
	{
		this.length = length;
		array = new int [length];
	}
	void add(int item) throws MyStackOverFlowException
	{
		if (index > length-2)
		{
			System.out.println("Overflow Exception at index "+ ++index);
			throw new MyQueueOverFlowException("Queue size is overflow.....");
		}
		array [ ++index ] = item;
		System.out.println("Adding "+item+" at index : "+index);
		
	}
	int remove() throws MyStackEmptyException
	{
		if (front == index)
		{
			System.out.println("Empty Exception at index "+ ++index);
			throw new MyQueueEmptyException("Queue is empty.....");
		}
		System.out.println("Removing items from the Queue......"+front);
		return array [++front];
	}
	
}
class MyQueueOverFlowException extends RuntimeException
{
	MyQueueOverFlowException (String str)
	{
		super(str);
	}
}
class MyQueueEmptyException extends RuntimeException
{
	MyQueueEmptyException (String str)
	{
		super(str);
	}
}