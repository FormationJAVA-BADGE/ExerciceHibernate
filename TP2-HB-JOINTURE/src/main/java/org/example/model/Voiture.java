package org.example.model;


import jakarta.persistence.*;

@Entity
public class Voiture {


    @Id
    @GeneratedValue
    private int id;
    private String modele;
    private String couleur;

    @ManyToOne
    private Marque marque;

    public Voiture() {
    }

    public Voiture(String modele, String couleur) {
        this.modele = modele;
        this.couleur = couleur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }
}
