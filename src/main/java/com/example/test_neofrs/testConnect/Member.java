package com.example.test_neofrs.testConnect;

public class Member {
    private Integer id;
    private String name;
    private String department;

    public Member() {
    }

    public Member(Integer id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
