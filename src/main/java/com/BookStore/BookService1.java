package com.BookStore;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public  class BookService1 {
	 
	@Autowired
	private BookRepository bRepo;
	
	public void save(Book b) {
		bRepo.save(b);
	}
}
