package dsa.day5.practice;

import java.util.Scanner;

public class MyOwnTreeSet 
{
	public static void main(String[] args) 
	{
		
		ChemicalElement gold = new ChemicalElement(79,"Gold","Au",196.97f); 
		ChemicalElement silver = new ChemicalElement(47,"Silver","Ag",107.87f);
		ChemicalElement radium = new ChemicalElement(88,"Radium","Ra",226.03f);
		ChemicalElement calcium = new ChemicalElement(20,"Calcium","Ca",40.08f);
		ChemicalElement tin  = new ChemicalElement(50,"Tin","Sn",118.711f);
		ChemicalElement lead = new ChemicalElement(82,"Lead","Pb",207.2f); 
		ChemicalElement uranium  = new ChemicalElement(92,"Uranium","U",238.29f);

		Scanner scan = new Scanner(System.in);
		
		MyTreeSet myTreeSet = new MyTreeSet();
		
		int choice = 0;
		do
		{
			System.out.println("1. Insert an Element ");
			System.out.println("2. Delete an Element ");
			System.out.println("3. InOrder Traversal");
			System.out.println("4. PreOrder Traversal");
			System.out.println("5. PostOrder Traversal");
			System.out.println("6. Exit");
			System.out.println("Enter choice : ");
			choice = scan.nextInt();
			
				switch(choice) {
					case 1: 
						myTreeSet.insert(); break; 
					case 3:
						myTreeSet.inOrder(myTreeSet.root); break;
					case 6: break;
				}
		} while(choice!=6);
	}
}

class MyTreeSet 
{
	ChemicalElement root =null, temp;
	
	void insert() {
		create();
		if(root == null) 
		{
			root = temp; 
		}
		else {
			search(root);
		}
	}
	
	void create() 
	{
		System.out.println("Enter Atomic number : ");
		Scanner sc = new Scanner(System.in);
		int tempAtomicNumber = sc.nextInt();
		
		System.out.println("Enter Atomic Name : ");
		sc = new Scanner(System.in);
		String tempAtomicName = sc.nextLine();
		
		System.out.println("Enter Atomic Formula : ");
		sc = new Scanner(System.in);
		String tempAtomicFormula = sc.nextLine();
		
		System.out.println("Enter Atomic Weight : ");
		sc = new Scanner(System.in);
		float tempAtomicWeight = sc.nextFloat();

		
		temp = new ChemicalElement();
		temp.atomicNumber = tempAtomicNumber;
		temp.atomicName = tempAtomicName;
		temp.atomicFormula = tempAtomicFormula;
		temp.atomicWeight = tempAtomicWeight;
		
		temp.left = null;
		temp.right= null;
	}
	
	void search(ChemicalElement ce)
	{
		int val = temp.atomicName.compareTo(ce.atomicName);
		if((val > 0) && (ce.right!=null))
			search(ce.right); 
		else if((val > 0) && (ce.right==null))
			ce.right=temp; 

		else if((val < 0) && (ce.left!=null)) 
			search(ce.left);
		else if((val < 0) && (ce.left==null)) 
			ce.left=temp; 
	}
	
	void inOrder(ChemicalElement ce) 
	{
		if(root == null) 
		{
			System.out.println("No elements to show in the tree");
			return ;
		}
		
		if(ce.left !=null) 
			inOrder(ce.left);
		
		System.out.println("Element :"+ce);
		
		if(ce.right !=null) 
			inOrder(ce.right);
	}
	
}
