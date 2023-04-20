package com.jpa3.jpa3;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name="author")
public class AuthorQ1 {
    @Id
    @Column(name="a_id")
    private int id;
    private String name;

    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
//    @JoinColumn(name="subject")
    private List<Subject> subjects;

    @Embedded
    private Address add;

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

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    @Column
    @Convert(converter = StringListConverter.class)
    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;}
}
