package fr.diginamic.banque.entites;

public abstract class Operation {
    private String dateOperation ;
    private float  montantOperation;

    public Operation(String dateOperation, float montantOperation) {
        this.dateOperation = dateOperation;
        this.montantOperation = montantOperation;
    }

    public String getDateOperation() {
        return dateOperation;
    }

    public float getMontantOperation() {
        return montantOperation;
    }

    public abstract String getType();
}
