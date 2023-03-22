package com.pisarenko.eurekaclientb.controller;

import com.pisarenko.eurekaclientb.model.Book;
import com.pisarenko.eurekaclientb.service.ServiceBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class Controller {

    ServiceBook serviceBook;

    @Autowired
    public Controller(ServiceBook serviceBook) {
        this.serviceBook = serviceBook;
    }


    @GetMapping("/all")
    public Long getALl() {
        return serviceBook.count();
    }

    @PostMapping("/create")
    public void create(@RequestParam String title) {
        serviceBook.add(title);
    }

}