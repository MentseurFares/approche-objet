package utils;

import org.w3c.dom.ls.LSOutput;

public class TestMethodeStatic {
    public static void main(String[] args) {
        String chaine = "12";
        int entier = Integer.parseInt(chaine);
        System.out.println("la conversion de "+chaine+ " en entier : "+entier);
        int a=13, b=15;
        System.out.println("le max entre "+a+ " et " + +b+ " est : " +Integer.max(a,b));
    }
}
