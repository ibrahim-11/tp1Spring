package com.example.tpspring1.repository;

import com.example.tpspring1.entity.Matiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatiereRepo extends JpaRepository<Matiere,Long> {
}
