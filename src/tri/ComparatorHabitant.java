package tri;

import listes.Ville;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {
    @Override
    public int compare(Ville ville1, Ville ville2) {
        if(ville1.getNbHabitants() == ville2.getNbHabitants()){
            return 0;
        } else if (ville1.getNbHabitants() > ville2.getNbHabitants()) {
            return 1;
        }
        return -1;
    }
}
