package com.kipper.first_spring_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.kipper.first_spring_app.service.HelloWorldService;
import com.kipper.first_spring_app.domain.User;

@RestController //Combinação de @Controller e @RespondeBody, retorna uma página WEB. Neste app estaremos usando apenas para a API
//API: STATELESS -> o cliente recebe um token, tendo que se identificar novamente, STATEFULL -> p estadp de cada cliente é mantido no servidor
@RequestMapping("/hello-world") //Mapeando um requisito já com parametro

public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService){
        this.helloWorldService = helloWorldService;
    }
    //metodo http: post, get, delete, put, etc...

    @GetMapping
    public String helloWorld(){
        return helloWorldService.helloWorld("Kipper");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue + "nenhum") String filter,  @RequestBody User body){
        //return "Hello World " + body.getName() + id;
        return "Hello World " + filter;
    }
}
