package com.example.tpspring1.repository;

import com.example.tpspring1.entity.Formateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormateurRepo extends JpaRepository<Formateur,Long> {
}
