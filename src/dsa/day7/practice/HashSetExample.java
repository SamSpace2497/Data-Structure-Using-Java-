package dsa.day7.practice;

import java.util.HashSet;
import java.util.Objects;

public class HashSetExample 
{

	public static void main(String[] args) 
	{
		Movie m1 = new Movie("m1",2000);
		Movie m2 = new Movie("m2",2001);
		Movie m3 = new Movie("m1",2002);
		Movie m4 = new Movie("m4",2003);
		Movie m5 = new Movie("m1",2000);
		
		System.out.println("Movie : "+m1);
		System.out.println("Movie : "+m2);
		System.out.println("Movie : "+m3);
		System.out.println("Movie : "+m4);
		System.out.println("Movie : "+m5);
		
		System.out.println("Movie : "+m1.hashCode());
		System.out.println("Movie : "+m2.hashCode());
		System.out.println("Movie : "+m3.hashCode());
		System.out.println("Movie : "+m4.hashCode());
		System.out.println("Movie : "+m5.hashCode());
		
		HashSet movieSet = new HashSet(); 
		
		movieSet.add(m1);
		movieSet.add(m2);
		movieSet.add(m3);
		movieSet.add(m4);
		movieSet.add(m5);
		
		System.out.println(movieSet.toString());

	}

}
class Movie
{
	String name;
	int year;
	public Movie() {
		super();
	}
	public Movie(String name, int year) {
		super();
		this.name = name;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Movie [name=" + name + ", year=" + year + "]";
	}
	/*@Override
	public int hashCode() {
		return Objects.hash(name, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return Objects.equals(name, other.name) && Objects.equals(year, other.year);
	}
	*/
	
}