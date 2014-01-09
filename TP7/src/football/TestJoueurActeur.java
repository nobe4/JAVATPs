package football;

import java.util.ArrayList;

public class TestJoueurActeur {
	ArrayList<Acteur> test = new ArrayList<Acteur>();
	Joueur joueur1 = new Joueur("Jean", "Pierre", 25, 256000.50);
	Joueur joueur2 = new Joueur("Luc", "Pierre", 26, 256000.50);
	Joueur joueur3 = new Joueur("Victor", "Pierre", 28, 256000.50);
	test.add(joueur1);
	test.add(joueur2);
	test.add(joueur3);
	
	Arbitre testArbitre = new Arbitre("Kivoitou", "KAntantou", 45, 3);
	
	
	test.add(testArbitre);
	
	
	for(int i = 0; i < test.size(); i++){
		Acteur display = test.get(i);
		System.out.println(display.toString());
	}
	
	
	
}
