package com.org.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Movie implements Comparable<Movie>{
	
	private String name;
	private double rating;
	private int year;
	
	public Movie(String movieName, double rating, int year) {
		
		this.name = movieName;
		this.rating = rating;
		this.year = year;
	}

	@Override
	public int compareTo(Movie movie) {
		return this.year - movie.year;
	}
	
	public double getRating() {
		return this.rating;
	}
	public String getName() {
		return this.name;
	}
	public int getYear() {
		return this.year;
	}

	
	
	
}

public class ListRun {

	public static <T> void main(String[] args) {
	
		List<Movie> list = new ArrayList<Movie>();
		
		list.add(new Movie("Force Awakens", 8.3, 2015)); 
        list.add(new Movie("Star Wars", 8.7, 1977)); 
        list.add(new Movie("Empire Strikes Back", 8.8, 1980)); 
        list.add(new Movie("Return of the Jedi", 8.4, 1983)); 
		
		Collections.sort(list);
		
		for(Movie movie : list) {
			System.out.println(movie.getName()+" "+movie.getRating()+" "+movie.getYear());
			
		}
		
	}

}
