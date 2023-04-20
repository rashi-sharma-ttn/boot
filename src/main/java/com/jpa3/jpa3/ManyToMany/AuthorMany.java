package com.jpa3.jpa3.ManyToMany;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class AuthorMany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "authormany_bookmany",
    joinColumns = @JoinColumn(name = "author_id",referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "book_id",referencedColumnName = "id"))
    Set<BookMany> book;

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

    public Set<BookMany> getBook() {
        return book;
    }

    public void setBook(Set<BookMany> book) {
        this.book = book;
    }
}
