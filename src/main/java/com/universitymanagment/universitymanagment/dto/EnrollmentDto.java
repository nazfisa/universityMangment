package com.universitymanagment.universitymanagment.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author : Name
 * @author : Nazim Uddin Asif
 * @since : 1/10/2021, Sun
 **/
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EnrollmentDto {
    private long id;
    private StudentDto student;
    private SessionSemesterDto sessionSemester;
    private List<CourseDto> courses;
}
