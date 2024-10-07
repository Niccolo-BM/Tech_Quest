package com.techQuest.TechQuest.Domain.Entities;

import com.techQuest.TechQuest.Domain.Enums.DifficultyLevel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;
@Entity(name = "Missions")

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class Mission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;

    @Enumerated(EnumType.STRING)
    private DifficultyLevel difficulty;

    @ManyToMany
    private Set<Student> assignedStudents = new HashSet<>();

    @ManyToMany
    private Set<Skill> requiredSkills = new HashSet<>();

    
}
