package com.DocCompose.Compose;

import jakarta.persistence.*;


@Entity
@Table(name="Book")
public class Book {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    Integer id;

    public Book(String name, Integer id) {
        this.name = name;
        this.id = id;
    }
    public Book(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
}
