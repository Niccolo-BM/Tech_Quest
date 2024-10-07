package com.techQuest.TechQuest.Domain.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface StudentRepository<Student> extends JpaRepository<Student, Long> {
    Optional<Student> findByEmail(String email);
    // Aquí se pueden agregar métodos de consulta personalizados si se requieren.
}

