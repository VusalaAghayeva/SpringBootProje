package com.ingress2.ders2.service;

import com.ingress2.ders2.dto.CreateStudentDto;
import com.ingress2.ders2.dto.StudentDto;

public interface StudentService {
    StudentDto getStudent(Long id);
     StudentDto create(CreateStudentDto studentDto);
     StudentDto update(Long id,CreateStudentDto studentDto);
     void delete(Long id);
}
