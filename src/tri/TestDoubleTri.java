package tri;

import listes.Ville;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestDoubleTri {

    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<>();
        // Initialisation liste
        initialiseList(villes);
        // Affichage liste
        afficheList(villes);
        // Premier Tri par nombre d'habitants
        System.out.println("\n----------------------------\n");
        Collections.sort(villes,new ComparatorHabitant());
        afficheList(villes);
        // Deuxième tri avec nom de ville
        System.out.println("\n----------------------------\n");
        Collections.sort(villes,new ComparatorNom());
        afficheList(villes);
    }
    private static void initialiseList(ArrayList<Ville> villes) {
        villes.add(new Ville("Nice",343_000));
        villes.add(new Ville("Carcassone",47_800));
        villes.add(new Ville("Narbonne",53_400));
        villes.add(new Ville("Lyon",484_000));
        villes.add(new Ville("Foix",9_700));
        villes.add(new Ville("Pau",77_200));
        villes.add(new Ville("Marseille",850_000));
        villes.add(new Ville("Tarbes",40_600));
    }


    public static void afficheList(List<Ville> list){
        for (Ville ville : list){
            System.out.println(ville);
        }
    }
}
