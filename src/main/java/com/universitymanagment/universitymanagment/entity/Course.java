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
public class Course {
    @Id
    @GeneratedValue( strategy =  GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;

    @ManyToOne( cascade = CascadeType.ALL)
    private Enrollment enrollment;
}
