package com.example.io.serialization;

import java.io.Serializable;
import java.time.LocalDate;

public class Book implements Serializable {

	private static final long serialVersionUID = -7119890860920295225L;
	
	String isbn;
	String title;
	double price;
	transient String author;
	transient String publisher;
	transient LocalDate publishDate;
	transient boolean released;
	transient int pages;
	transient int chapters;

	public Book() {
		
	}

	
	public Book(String isbn, String title, double price, String author, String publisher, LocalDate publishDate,
			boolean released, int pages, int chapters) {
		this.isbn = isbn;
		this.title = title;
		this.price = price;
		this.author = author;
		this.publisher = publisher;
		this.publishDate = publishDate;
		this.released = released;
		this.pages = pages;
		this.chapters = chapters;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}

	public boolean isReleased() {
		return released;
	}

	public void setReleased(boolean released) {
		this.released = released;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getChapters() {
		return chapters;
	}

	public void setChapters(int chapters) {
		this.chapters = chapters;
	}

}
