package dsa.day5.practice;

public class ComparableClassTest {

	public static void main(String[] args) 
	{
		
		Employee emp1 = new Employee("Jack",5.6f,"Wheatish",65.0f,"DBA",75000.0f);
		Employee emp2 = new Employee("Jane",6.5f,"Fair",55.0f,"Analyst",85000.0f);
		Employee emp3 = new Employee("Julie",6.3f,"White",56.0f,"Developer",95000.0f);
		Employee emp4 = new Employee("Smith",5.5f,"Black",75.0f,"Tester",75000.0f);
		Employee emp5 = new Employee("Julia",6.5f,"Fair",55.5f,"CEO",175000.0f);
		
		emp1.compareSalary(emp2);
		emp1.compareSalary(emp3);
		emp1.compareSalary(emp4);
		emp1.compareSalary(emp5);
		
		Office office = new Office();
		
		office.compareExpense(emp4, emp5);
	}

}

class Employee
{
	String name;
	float height;
	String color;
	float weight;
	String desig;
	float salary;
	public Employee() {
		super();
	}
	public Employee(String name, float height, String color, float weight, String desig, float salary) {
		super();
		this.name = name;
		this.height = height;
		this.color = color;
		this.weight = weight;
		this.desig = desig;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", height=" + height + ", color=" + color + ", weight=" + weight + ", desig="
				+ desig + ", salary=" + salary + "]";
	}
	
	void selfTalk()
	{
		System.out.println(name + "having selftalk for sometime...");
		
	}
	void compareSalary(Employee emp)
	{
		if( salary > emp.salary)
		{
			System.out.println("Be happy, "+name+" your salary is more than "+emp.name+"'s salary.");
		}
		else if (salary < emp.salary)
		{
			System.out.println("Sorry "+name+ ", "+emp.name+"'s salary is more than your salary.");

		}
		else
		{
			System.out.println(name+" & "+emp.name+ ", You both have similar salaries.");
		}
	}
}

class Office
{
	void compareExpense(Employee x, Employee y)
	{
		System.out.println("Employee "+x.name+" & "+y.name+" are working ");
		if(x.salary>y.salary)
		{
			System.out.println(x.name+" is earning more salary than "+y.name);
		}
		else 
		{
			System.out.println(y.name+" is earning more salary than "+x.name);

		}
	}
}