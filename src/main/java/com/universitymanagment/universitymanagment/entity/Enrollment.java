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
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.MERGE,
                    CascadeType.DETACH,
                    CascadeType.REFRESH})
    @JoinColumn(name = "sessionSemester_id")
    private SessionSemester sessionSemester;

    @OneToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.MERGE,
                    CascadeType.DETACH,
                    CascadeType.REFRESH})
    @JoinColumn(name = "course_id")
    private List<Course> courses;
}
