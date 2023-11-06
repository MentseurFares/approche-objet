package listes;

public class TestEquals {
    public static void main(String[] args) {
        Ville ville1 = new Ville("Montpellier", 300_000);
        Ville ville2 = new Ville("Montpellier", 300_000);


        System.out.println(ville1);
        System.out.println(ville2);
        System.out.println(ville1.hashCode());
        System.out.println(ville2.hashCode());
        System.out.println("les deux villes sont égales avec la méthode equals  : "+ ville1.equals(ville2));
        System.out.println("les deux villes sont égales  avec le test == : "+ (ville1 == ville2));

        ville2.setNomVille("Toulouse");
        System.out.println("les deux villes sont égales avec la méthode equals  : "+ ville1.equals(ville2));
        System.out.println("les deux villes sont égales  avec le test == : "+ (ville1 == ville2));


    }
}
