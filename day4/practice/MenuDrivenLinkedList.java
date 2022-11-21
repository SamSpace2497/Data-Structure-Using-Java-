package dsa.day4.practice;
/*package das.day4.practice;

import java.util.Scanner;

public class MenuDrivenLinkedList 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//make object of linked list...
		MyMovieList myMovies = new MyMovieList();
		Movie m1 = new Movie("Zack Snyder's Justice Leauge","Zack Snyder", 9.8f, 2020,"Comic Book/ SuperHero");
		Movie m2 = new Movie("Memories of Murder","Bong jon yun", 9.9f, 2002, "Horror"); 
		Movie m3 = new Movie("Your Name","Hayao Miyazaki", 9.2f, 2016, "Anime Fantacy");
		Movie m4 = new Movie("Lord of the Rings : Fellowship of Ring","James Cameron", 9.7f, 2001, "Adventure / Fantacy");
		Movie m5 = new Movie("Batman Begins","Christofer Nollan", 9.9f, 2006, "Comic Book/ SuperHero");
		Movie m6 = new Movie("Batman Begins","Christofer Nollan", 9.9f, 2006, "Comic Book/ SuperHero");
		
		
		int choice =0;
		do
		{
			System.out.println("--------------------------------");
			System.out.println("------------M E N U------------- ");
			System.out.println("\n--------------------------------");
			System.out.println("1 . Add Movie at Begining........");
			System.out.println("2 . Add Movie at End.............");
			System.out.println("3 . Add Movie before ??..........");
			System.out.println("4 . Add Movie after ??...........");
			System.out.println("5 . Show all Movies..............");
			System.out.println("6 . Search Movie by Name.........");
			System.out.println("7 . Search Movie by Ratings......");
			System.out.println("8 . Delete Movie.................");
			System.out.println("9 . Delete Movie by Name.........");
			System.out.println("10. No of Movies in the List....");
			System.out.println("0 . Exit........................");
			System.out.println("--------------------------------");
			System.out.println("\nEnter choice : ");
			choice = sc.nextInt();
			switch(choice) {
			        case 0: break;
			        case 1 : MyMovieList.addAtBegining(new Movie()); 
			                 break;
					case 2 : MyMovieList.addAtBegining(new Kite()); break;  
					case 3 : myList.add(new Kite()); break;
					case 4 : myList.insertKite("", new Kite()); break;
					case 5 : myList.showList(); break;
					case 6 : myList.showList(); break;
					case 7 : myList.showList(); break;
					case 8 : myList.showList(); break;
					case 9 : myList.showList(); break;
					case 10: break;
			}
		} while(choice!=8) ;
	}
		

	}

}

/*class MyMovieList
{
	Movie start, pointer, previous;
	int size;
	
	 void showList()
	{
		if(start ==null)
		{
			System.out.println("No Movies added yet.....");
		}
		else {
			System.out.println("\n__________Movies_________");
			
			pointer = start;
			
			while(pointer!=null) {
				System.out.println("\nData : "+pointer);
				pointer = pointer.next; 
			}
		}
	}
	 void addMovie(Movie newMovie)
	{
		if (start==null)
		{
			System.out.println("\nAdding first movie....");
			start = newMovie;
			//start.next = null; 
			size++;
		}
		else {
			System.out.println("\nAdding more movies to list.....");
			
			pointer = start;
			
			while(pointer!=null) {
				System.out.println("\nSearching for empty location to place new movie.....");
				previous = pointer;
				pointer = pointer.next; 
			}
			previous.next = newMovie;
			newMovie.prev = previous;
			//newMovie.next = null;
			size++;
		}
		
	}
	 
	 void addBefore(String name, Movie newMovie)
		{
		 boolean found=false;
			
		if (start==null)
		{
			System.out.println("Sorry, List is empty......");
				//start.next = null; 
		}
		else if(start.getName().equals(name))
		{
			addAtBegining(newMovie);
		} else {	
		       System.out.println("\nAdding Movie before "+name);
		       pointer = start;
		       while(pointer!=null) 
				{
					if(pointer.getName().equals(name)) 
					{
						System.out.println("\nMovie Found :"+pointer);	
						found=true;
						break;
					}
					previous = pointer;
					pointer=pointer.next;
		}	
		if(found!=true) 
			{
				System.out.println("Sorry, No such movie found with name ( "+name+" )....Cannot add this movie...");
			}
			else {
				previous.next = newMovie;
				newMovie.next = pointer;
				System.out.println("Movie with ( "+newMovie.getName()+" )added Succesfully before ( "+name+" ) movie...");
				size++;
			}
		}
			
	}
	 
	 void addAfter(String name, Movie newMovie)
		{
		 boolean found=false;
		
			if (start==null)
			{
				System.out.println("Sorry, List is empty......");
				
				//start.next = null; 
			}
			else {
			System.out.println("\nAdding Movie after "+name);
			pointer = start;
			while(pointer!=null) 
					{
						if(pointer.getName().equals(name)) 
						{
							System.out.println("\nMovie Found :"+pointer);
							previous = pointer;
							found=true;
							break;
						}
						pointer=pointer.next;
					}	
					
					if(found!=true) 
					{
						System.out.println("Sorry, No such movie found with name ( "+name+" )....Cannot add this movie...");
					}
					else {
						newMovie.next = pointer.next;
						pointer.next = newMovie;
						System.out.println("Movie with ( "+newMovie.getName()+" )added Succesfully after ( "+name+" ) movie...");
						size++;
						
					}
			}
		}
	 
	void searchMovieByRatings(float ratingToSearch) 
	{
		boolean found=false;
		if(start==null) 
			System.out.println("List is empty..\nPlease add Movies to list...");
		else {
			System.out.println("\nSearching Movie by Ratings...");
			pointer = start;
			System.out.println(" ");
			System.out.println("Movies with ( "+ratingToSearch+" ) ratings : ");
			while(pointer!=null) 
			{
				if(pointer.getRatings() == ratingToSearch) 
				{
					System.out.println("\nMovie Found :"+pointer);
					found=true;
					//break;
				}
				pointer=pointer.next;
			}	
			if(found!=true) 
			{
				System.out.println("No such movie found with ( "+ratingToSearch+" ) rating....");
			}
			
		}
	}
	 
	void searchMovieByName(String nameToSearch) 
		{
			boolean found=false;
			if(start==null) 
				System.out.println("List is empty..\nPlease add Movies to list...");
			else {
				System.out.println("\nSearching Movie by Name...");
				pointer = start;
				System.out.println(" ");
				System.out.println("Movies with ( "+nameToSearch+" ) Name : ");
				while(pointer!=null) 
				{
					if(pointer.getName() == nameToSearch) 
					{
						System.out.println("\nMovie Found :"+pointer);
						found=true;
						//break;
					}
					pointer=pointer.next;
				}	
				if(found!=true) 
				{
					System.out.println("No such movie found with ( "+nameToSearch+" ) Name....");
				}
				
			}
	}
	 void deleteMovie(Movie movieToDelete) 
		{
			boolean found=false;
			if(start==null) 
				System.out.println("Sorry, No movies in the list.....");
			else {
				System.out.println("\nRemoving Movie...");
				pointer = start;
				while(pointer!=null) 
				{
					if(pointer.equals(movieToDelete)) 
					{
						System.out.println("\nMovie Found :"+pointer);
						previous = pointer;
						found=true;
						break;
					}
					pointer=pointer.next;
				}	
							
				
				if(found!=true) 
				{
					System.out.println("Sorry, No such movie found with ( "+movieToDelete+" ) to delete from the list.");
				}
				else {
					previous.next = pointer.next;
					pointer.next = null;
					System.out.println("Movies with ( "+movieToDelete+" ) Name : Deleted Succesfully.");
					size--;
					
				}
				
			}
		}
	 void deleteMovieByName(String movieName) 
		{
			boolean found=false;
			if(start==null) 
				System.out.println("Sorry, No movies in the list.....");
			else {
				System.out.println("\nRemoving Movie "+movieName);
				pointer = start;
				while(pointer!=null) 
				{
					if(pointer.getName().equals(movieName))
					{
						System.out.println("\nMovie Found :"+pointer);
						
						found=true;
						break;
					}
					previous = pointer;
					pointer=pointer.next;
					
				}	
				
				if(found!=true) 
				{
					System.out.println("Sorry, No such movie found with ( "+movieName+" ) to delete from the list.");
				}
				else {
					previous.next = pointer.next;
					pointer.next = null;
					System.out.println("Movies with ( "+movieName+" ) Name : Deleted Succesfully.");
					pointer = null;
					size--;
					
				}
				
			}
		}
		void addAtBegining(Movie newMovie) 
		{
			if(start!=null) 
			{
				System.out.println("This Movie is added at the beginning of the existing list of Movies...");
				newMovie.next = start;
				start = newMovie;
				size++;
			}
			else {
				System.out.println("This is the first and only Movie in the list...");
				start = newMovie;
				size++;
			}
		}
		void showSize()
		{
			System.out.println("\nSize : "+size);
		}

}




class Movie
{
	private String name;
	private String director;
	private float ratings;
	private int year;
	private String genre;
	
	Movie next,prev;
	
	public Movie() 
	{
		super();
	}

	public Movie(String name, String director, float ratings, int year, String genre) {
		super();
		this.name = name;
		this.director = director;
		this.ratings = ratings;
		this.year = year;
		this.genre = genre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Movie\n[\n Name=" + name + "\n Director=" + director + "\n Ratings=" + ratings + "\n Year=" + year + "\n Genre="
				+ genre + "\n]";
	}
	
	
	
}
*/
