package listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            list.add(i + 1);
        }
        for(Integer i : list){
            System.out.print(i+"\t");
        }
        System.out.println();
    }
}
