package com.org.practice.comparable;

import java.util.ArrayList;
import java.util.Collections;

class Movies implements Comparable<Movies>{
	double rating;
	String movieName;
	int releaseYear;
	
	public Movies(double rating, String movieName, int releaseYear) {
		
		this.rating = rating;
		this.movieName = movieName;
		this.releaseYear = releaseYear;
	}
	
	

	@Override
	public int compareTo(Movies o) {
		if(rating == o.rating) {
			return 0 ;
		}else if(rating > o.rating) {
			return 1;
		}else {
			return -1;
		}
		
	}
	
public String toString() {
		
		return rating+""+movieName+""+releaseYear;
	}
	
	
}


public class ComprableEx {

	public static void main(String[] args) {
		 
		ArrayList<Movies> list = new ArrayList<Movies>();
		
		list.add(new Movies(3.2,"Iron Man 3", 2005));
		list.add(new Movies(3.1,"Avengers", 2008));
		list.add(new Movies(4,"Iron Man", 2003));
		list.add(new Movies(3.7,"Avengers Infinity War", 2018));
		list.add(new Movies(3.9,"Spider Man-Home Coming",2019));
		
		System.out.println("Before Sorting..");
		
				
		for(Movies m : list) {
			System.out.println(" "+m);
		}
		
		System.out.println("After Sorting..");
		
		Collections.sort(list);
		
		for(Movies m : list) {
			System.out.println(m);
		}
		
	}

}
