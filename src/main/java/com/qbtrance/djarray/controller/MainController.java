package com.qbtrance.djarray.controller;

import com.qbtrance.djarray.dao.DjRepository;
import com.qbtrance.djarray.model.Dj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    DjRepository repo;

    public static void main (String [] args){ }

    @RequestMapping("/mypresskit/api/v1/getAllDjs")
    public List<Dj> getDjs() {
        List<Dj> djList = (List<Dj>) repo.findAll();
        System.out.println("Printing Dj names:");
        djList.forEach(p-> System.out.println(p.getFname()));
        return (List<Dj>) repo.findAll();
    }

    @PostMapping("/mypresskit/api/v1/newDj")
    public void postMapping(){

    }

    @PutMapping("/mypresskit/api/v1/editDj")
    public void updateDj(){

    }

    @GetMapping
    public void getDj(){

    }

    @DeleteMapping
    public void deleteDj(){

    }
}
