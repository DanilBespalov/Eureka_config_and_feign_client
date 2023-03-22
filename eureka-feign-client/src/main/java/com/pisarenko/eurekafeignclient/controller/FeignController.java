package com.pisarenko.eurekafeignclient.controller;

import com.pisarenko.eurekafeignclient.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
public class FeignController {


    Controller controller;

    @Autowired
    public FeignController(Controller controller) {
        this.controller = controller;
    }

    @GetMapping("/all")
    public Long all() {
        return controller.getALl();
    }


    @PostMapping("/create")
    public void create(@RequestParam String title) {
        controller.create(title);
    }

}
