package com.ingress2.ders2.service;

import com.ingress2.ders2.domain.Student;
import com.ingress2.ders2.dto.CreateStudentDto;
import com.ingress2.ders2.dto.StudentDto;
import com.ingress2.ders2.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;
    @Override
    public StudentDto getStudent(Long id) {
        Student student=studentRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Student not found"));
                return modelMapper.map(student,StudentDto.class);
    }

    @Override
    public StudentDto create(CreateStudentDto studentDto) {
        Student student = studentRepository.save(
                modelMapper.map(studentDto, Student.class));
        return modelMapper.map(student, StudentDto.class);

    }

    @Override
    public StudentDto update(Long id, CreateStudentDto studentDto) {
        studentRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Student not found"));
        Student student = modelMapper.map(studentDto, Student.class);
        student.setId(id);
        studentRepository.save(student);
        return modelMapper.map(student, StudentDto.class);
    }

    @Override
    public void delete(Long id) {
            studentRepository.deleteById(id);

    }
}
