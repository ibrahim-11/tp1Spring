package com.example.tpspring1.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Stagiaire extends Personne{
    @Column
    private Date dateNaissance;
    @ManyToOne
 // Création d'une colonne dans la base de données appelée `formateur_id`
    @JoinColumn(name = "formateur_id")
    private Formateur formateur;
        public Stagiaire(Long id, String civilite, String nom, String prenom, String email, String adresse) {
            super(id, civilite, nom, prenom, email, adresse);
        }

        public Stagiaire(Long id, String civilite, String nom, String prenom, String email, String adresse, Date dateNaissance) {
            super(id, civilite, nom, prenom, email, adresse);
            this.dateNaissance = dateNaissance;

        }

    public Stagiaire() {

    }

    public Date getDateNaissance() {
            return dateNaissance;
        }

        public void setDateNaissance(Date dateNaissance) {
            this.dateNaissance = dateNaissance;
        }

        public Formateur getFormateur() {
            return formateur;
        }

        public void setFormateur(Formateur formateur) {
            this.formateur = formateur;
        }
}
