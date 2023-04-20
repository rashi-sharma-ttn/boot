package com.jpa3.jpa3.ManyToMany;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class BookMany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToMany(mappedBy = "book")
    private Set<AuthorMany> author;

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

    public Set<AuthorMany> getAuthor() {
        return author;
    }

    public void setAuthor(Set<AuthorMany> author) {
        this.author = author;
    }
}
