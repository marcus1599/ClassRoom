package com.example.ClassRoom.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ClassRoom.Models.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}
