package com.pisarenko.eurekafeignclient.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "eureka-client-b")
public interface Controller {
    @RequestMapping(method = RequestMethod.GET, value = "/book/all")
    Long getALl();

    @RequestMapping(method = RequestMethod.POST, value = "/book/create")
    void create(@RequestParam("title") String title);

}