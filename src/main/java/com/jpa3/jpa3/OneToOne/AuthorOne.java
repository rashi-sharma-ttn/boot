package com.jpa3.jpa3.OneToOne;

import jakarta.persistence.*;

@Entity
public class AuthorOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    private BookOne book;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BookOne getBook() {
        return book;
    }

    public void setBook(BookOne book) {
        this.book = book;
    }
}
