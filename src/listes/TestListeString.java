package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("Nice","Carcassone","Narbonne","Lyon","Foix","Pau","Marseille","Tarbes"));
        String maxString = null;

        //Affichage initial de la liste de string
        afficheList(stringList);

        // Recherchez la ville dans cette liste qui a le plus grand nombre de lettres
        for (String str : stringList){
            if(maxString == null){
                maxString = str;
            }else{
                if(maxString.length()<str.length()){
                    maxString = str;
                }
            }
        }
        System.out.println("La ville avec le plus grand nombre de lettre : " + maxString);

        // Modifiez le contenu de la liste de manière à mettre tous les noms de villes en majuscules.
        for (int i = 0; i< stringList.size();i++) {
            stringList.set(i,stringList.get(i).toUpperCase());
        }

        afficheList(stringList);


        // Supprimez de la liste les villes dont le nom commence par la lettre N
        for (int i = 0; i < stringList.size(); i++) {
            if(stringList.get(i).startsWith("N")){
                stringList.remove(i);
            }
        }

        afficheList(stringList);

        // Affichez la liste résultante
    }

    public static void afficheList(List<String> list){
        for (String str : list){
            System.out.print(str + "\t");
        }
        System.out.println();
    }

}
