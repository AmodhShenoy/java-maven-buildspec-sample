package com.sample.javamavenspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sample.javamavenspring.JavaMavenSpringApplication;

@RestController
@SpringBootApplication
public class JavaMavenSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaMavenSpringApplication.class, args);
    }

    @RequestMapping("/")
    public String helloWorld(){
        return "Hello World!";
    }

}
