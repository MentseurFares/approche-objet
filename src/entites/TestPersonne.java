package entites;

public class TestPersonne {
    public static void main(String[] args) {
        Personne personne1 = new Personne();
        Personne personne2 = new Personne();
        // initialisation personne 1
        personne1.nom = "MENTSEUR";
        personne1.prenom = "Samy";
        personne1.adressePostale = new AdressePostale();
        personne1.adressePostale.numeroRue = 45;
        personne1.adressePostale.libelleRue = "Avenue de Toulouse";
        personne1.adressePostale.codePostale = "34000";
        personne1.adressePostale.ville = "Montpllier";
        // Initilisation personne2
        personne2.nom = "LAMALI";
        personne2.prenom = "Mehdi";
        personne2.adressePostale = new AdressePostale();
        personne2.adressePostale.numeroRue = 34;
        personne2.adressePostale.libelleRue = "Route de nimes";
        personne2.adressePostale.codePostale = "34500";
        personne2.adressePostale.ville = "Béziers";

        //affichage personne 1
        System.out.println("************* Personne 1 *************");
        System.out.println("Nom : " + personne1.nom);
        System.out.println("Prenom : " + personne1.prenom);
        System.out.println("Adresse : " + personne1.adressePostale.numeroRue + " " + personne1.adressePostale.libelleRue + " " + personne1.adressePostale.codePostale + " " + personne1.adressePostale.ville);
        //affichage personne 2
        System.out.println("************* Personne 2 *************");
        System.out.println("Nom : " + personne2.nom);
        System.out.println("Prenom : " + personne2.prenom);
        System.out.println("Adresse : " + personne2.adressePostale.numeroRue + " " + personne2.adressePostale.libelleRue + " " + personne2.adressePostale.codePostale + " " + personne2.adressePostale.ville);

    }
}