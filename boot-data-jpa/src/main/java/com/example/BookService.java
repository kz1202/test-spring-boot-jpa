package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly=true)
@lombok.extern.slf4j.Slf4j
public class BookService {

	@Autowired
	private BookRepository repository;

	public void list() {
		Sort sort = new Sort("title");
		repository.findAll(sort).forEach(e -> log.info(e.toString()));
		
	}
	
	
	public void someBiz() {
		
		create();
		delete();
		
		throw new IllegalArgumentException();
		
	}
	
	public void create() {

		BookEntity newEntity = new BookEntity();
		newEntity.setIsbn("4873115655");
		newEntity.setTitle("リーダブルコード ―より良いコードを書くためのシンプルで実践的なテクニック");
		
		repository.saveAndFlush(newEntity);
	}
	
	public void delete() {

		repository.delete("4798039918");
		repository.flush();
	}
	

}
