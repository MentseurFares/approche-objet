package tri;

public class VilleComparable implements Comparable<VilleComparable> {
    private String nomVille;
    private long nbHabitants;

    public VilleComparable(String nomVille, long nbHabitants) {
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

    @Override
    public int compareTo(VilleComparable ville) {
        return this.nomVille.compareTo(ville.getNomVille());
    }
}
