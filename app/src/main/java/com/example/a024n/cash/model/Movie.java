package com.example.a024n.cash.model;

import java.util.ArrayList;

public class Movie {
	private String title, thumbnailUrl, imageUrl;
	private int year;
	private double rating;
	private ArrayList<String> genre;

	public Movie() {
	}

	public Movie(String name, String thumbnailUrl, String imageUrl, int year, double rating,
                 ArrayList<String> genre) {
		this.title = name;
		this.thumbnailUrl = thumbnailUrl;
		this.imageUrl = imageUrl;
		this.year = year;
		this.rating = rating;
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String name) {
		this.title = name;
	}

	public String getThumbnailUrl() {
		return thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}


	public String getimageUrl() {
		return imageUrl;
	}

	public void setimageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public ArrayList<String> getGenre() {
		return genre;
	}

	public void setGenre(ArrayList<String> genre) {
		this.genre = genre;
	}

}
