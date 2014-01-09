package football;

import java.util.ArrayList;

public class TestPartie {
	ArrayList<Joueur> test = new ArrayList<Joueur>();
	ArrayList<Joueur> test2 = new ArrayList<Joueur>();
	Arbitre testArbitre = new Arbitre("Kivoitou", "KAntantou", 45, 3);
	Joueur joueur1 = new Joueur("Jean", "Pierre", 25, "Machin",256000.50);
	Joueur joueur2 = new Joueur("Luc", "Pierre", 26, "Truc", 256000.50);
	Joueur joueur3 = new Joueur("Victor", "Pierre", 28, "Truc", 256000.50);	
	test.add(joueur2);
	test.add(joueur3);
	test2.add(joueur1);
	Equipe equipe1 = new Equipe("Truc", test);
	Equipe equipe2 = new Equipe("Machin", test2);
	
	Partie testPartie = new Partie(equipe1, equipe2, testArbitre);
	
}
