package org.launchcode.StudentManagement.service.impl;

import org.launchcode.StudentManagement.entity.Student;
import org.launchcode.StudentManagement.repository.StudentRepository;
import org.launchcode.StudentManagement.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
