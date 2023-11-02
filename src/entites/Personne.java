package entites;

import entites.AdressePostale;

public class Personne {
    private String prenom;
    private String nom;
    private AdressePostale adressePostale;

    public Personne(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public Personne(String prenom, String nom, AdressePostale adressePostale) {
        this.prenom = prenom;
        this.nom = nom;
        this.adressePostale = adressePostale;
    }
}
