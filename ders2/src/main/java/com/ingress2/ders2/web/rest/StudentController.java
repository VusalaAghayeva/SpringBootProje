package com.ingress2.ders2.web.rest;

import com.ingress2.ders2.dto.CreateStudentDto;
import com.ingress2.ders2.dto.StudentDto;
import com.ingress2.ders2.service.StudentService;
import com.ingress2.ders2.service.StudentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentServiceImpl service;

    @GetMapping("/{id}")
   public StudentDto getStudentById(@PathVariable Long id){
        return service.getStudent(id);
    }

    @PostMapping
    public StudentDto createStudent(@RequestBody CreateStudentDto studentDto){
        return service.create(studentDto);
    }

    @PutMapping("/{id}")
    public StudentDto updateStudent(@PathVariable Long id,@RequestBody CreateStudentDto studentDto){
        return service.update(id,studentDto);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id){
        service.delete(id);
    }






}
