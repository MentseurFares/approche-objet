package entites;

public class TestAdressePostale {

    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale();
        AdressePostale adresse2 = new AdressePostale();
         // initialisation adresse1
        adresse1.numeroRue = 64;
        adresse1.libelleRue = "Avenue de la justice Castelnau";
        adresse1.codePostale ="34000";
        adresse1.ville ="Montpellier";
        // initialisation adresse2
        adresse2.numeroRue = 34;
        adresse2.libelleRue = "Impasse du Courreau";
        adresse2.codePostale ="34990";
        adresse2.ville ="Juvignac";

        System.out.println("************* Adresse 1 ***************");
        System.out.println("Numéro de rue : " +adresse1.numeroRue);
        System.out.println("Libellé de la rue : "+adresse1.libelleRue);
        System.out.println("Code postal : "+adresse1.codePostale);
        System.out.println("Ville : "+adresse1.ville);
        System.out.println("************* Adresse 2 ***************");
        System.out.println("Numéro de rue : " +adresse2.numeroRue);
        System.out.println("Libellé de la rue : "+adresse2.libelleRue);
        System.out.println("Code postal : "+adresse2.codePostale);
        System.out.println("Ville : "+adresse2.ville);


    }
}
