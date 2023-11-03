package tri;

import listes.Ville;

import java.util.Comparator;

public class ComparatorNom implements Comparator<Ville> {

    @Override
    public int compare(Ville ville1, Ville ville2) {
        return ville1.getNomVille().compareTo(ville2.getNomVille());
    }
}
