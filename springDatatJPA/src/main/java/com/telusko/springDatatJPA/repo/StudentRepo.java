package com.telusko.springDatatJPA.repo;

import com.telusko.springDatatJPA.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//here you need to add the class you're working with and the type of its primary key

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
