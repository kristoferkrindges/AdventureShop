package com.salesadventure.adventure.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.salesadventure.adventure.entities.Category;
import com.salesadventure.adventure.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
    @Autowired
    private CategoryService service;

    @GetMapping
    //@RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Category>> findAll(){
        List<Category> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
        Category obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
