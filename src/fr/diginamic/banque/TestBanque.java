package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;
import org.w3c.dom.ls.LSOutput;

public class TestBanque {
    public static void main(String[] args) {
        Compte[] comptes = new Compte[2];
        comptes[0] = new Compte(23456,100_000);
        comptes[1] = new CompteTaux(1345,1_000_000, 3.25f);

        for (int i = 0; i < comptes.length; i++) {
            System.out.println(comptes[i]);
        }
    }
}
