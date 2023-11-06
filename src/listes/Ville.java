package listes;

import java.util.Objects;

public class Ville {
    private String nomVille;
    private long nbHabitants;

    public Ville(String nomVille, long nbHabitants) {
        this.nomVille = nomVille;
        this.nbHabitants = nbHabitants;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Ville)) {
            return false;
        }
        Ville ville = (Ville) object;
        return (Objects.equals(this.nomVille, ville.getNomVille()) && (this.nbHabitants == this.getNbHabitants()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomVille, nbHabitants);
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
        return nomVille + "\t" + nbHabitants;
    }

    public void setNbHabitants(long nbHabitants) {
        this.nbHabitants = nbHabitants;
    }
}

