package com.universitymanagment.universitymanagment.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * @author : Name
 * @author : Nazim Uddin Asif
 * @since : 1/9/2021, Sat
 **/
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SessionSemester {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy = "sessionSemester", cascade = CascadeType.ALL)
    private List<Enrollment> enrollments;
}
