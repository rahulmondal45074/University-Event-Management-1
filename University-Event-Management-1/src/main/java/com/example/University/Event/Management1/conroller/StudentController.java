package com.example.University.Event.Management1.conroller;

import com.example.University.Event.Management1.entity.Deparment;
import com.example.University.Event.Management1.entity.Student;
import com.example.University.Event.Management1.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Validated
public class StudentController {

    @Autowired
    StudentService studentService;


    @PostMapping("student")
    public String addStudent(@RequestBody  @Valid List<Student> newStudents){
        return studentService.addStudents(newStudents);
    }




    @GetMapping("students")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();

    }


//    @PutMapping("student/id/{id}/deparment/{deparment}")
//    public String updateStudentDeparment( @PathVariable Integer id, @PathVariable Deparment deparment){
//        return studentService.updateStudentDeparment(id,deparment);
//    }


    @PutMapping("student/id/{id}/deparment/{deparment}")
    public String updateDeparmentByStudentId(@PathVariable Integer id,@PathVariable Deparment deparment){
        return studentService.updateDeparmentByStudentId(id,deparment);
    }
    @DeleteMapping("student/id/{id}")
    public String removeStudentById( @PathVariable Integer id){
        return studentService.removeStudentById(id);
    }

    @GetMapping("student/gsbi/{id}")
    public Optional<Student> getStudentById(@PathVariable Integer id){
        return studentService.getStudentById(id);
    }




}
