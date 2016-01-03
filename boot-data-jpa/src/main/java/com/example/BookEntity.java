package com.example;

@lombok.Data
@javax.persistence.Table(name="book")
@javax.persistence.Entity
public class BookEntity {
	
	@javax.persistence.Id
	private String isbn;
	
	private String title;
	
}
