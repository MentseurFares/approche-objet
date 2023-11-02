package fr.diginamic.banque.entites;

public class Compte {
    private int numroCompte;
    private int soldeCompte;

    public Compte(int numroCompte, int soldeCompte) {
        this.numroCompte = numroCompte;
        this.soldeCompte = soldeCompte;
    }

    public int getNumroCompte() {
        return numroCompte;
    }

    public void setNumroCompte(int numroCompte) {
        this.numroCompte = numroCompte;
    }

    public void setSoldeCompte(int soldeCompte) {
        this.soldeCompte = soldeCompte;
    }

    public int getSoldeCompte() {
        return soldeCompte;
    }
}
