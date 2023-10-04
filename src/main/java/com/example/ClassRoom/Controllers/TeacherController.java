package com.example.ClassRoom.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ClassRoom.Models.Teacher;
import com.example.ClassRoom.Services.TeacherService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @GetMapping(value = "")
    public ResponseEntity<Object> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(teacherService.getTeachers());
    }

    @PostMapping(value = "/register")
    public ResponseEntity<Object> saveTeacher(@RequestBody @Valid Teacher entity) {
        // TODO: process POST request

        return ResponseEntity.status(HttpStatus.CREATED).body(teacherService.saveTeacher(entity));
    }

}
