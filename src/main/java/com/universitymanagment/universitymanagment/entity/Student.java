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
 * @since : 1/6/2021, Wed
 **/
@Entity
@Setter
@Getter
@NoArgsConstructor
public class Student implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;
    @Column
    private String academicId;

    @ManyToOne(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.MERGE,
                    CascadeType.DETACH,
                    CascadeType.REFRESH})
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToOne(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.MERGE,
                    CascadeType.DETACH,
                    CascadeType.REFRESH})
    @JoinColumn(name = "batch_id")
    private Batch batch;

    @OneToOne(mappedBy = "student", cascade= {CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH,
            CascadeType.DETACH})
    private Enrollment enrollment;


}
