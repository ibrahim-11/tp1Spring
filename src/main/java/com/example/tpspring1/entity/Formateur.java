package com.example.tpspring1.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table
    public class Formateur extends Personne{
        @Column
        private Date dateAmbauche;
        @Column
        private int experience;
        @Column
        private Boolean interne;
        @OneToMany
        @JoinColumn(name="stagiaire_id")
        private List<Stagiaire> stagiaireList;
        @ManyToMany
// Création d'une table appelée matieres_formateurs avec 
//deux colonnes formateur_id et matiere_id.
        @JoinTable(name = "matieres_formateurs",
                joinColumns = @JoinColumn(name = "formateur_id"),
                inverseJoinColumns = @JoinColumn(name = "matiere_id"))
        private List<Matiere> matiereListreList;
        public Formateur(Long id, String civilite, String nom, String prenom, String email, String adresse) {
            super(id, civilite, nom, prenom, email, adresse);
        }


// Un constructeur.
        public Formateur(Long id, String civilite, String nom, String prenom, String email, String adresse, Date dateAmbauche, int experience, Boolean interne) {
            super(id, civilite, nom, prenom, email, adresse);
            this.dateAmbauche = dateAmbauche;
            this.experience = experience;
            this.interne = interne;

        }

    public Formateur() {

    }

    public Date getDateAmbauche() {
            return dateAmbauche;
        }

        public void setDateAmbauche(Date dateAmbauche) {
            this.dateAmbauche = dateAmbauche;
        }

        public int getExperience() {
            return experience;
        }

        public void setExperience(int experience) {
            this.experience = experience;
        }

        public Boolean getInterne() {
            return interne;
        }

        public void setInterne(Boolean interne) {
            this.interne = interne;
        }

        public List<Stagiaire> getStagiaireList() {
            return stagiaireList;
        }

        public void setStagiaireList(List<Stagiaire> stagiaireList) {
            this.stagiaireList = stagiaireList;
        }

        public List<Matiere> getMatiereListreList() {
            return matiereListreList;
        }

        public void setMatiereListreList(List<Matiere> matiereListreList) {
            this.matiereListreList = matiereListreList;
        }
    }


