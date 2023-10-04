package com.example.ClassRoom.Models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Discipline implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer registration;

    @Column
    private String name;

    @Column
    private Student students;

    @Column
    @ManyToOne()
    @JoinColumn(name = "id_teacher")
    private Teacher teacher;

}
