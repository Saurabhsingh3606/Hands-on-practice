package com.cognizant.library;

import java.util.*;

public class BookService {
    private List<Book> books = new ArrayList<>();

    public BookService() {
        books.add(new Book(1L, "Effective Java", "Joshua Bloch"));
        books.add(new Book(2L, "Clean Code", "Robert C. Martin"));
    }

    public List<Book> findAll() { return books; }
    public void printAllBooks() { books.forEach(System.out::println); }
}
