package com.learn.booklibrary.service;

import com.learn.booklibrary.model.Library;
import com.learn.booklibrary.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {

//    List<Library> libraryList = new ArrayList<>(Arrays.asList(
//            new Library(001,"SivaKumar","CSE",500),
//            new Library(002,"Rakesh","IT",900),
//            new Library(003, "Kenny","EIE",800)));


    // display all books

    @Autowired private  LibraryRepository libraryRepository;

    public List<Library> getAllBooks(){
        return this.libraryRepository.findAll();
        //return this.libraryList;
    }



    // display only single book

    public Optional<Library> getSingleBook(Integer id){
        return this.libraryRepository.findById(id);
//        for(int i=0;i<this.libraryList.size();i++){
//            Library library1 = this.libraryList.get(i);
//            if(library1.getLibraryId().equals(id))
//                return library1;
//        }
//        return null;
    }


    // add new book

    public String addNewBook(Library library){
        this.libraryRepository.save(library);
        return "Added new Book Successfully";
   }


    // update book with new student id

    public void updateBook(Library library, Integer libraryId ){
//        for(int i=0;i<this.libraryList.size();i++){
//            Library library1 = this.libraryList.get(i);
//            if(library1.getLibraryId().equals(libraryId))
//                this.libraryList.set(i,library);
//        }
        this.libraryRepository.save(library);

    }

    // delete a book
    public String deleteBook(Integer libraryId){
//        this.libraryList.removeIf(book -> book.getLibraryId().equals(libraryId));
        this.libraryRepository.deleteById(libraryId);
        return libraryId + "Library Id successfully";
    }



}
