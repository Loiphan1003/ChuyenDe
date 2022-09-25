package com.boilerplatespringmvc.model;


public class Student {
    private String name;
    private Double mark;
    private  String major;

    public Student(String name, Double mark, String major) {
        this.name = name;
        this.mark = mark;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Double getMark() {
        return mark;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }

    public void setName(String name) {
        this.name = name;
    }
}
