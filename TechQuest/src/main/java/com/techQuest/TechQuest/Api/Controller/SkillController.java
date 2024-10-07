package com.techQuest.TechQuest.Api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/v1/students")
public class SkillController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/{id}/abilities")
    public ResponseEntity<?> assignSkills(@PathVariable Long id, @RequestBody Set<Long> skillIds) {
        studentService.assignSkillsToStudent(id, skillIds);
        return ResponseEntity.ok("Habilidades asignadas correctamente.");
    }
}



