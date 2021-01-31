package com.kar.hellorest.entity;

import javax.persistence.*;

@Entity
@Table(name = "greetings")
public class Name {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    public Name(){

    }

    public Name(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "Name: {id: " + id + ", name: " + name + "}";
    }
}
