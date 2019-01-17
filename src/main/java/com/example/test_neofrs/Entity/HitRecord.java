package com.example.test_neofrs.Entity;

import javax.persistence.*;

@Entity
public class HitRecord {
    @Id
    private Integer id;
    private String name;

    public HitRecord() {
    }

    public HitRecord(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HitRecord{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
