package football;

import java.util.ArrayList;

public class testEquipe {
	ArrayList<Joueur> test = new ArrayList<Joueur>();
	Joueur joueur1 = new Joueur("Jean", "Pierre", 25, "Machin",256000.50);
	Joueur joueur2 = new Joueur("Luc", "Pierre", 26, "Truc", 256000.50);
	Joueur joueur3 = new Joueur("Victor", "Pierre", 28, "Truc", 256000.50);	
	test.add(joueur2);
	test.add(joueur3);
	Equipe equipe1 = new Equipe("Truc", test);
	equipe1.addJoueur(joueur1);0
	
}
