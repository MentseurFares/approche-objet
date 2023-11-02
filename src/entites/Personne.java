package entites;

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

    public void affichagePersonneName() {
        System.out.println("Prenom, Nom : " + this.prenom + " " + this.nom.toUpperCase());
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdressePostale(AdressePostale adressePostale) {
        this.adressePostale = adressePostale;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public AdressePostale getAdressePostale() {
        return adressePostale;
    }
}
