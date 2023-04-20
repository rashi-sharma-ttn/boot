package com.jpa3.jpa3;

import jakarta.persistence.*;
@Entity
public class Subject {
    @Id
    int aid;
@Column(name="subject")
   private String name;
  @ManyToOne
  @JoinColumn(name="a_id")
  private AuthorQ1 author;

    public String getName() {
        return name;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AuthorQ1 getAuthor() {
        return author;
    }
    public void setAuthor(AuthorQ1 author) {
        this.author = author;
    }
}
