package listes;

import com.sun.source.tree.NewArrayTree;

import java.util.ArrayList;
import java.util.List;

public class TestVille {
    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<>();
        Ville maxVille = null ;
        Ville minVille = null;
        // Initialisation liste
        initialiseList(villes);
        // Affichage liste
        afficheList(villes);
        // Recherchez et affichez la ville la plus peuplée
        for (int i = 0; i < villes.size() ; i++) {
            if(maxVille ==null || maxVille.getNbHabitants() < villes.get(i).getNbHabitants()){
                maxVille = villes.get(i);
            }
        }

        System.out.println("\n----------------------------------\n");
        System.out.println("La ville peuplée : "+maxVille);
        // Supprimer la ville moins peuplée
        for (int i = 0; i < villes.size() ; i++) {
            if(minVille ==null || minVille.getNbHabitants() > villes.get(i).getNbHabitants()){
                minVille = villes.get(i);
            }
        }
        villes.remove(minVille);
        System.out.println("La ville moins peuplée à supprimer : "+minVille);
        System.out.println("\n----------------------------------\n");
        afficheList(villes);

        // • Modifiez les villes de plus de 100 000 habitants en mettant leur nom en majuscules

        for (int i = 0; i < villes.size(); i++) {
            if(villes.get(i).getNbHabitants() > 100_000){
                villes.get(i).setNomVille(villes.get(i).getNomVille().toUpperCase());
            }
        }

        // Affichage liste
        System.out.println("\n----------------------------------\n");
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
