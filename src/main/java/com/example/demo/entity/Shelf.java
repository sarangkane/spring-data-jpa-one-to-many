package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "shelf")
public class Shelf {

	@OneToMany(mappedBy = "shelf", cascade = CascadeType.ALL)
	@JsonIgnore
	List<Book> books;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long shelfId;

	@Column(unique = true)
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Shelf() {

	}

	public List<Book> getBooks() {
		return books;
	}

	public long getShelfId() {
		return shelfId;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public void setShelfId(long shelfId) {
		this.shelfId = shelfId;
	}

}
