package dsa.day9.practice;

import java.util.*;

public class GraphTest 
{
	public static void main(String[] args) 
	{
		 int V = 5;
		 
		 List<ArrayList<Movie>> am = new ArrayList<ArrayList<Movie>>(V);

		 for (int i = 0; i < V; i++)
		   am.add(new ArrayList<Movie>());
		 
		 Movie m1 = new Movie("Zack Snyder's Justice Leauge","Comic Book/ SuperHero" , "Zack Snyder", 2020);
		 Movie m2 = new Movie("Batman Begins","Comic Book/ SuperHero" , "Christofer Nollan", 2006);
		 
		 Graph.addEdge(am, 0, 1, m1);
		 Graph.addEdge(am, 0, 2, m2);
//		 Graph.addEdge(am, 0, 3, m3);
//		 Graph.addEdge(am, 1, 2);

		 Graph.printGraph(am);
		 
	}

}




class Graph 
{
	
    static void addEdge(List<ArrayList<Movie>> am, int s, int d, Movie m) 
   {
       am.get(s).add(m);
       am.get(d).add(m);
   }
    static void printGraph(List<ArrayList<Movie>> am) 
   {
       for (int i = 0; i < am.size(); i++) 
       {
          System.out.println("\nVertex " + i + ":");
          for (int j = 0; j < am.get(i).size(); j++) 
          {
             System.out.print(" -> " + am.get(i).get(j));
          }
          System.out.println();
       }
   }
}


class Movie
{
    String name;
	String genre;
	String director;
	int year;
	int x,y;
	
	public Movie() {
		super();
	}

	public Movie(String name, String genre, String director, int year) 
	{
		
		this.name = name;
		this.genre = genre;
		this.director = director;
		this.year = year;
	}

	@Override
	public String toString() {
		return "\n||Movie \n[ Name=" + name + "\n  Genre=" + genre + "\n  Director=" + director + "\n  Year=" + year + "\n]";
	}
	
}