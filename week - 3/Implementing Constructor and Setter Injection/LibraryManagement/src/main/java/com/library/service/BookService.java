package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;
    private String message;

    // ✅ Constructor for injection
    public BookService(String message) {
        this.message = message;
        System.out.println(message);  // Show constructor injection
    }

    // ✅ Setter for BookRepository
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook() {
        System.out.println("Adding book...");
        bookRepository.saveBook();
    }
}
