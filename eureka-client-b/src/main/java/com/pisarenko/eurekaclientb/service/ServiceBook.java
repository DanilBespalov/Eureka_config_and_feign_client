package com.pisarenko.eurekaclientb.service;

import com.pisarenko.eurekaclientb.DAO.BookRepository;
import com.pisarenko.eurekaclientb.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceBook {

    BookRepository bookRepository;

    @Autowired
    public ServiceBook(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> allBooks() {
        Book book = new Book();
        return bookRepository.findAll(Example.of(book));
    }

    public void add(String title) {
        Book book = new Book();
        Long id = bookRepository.count(Example.of(book));
        book.setTitle(title);
        book.setId(id);
        bookRepository.insert(book);
    }

    public Long count(){
        Book book = new Book();
        return bookRepository.count(Example.of(book));
    };

}
