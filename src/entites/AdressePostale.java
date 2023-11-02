package entites;

public class AdressePostale {
    private int numeroRue;
    private String libelleRue;
    private String codePostale;
    private String ville;

    public AdressePostale(int numeroRue, String libelleRue, String codePostale, String ville) {
        this.numeroRue = numeroRue;
        this.libelleRue = libelleRue;
        this.codePostale = codePostale;
        this.ville = ville;
    }
}
