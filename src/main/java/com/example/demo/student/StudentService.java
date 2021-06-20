package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

//Spring bean
@Service
public class StudentService {
    public List<Student> getStudent(){
        return List.of(new Student(
                1L,
                "Suyash",
                "suyash@gmail.com",
                LocalDate.of(1997,11,15),
                24
        ));
    }
}
