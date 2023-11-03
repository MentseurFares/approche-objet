package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestListeInt {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));
        Integer maxElement = null;
        Integer minElement = null;
        int indexMinELement = 0;

        // Affichage des elements de la lsite
        afficheListe(list);

        // Affichage de la taille d'une liste
        System.out.println("la taille de la lsite : " + list.size());

        // chercher le max de la liste
        maxElement = getMax(list);
        System.out.println("Le plus grand element : " + maxElement);

        // Chercher le minimum du tableau
        minElement = getMin(list);
        System.out.println("Le plus petit element : " + minElement);

        // supprimer le plus petit element
        indexMinELement = getIndexMinElement(list, minElement);
        list.remove(indexMinELement);
        // Affichage des elements de la lsite
        afficheListe(list);


    }

    public static void afficheListe(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();
    }

    public static Integer getMax(List<Integer> list) {
        Integer maxElement = null;
        for (int i = 0; i < list.size(); i++) {
            if (maxElement == null) {
                maxElement = list.get(i);
            } else {
                if (maxElement < list.get(i)) {
                    maxElement = list.get(i);
                }
            }
        }
        return maxElement;
    }

    public static Integer getMin(List<Integer> list) {
        Integer minElement = null;
        for (int i = 0; i < list.size(); i++) {
            if (minElement == null) {
                minElement = list.get(i);
            } else {
                if (minElement > list.get(i)) {
                    minElement = list.get(i);
                }
            }
        }
        return minElement;
    }

    public static int getIndexMinElement(List<Integer> list, Integer minElement) {
        return list.indexOf(minElement);
    }

}
