package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import org.w3c.dom.ls.LSOutput;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte = new Compte(23456,100_000);
        // Acces impossible sans accesseur (Getters)
        System.out.println(compte);
    }
}
