package dsa.day3.practice;

import java.util.ArrayList;

public class AssociationHomeWorkClass 
{

	public static void main(String[] args) 
	{
		

	}

}
class BookStore
{
	String name;
	String location;
	Contact contact;
	int profit;
	int generateProfit(int sells)
	{
		return profit;	
	}
	
	
}
class Contact
{
	int number;
	Address add;
}
class Address
{
	int floorNo;
	String buildingName;
	City city;
	int pincode;
	
}
class City
{
	String name;
	int population;
}
class Book
{
	String name;
	String type;
	Author author;
	String publisher;
	int publishYear;
	String genre;
	int price;
	int noOfSells;
	 
	void readBook() {}
	void findbook() {}
}
class Author
{
	String name;
	int noOfBooks;
	String achievments;
	int totalSells;
	
	void write(){}
}

class ComicBookStore extends BookStore
{
	ArrayList comicslist;
	Book comic;
	int issueNo;
	Offer offer;
}
class Offer
{
	String name;
	float discount;
	float calDiscount(float price, float percentage)
	{
		float newprice = price * percentage;
		return newprice;
		
	}
}