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
 * @since : 1/6/2021, Wed
 **/
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    @Id
    @GeneratedValue( strategy =  GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Student> students;

//    @ManyToMany(fetch = FetchType.LAZY,
//            cascade= {CascadeType.PERSIST, CascadeType.MERGE,
//                    CascadeType.DETACH, CascadeType.REFRESH})
//    @JoinTable(name = "semester_department",
//            joinColumns = @JoinColumn(name = "department_id"),
//            inverseJoinColumns = @JoinColumn(name= "semester_id"))
//    private List<Semester> semesters;


}
