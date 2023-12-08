package com.api.book.bootrestbook.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
@Table(name = "books")
public class Book {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = " book_id")
	private int Id;
	private String title;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JsonManagedReference
	private Author author;

	public Book(int id, String title, Author author) {
		super();
		Id = id;
		this.title = title;
		this.author = author;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [Id=" + Id + ", title=" + title + ", author=" + author + "]";
	}

}
