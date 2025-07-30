//Aqui onde vai ficar as regras de negocios
package com.kipper.first_spring_app.service;

import org.springframework.stereotype.Service;
@Service
public class HelloWorldService {

    public String helloWorld(String name){
        return "Hello Video " + name;
    }
}
