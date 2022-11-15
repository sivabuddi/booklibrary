package com.learn.booklibrary.service;

import com.learn.booklibrary.model.Library;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class LibraryService {

    List<Library> libraryList = new ArrayList<>(Arrays.asList(
            new Library(001,"SivaKumar","CSE",500),
            new Library(002,"Rakesh","IT",900),
            new Library(003, "Kenny","EIE",800)));


    // display all books

    public List<Library> getAllBooks(){
        return this.libraryList;
    }



    // display only single book

    public Library getSingleBook(Integer id){
        for(int i=0;i<this.libraryList.size();i++){
            Library library1 = this.libraryList.get(i);
            if(library1.getLibraryId().equals(id))
                return library1;
        }
        return null;
    }


    // add new book

    public String addNewBook(Library library){
        this.libraryList.add(library);
        return "Added new Book Successfully";
   }


    // update book with new student id

    public void updateBook(Library library, Integer libraryId ){
        for(int i=0;i<this.libraryList.size();i++){
            Library library1 = this.libraryList.get(i);
            if(library1.getLibraryId().equals(libraryId))
                this.libraryList.set(i,library);
        }

    }

    // delete a book
    public String deleteBook(Integer libraryId){
        this.libraryList.removeIf(book -> book.getLibraryId().equals(libraryId));
        return libraryId + "Library Id successfully";
    }



}
