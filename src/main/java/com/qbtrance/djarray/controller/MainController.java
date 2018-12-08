package com.qbtrance.djarray.controller;

import com.qbtrance.djarray.dao.DjRepository;
import com.qbtrance.djarray.model.Dj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.MediaType;
import java.util.List;

@RestController
public class MainController {

    @Autowired
    DjRepository repo;

    public static void main (String [] args){ }

    @RequestMapping("/")
    public String applicationStatus(){
        return "<h1>MyPressKit application is up and running</h1>";
    }

    @GetMapping("/mypresskit/api/v1/DjService")
    public List<Dj> getDjs() {
        List<Dj> djList = (List<Dj>) repo.findAll();
        System.out.println("Printing Dj names:");
        djList.forEach(p-> System.out.println(p.getFirstName()));
        return (List<Dj>) repo.findAll();
    }

    @PostMapping(value = "/mypresskit/api/v1/DjService", consumes = MediaType.APPLICATION_JSON)
    public void postMapping(@RequestBody Dj dj){
        repo.save(dj);
    }

    @PutMapping(value = "/mypresskit/api/v1/DjService", consumes = MediaType.APPLICATION_JSON)
    public void updateDj(@RequestBody Dj dj){
        repo.save(dj);
    }

    @DeleteMapping(value = "/mypresskit/api/v1/DjService", consumes = MediaType.APPLICATION_JSON)
    public void deleteDj(@RequestBody Dj dj){
        repo.delete(dj);
    }
}