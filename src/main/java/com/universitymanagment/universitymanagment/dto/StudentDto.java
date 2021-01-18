package com.universitymanagment.universitymanagment.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author : Name
 * @author : Nazim Uddin Asif
 * @since : 1/10/2021, Sun
 **/
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private long id;
    private String name;
    private String academicId;
    private DepartmentDto department;
    private BatchDto batch;
    private EnrollmentDto enrollment;
}
