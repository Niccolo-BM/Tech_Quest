package com.techQuest.TechQuest.Domain.Entities;

import com.techQuest.TechQuest.Domain.Enums.SkillType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity(name = "Skills")
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Enumerated(EnumType.STRING)
    private SkillType type;
}