package com.example.University.Event.Management1.service;


import com.example.University.Event.Management1.entity.Deparment;
import com.example.University.Event.Management1.entity.Student;
import com.example.University.Event.Management1.repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    IStudentRepo iStudentRepo;

    public String addStudents(List<Student> newStudents) {
        iStudentRepo.saveAll(newStudents);
        return "student added";
    }

    public List<Student> getAllStudent() {
        return iStudentRepo.findAll();
    }

    public String updateDeparmentByStudentId(Integer id, Deparment deparment) {

        Student student=iStudentRepo.findById(id).orElseThrow(null);
        if(student != null){
            student.setStudentDeparment(deparment);
            iStudentRepo.save(student);
            return "deparment updated";
        }
        else{
            return "invalid id";
        }
    }

    public String removeStudentById(Integer id) {
        iStudentRepo.deleteById(id);
        return "Student deleted";
    }

    public Optional<Student> getStudentById(Integer id) {
       return iStudentRepo.findById(id);

    }


//    @Transactional
//    public String updateStudentDeparment(Integer id, Deparment deparment) {
//        iStudentRepo.updateStudentDeparment(id,deparment);
//        return "deparment updated";
//    }
}
