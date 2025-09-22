package edu.galileo.agenda.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

record NameResponse(String name) {}

@RestController
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public NameResponse home(){
        return  new NameResponse("Esvin Ambrocio");
    }
}
