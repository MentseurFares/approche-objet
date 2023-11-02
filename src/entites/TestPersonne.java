package entites;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adresse = new AdressePostale(45,"Rue du Faubourg Saint Jaumes","3400","Montpellier");
        Personne personne = new Personne("Fares","MENTSEUR",adresse);
        // affichage nom et prenom
        personne.affichagePersonneName();
        // modification des information de personne
        personne.setPrenom("samy");
        personne.setNom("mentseur");
        adresse = new AdressePostale(23,"Rue de la liberté ", "31000","Toulouse");
        personne.setAdressePostale(adresse);
        //affichage nouvelles infos de personne
        personne.affichagePersonneName();

    }
}