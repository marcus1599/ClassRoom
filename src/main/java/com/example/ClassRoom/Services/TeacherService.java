package com.example.ClassRoom.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ClassRoom.Models.Teacher;
import com.example.ClassRoom.Repositories.TeacherRepository;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);

    }

    public List<Teacher> getTeachers() {
        return (List<Teacher>) teacherRepository.findAll();
    }

}
