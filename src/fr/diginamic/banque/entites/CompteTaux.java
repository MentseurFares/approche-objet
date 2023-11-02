package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{
    private float tauxRenumeration;
    public CompteTaux(int numroCompte, int soldeCompte, float tauxRenumeration) {
        super(numroCompte, soldeCompte);
        this.tauxRenumeration = tauxRenumeration;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\ttauxRenumeration = " + tauxRenumeration ;
    }
}
