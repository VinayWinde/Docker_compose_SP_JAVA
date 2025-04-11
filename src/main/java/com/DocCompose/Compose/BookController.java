package com.DocCompose.Compose;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private Repo repo;

 @PostMapping
 public Book saveBook(@RequestBody Book book){
     return repo.save(book);
 }
 @GetMapping("/getbooks")
 public List<Book> getBook(){
     return repo.findAll();
 }



}
