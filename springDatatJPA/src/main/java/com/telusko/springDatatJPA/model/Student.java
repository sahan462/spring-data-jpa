package com.telusko.springDatatJPA.model;

import jakarta.persistence.Entity;
import org.springframework.context.annotation.Scope;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
@Entity
public class Student {

    @Id
    private Integer rollNo;
    private String name;
    private int marks;


    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

}
