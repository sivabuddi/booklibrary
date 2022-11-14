package com.learn.booklibrary.controller;

import com.learn.booklibrary.model.Library;
import com.learn.booklibrary.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// REST controller for accessing end points for GET, POST, PUT and DELETE.
// Here we are not  implementing any business logic
// This is helpful to connect @Services (businessLogic) and Model(@Entity) as java bean.
// To connect Model and Service in Rest, we use Dependency Connection using @Autowired (Association).
public class LibraryController {

    @Autowired private LibraryService libraryService;

    @GetMapping("/all")
    public List<Library> getAllBooks(){
        return this.libraryService.getAllBooks();
    }

    @PostMapping("/add")
    public String addNewBook(@RequestBody  Library library){
        return this.libraryService.addNewBook(library);
    }

    @PutMapping("/update/{id}")
    public void updatedBook(@RequestBody Library library, @PathVariable Integer id){
        this.libraryService.updateBook(library,id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable Integer id){
        this.libraryService.deleteBook(id);
        return id + " deleted successfully";
    }


}
