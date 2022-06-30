package com.example.tpspring1.repository;

import com.example.tpspring1.entity.Stagiaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StagiaireRepo extends JpaRepository<Stagiaire,Long> {
}
