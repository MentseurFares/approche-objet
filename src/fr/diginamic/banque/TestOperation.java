package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {
    public static void main(String[] args) {
        Operation[] operations = new Operation[4];
        operations[0] = new Credit("01/01/2034",450.0f);
        operations[1] = new Debit("19/05/2023",34500f);
        operations[2] = new Debit("06/06/2023",3219f);
        operations[3] = new Credit("18/10/2023",2000f);

        float sommeOperation = 0f;

        // Affichage de la liste des opération "Montant et Date" de l'opération
        for (int i = 0; i < operations.length; i++) {
            System.out.println("Operation "+(i+1) +" : montant : "+operations[i].getMontantOperation() +" le "+operations[i].getDateOperation() );
        }
        //Ajout de l'information type d'opération à l'affichage

        for (int i = 0; i < operations.length; i++) {
            System.out.println("Operation "+(i+1) +" de type "+operations[i].getType() +" : montant : "+operations[i].getMontantOperation() +" le "+operations[i].getDateOperation() );
        }
        // calcul du montant total de toutes les opération

        for (int i = 0; i < operations.length; i++) {
            if(operations[i].getType().equals("DEBIT")){
                sommeOperation += operations[i].getMontantOperation();
            }else{
                sommeOperation -= operations[i].getMontantOperation();
            }
        }
        // Affichage du solde du compte
        System.out.println("Le solde de votre compte est : "+sommeOperation);

    }
}
