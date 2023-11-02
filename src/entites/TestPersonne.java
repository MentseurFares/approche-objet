package entites;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale(45,"Rue du Faubourg Saint Jaumes","3400","Montpellier");
        AdressePostale adresse2 = new AdressePostale(64, "Avenue de Castelnau","34090","Montpellier");
        Personne personne1 = new Personne("Fares","MENTSEUR",adresse1);
        Personne personne2 = new Personne("Mehdi","LAMALI",adresse2);
    }
}