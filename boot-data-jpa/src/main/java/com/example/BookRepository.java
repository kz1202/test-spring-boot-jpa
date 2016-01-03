package com.example;


@org.springframework.stereotype.Repository
public interface BookRepository 
	extends org.springframework.data.jpa.repository.JpaRepository<BookEntity, String> {

}
