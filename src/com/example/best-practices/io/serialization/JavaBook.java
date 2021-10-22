package com.example.io.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.time.LocalDate;

public class JavaBook implements Externalizable {

	String isbn;
	String title;
	double price;
	String author;
	String publisher;
	LocalDate publishDate;
	boolean released;
	int pages;
	int chapters;

	
	public JavaBook() {
		
	}

	
	public JavaBook(String isbn, String title, double price, String author, String publisher, LocalDate publishDate,
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


	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(isbn);
		out.writeUTF(title);
		out.writeDouble(price);
	}


	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
			this.isbn = in.readUTF();
			this.title = in.readUTF();
			this.price = in.readDouble();
	}

}
