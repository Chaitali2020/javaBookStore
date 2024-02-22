package com.BookStore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {
	
	@Autowired
	private BookService1 service;
	
	@Autowired
	private BookService bookService;

	@GetMapping("/")
	public String home(){
		return "home";
	}
	@GetMapping("/book_register")
	public String bookRegister(){
		return "bookRegister";
	}
	@GetMapping("/available_books")
	public String getAllBook(){
		return "bookList";
	}
//	@PostMapping("/save")
//	public String addBook(@ModelAttribute Book b) {
//		service.save(b);
//		return "redirect:/available_books";
//	}
	
	@PostMapping("/save")
	public String addBook(@ModelAttribute Book b) {
		service.save(b);
		return "redirect:/available_books";
		
	}
	
	
}
