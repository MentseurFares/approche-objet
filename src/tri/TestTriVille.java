package tri;

import listes.Ville;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestTriVille {

    public static void main(String[] args) {
        List<VilleComparable> villes = new ArrayList<VilleComparable>();;
        initialiseList(villes);
        // Affichage liste
        afficheList(villes);
        Collections.sort(villes);
        System.out.println("\n------------------------------\n");
        afficheList(villes);

    }

    private static void initialiseList(List<VilleComparable> villes) {
        villes.add(new VilleComparable("Nice", 343_000));
        villes.add(new VilleComparable("Carcassone", 47_800));
        villes.add(new VilleComparable("Narbonne", 53_400));
        villes.add(new VilleComparable("Lyon", 484_000));
        villes.add(new VilleComparable("Foix", 9_700));
        villes.add(new VilleComparable("Pau", 77_200));
        villes.add(new VilleComparable("Marseille", 850_000));
        villes.add(new VilleComparable("Tarbes", 40_600));
    }

    public static void afficheList(List<VilleComparable> list){
        for (VilleComparable ville : list){
            System.out.println(ville);
        }
    }

}
