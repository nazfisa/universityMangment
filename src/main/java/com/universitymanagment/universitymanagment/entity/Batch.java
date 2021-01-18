package com.universitymanagment.universitymanagment.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
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
public class Batch implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;

    @OneToMany(mappedBy = "batch", cascade = CascadeType.ALL)
    private List<Student> students;
}
