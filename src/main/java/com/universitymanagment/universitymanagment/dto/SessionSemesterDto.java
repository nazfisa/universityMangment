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
public class SessionSemesterDto {
    private long id;
    private String name;
    private List<EnrollmentDto> enrollments;
}
