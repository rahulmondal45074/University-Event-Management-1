package com.example.University.Event.Management1.repo;


import com.example.University.Event.Management1.entity.Deparment;
import com.example.University.Event.Management1.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


public interface IStudentRepo extends JpaRepository<Student,Integer> {


//    @Modifying
//    @Query(nativeQuery = true,value = "update student set student_deparment=:deparment where student_id=:id")
//    void updateStudentDeparment(Integer id, Deparment deparment);
}
