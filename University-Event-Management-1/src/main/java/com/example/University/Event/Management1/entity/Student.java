package com.example.University.Event.Management1.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;

    @Pattern(regexp = "^[A-Z][a-zA-Z]*$", message = "First letter of the first name should be capitalized")
    private String  studentFirstName;
    private String studentLastName;
    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 25, message = "Age must be at most 25")
    private  Integer studentAge;


   // if we add enum it's not working
    @Enumerated(EnumType.STRING)
    private Deparment studentDeparment;

}
