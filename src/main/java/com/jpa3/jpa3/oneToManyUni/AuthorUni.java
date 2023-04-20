package com.jpa3.jpa3.oneToManyUni;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class AuthorUni {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aid")
    private int id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    Set<BookUni> book;

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

    public Set<BookUni> getBook() {
        return book;
    }

    public void setBook(Set<BookUni> book) {
        this.book = book;
    }
}