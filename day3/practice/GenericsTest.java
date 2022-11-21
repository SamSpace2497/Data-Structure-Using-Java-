package dsa.day3.practice;

public class GenericsTest {

	public static void main(String[] args) 
	{
		System.out.println("__________________Integer_____________________");
		MyValues<Integer> intValues = new MyValues<Integer>(10, 20);
		intValues.print();
		intValues.swap();
		intValues.print();
		
		System.out.println("__________________Float_____________________");
		MyValues<Float> floatValues = new MyValues<Float>(10.2f, 20.3f);
		floatValues.print();
		floatValues.swap();
		floatValues.print();
		
		System.out.println("__________________Movies_____________________");
        MyMovies m1 = new MyMovies("Zack Snyder's Justice Leauge","Comic Book/ SuperHero" , "Zack Snyder", 2020);
		MyMovies m2 = new MyMovies("Batman Begins","Comic Book/ SuperHero" , "Christofer Nollan", 2006);
		
		MyValues<MyMovies> myMovies = new MyValues<MyMovies>(m1,m2);
		myMovies.print();
		myMovies.swap();
		myMovies.print();

	}

}

class MyValues<Gazani>
{
	Gazani x;
	Gazani y;
	
	public MyValues(Gazani x, Gazani y)
	{
		
		this.x = x;
		this.y = y;
	}
	void print()
	{
		System.out.println("Value 1 : "+x);
		System.out.println("Value 2 : "+y);
	}
	void swap() 
	{
		
		System.out.println("Swapping....");
		Gazani temp=x; 
		x=y;
		y=temp;
		System.out.println("Swapped Values...");
	}
}

class MyMovies
{
	private String name;
	private String genre;
	private String director;
	int year;
	
	public MyMovies(String name, String genre, String director, int year) 
	{
		
		this.name = name;
		this.genre = genre;
		this.director = director;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "\n||MyMovies \n[ Name=" + name + "\n  Genre=" + genre + "\n  Director=" + director + "\n  Year=" + year + "\n]";
	}
	
}