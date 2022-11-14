package com.learn.booklibrary.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Library {

    @Id
    private Integer libraryId;

    private String studentName;
    private String branch;
    private Integer rank;



}
