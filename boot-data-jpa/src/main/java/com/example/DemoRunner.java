package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

@Service
public class DemoRunner implements ApplicationRunner {

	
	@Autowired
	private BookService service;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		service.list();

		try {
			service.someBiz();
		} catch(Exception e) {
			
		}
		
		service.list();
		
	}

	

}
