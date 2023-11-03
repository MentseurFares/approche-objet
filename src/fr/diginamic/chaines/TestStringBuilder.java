package fr.diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder strBuilder = new StringBuilder();
        String str = "";
        long debut = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            strBuilder.append(i+1);
        }
        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin - debut));

        debut = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            str += (i+1);
        }
        fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
    }
}
