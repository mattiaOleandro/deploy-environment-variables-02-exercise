package co.develhope.deployenvironmentvariables02exercise.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class environmentController {

    @Autowired
    private Environment environment;

    @GetMapping
    public String getEnvironment(){
        return environment.getProperty("myCustomVar.welcomeMsg");
    }
}