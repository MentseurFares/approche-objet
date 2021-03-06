package fr.diginamic.recensementFares;

import java.util.Scanner;

import fr.diginamic.recensementFares.services.AffichageVillePeupleeDepartement;
import fr.diginamic.recensementFares.services.AffichagerDepartementPeuplee;
import fr.diginamic.recensementFares.services.AffichagerRegionPeuplee;
import fr.diginamic.recensementFares.services.AffichagerVillePeupleeFrance;
import fr.diginamic.recensementFares.services.AffichagerVillePeupleeRegion;
import fr.diginamic.recensementFares.services.RecherchePopulationDepartement;
import fr.diginamic.recensementFares.services.RecherchePopulationRegion;
import fr.diginamic.recensementFares.services.RecherchePopulationVille;

public class Application {
	private Scanner scanner;
	private Recensement recensement ;
	
	public Application() {
		scanner = new Scanner(System.in); 
		recensement = new Recensement();
	}

	private void start() {
		
		boolean isFinished = false;
		MenuService recherche = null;
		do {

			int choix = afficherMenu();
			switch (choix) {
			case 1:
				recherche = new RecherchePopulationVille();
				recherche.traiter(recensement, scanner);
				break;
			case 2:
				recherche = new RecherchePopulationDepartement();
				recherche.traiter(recensement, scanner);
				break;
			case 3:
				recherche = new RecherchePopulationRegion();
				recherche.traiter(recensement, scanner);
				break;

			case 4:
				recherche = new AffichagerRegionPeuplee();
				recherche.traiter(recensement, scanner);
				break;

			case 5:
				recherche = new AffichagerDepartementPeuplee();
				recherche.traiter(recensement, scanner);
				break;
			case 6:
				recherche = new AffichageVillePeupleeDepartement();
				recherche.traiter(recensement, scanner);
				break;
			case 7:
				recherche = new AffichagerVillePeupleeRegion();
				recherche.traiter(recensement, scanner);
				break;
			case 8:
				recherche = new AffichagerVillePeupleeFrance();
				recherche.traiter(recensement, scanner);
				break;
			case 9:
				isFinished = true;
				System.out.println("Merci");
				break;
			default:
				System.err.println("Mauvais choix : Entrer un nombre entre 1 et 9");
			}
		} while (!isFinished);

	}

	private int afficherMenu() {
		System.out.println("- 1. Population d???une ville donn??e" 
				+ "- 2. Population d???un d??partement donn??"
				+ "- 3. Population d???une r??gion donn??e" + "- 4. Afficher les 10 r??gions les plus peupl??es"
				+ "- 5. Afficher les 10 d??partements les plus peupl??s"
				+ "- 6. Afficher les 10 villes les plus peupl??es d???un d??partement"
				+ "- 7. Afficher les 10 villes les plus peupl??es d???une r??gion"
				+ "- 8. Afficher les 10 villes les plus peupl??es de France" + "- 9. Sortir");
		return scanner.nextInt();
	}

	public static void main(String[] args) {
		Application application = new Application();
		application.start();
	}
}
