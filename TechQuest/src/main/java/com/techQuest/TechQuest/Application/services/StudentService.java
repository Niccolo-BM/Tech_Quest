package com.techQuest.TechQuest.Application.services;

import com.techQuest.TechQuest.Domain.Entities.Skill;
import com.techQuest.TechQuest.Domain.Entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private SkillRepository skillRepository;

    public void assignSkillsToStudent(Long studentId, Set<Long> skillIds) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new ResourceNotFoundException("Estudiante no encontrado"));
        Set<Skill> skills = skillRepository.findAllById(skillIds);
        student.getHabilidades().addAll(skills);
        studentRepository.save(student);
    }
}

