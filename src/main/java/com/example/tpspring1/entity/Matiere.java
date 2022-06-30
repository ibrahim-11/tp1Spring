package com.example.tpspring1.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Matiere {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long  id;
    @Column
    private String nom;
    @Column
    private int dure;
    @Column
    private String difficulte;
    @ManyToMany
// Création d'une table appelée matieres_formateurs avec deux colonnes matiere_id et formateur_id.
    @JoinTable(name = "matieres_formateurs",
            joinColumns = @JoinColumn(name = "matiere_id"),
            inverseJoinColumns  = @JoinColumn(name = "formateur_id"))

    private List<Formateur> formateurListreList;


    public Matiere() {
    }

    public Matiere(Long id, String nom, int dure, String difficulte) {
        this.id = id;
        this.nom = nom;
        this.dure = dure;
        this.difficulte = difficulte;
    }

    public List<Formateur> getFormateurListreList() {
        return formateurListreList;
    }

    public void setFormateurListreList(List<Formateur> formateurListreList) {
        this.formateurListreList = formateurListreList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDure() {
        return dure;
    }

    public void setDure(int dure) {
        this.dure = dure;
    }

    public String getDifficulte() {
        return difficulte;
    }

    public void setDifficulte(String difficulte) {
        this.difficulte = difficulte;
    }
}
