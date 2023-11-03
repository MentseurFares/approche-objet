package listes;

public class Ville {
    private String nomVille;
    private long nbHabitants;

    public Ville(String nomVille, long nbHabitants) {
        this.nomVille = nomVille;
        this.nbHabitants = nbHabitants;
    }

    public String getNomVille() {
        return nomVille;
    }

    public long getNbHabitants() {
        return nbHabitants;
    }

    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    @Override
    public String toString() {
        return nomVille +"\t" +nbHabitants;
    }

    public void setNbHabitants(long nbHabitants) {
        this.nbHabitants = nbHabitants;
    }
}
