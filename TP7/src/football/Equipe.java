package football;

import java.util.ArrayList;

public class Equipe {
	public static final int NOMBREJOUEURS = 11;
	private String club;
	protected ArrayList<Joueur> equipe;
	
	
	//Je ne comprend pas la question, bien Cordialement.
	public Equipe(String club, ArrayList<Joueur> equipe) {
		super();
		this.club = club;
		this.equipe = equipe;
	}

	@Override
	public String toString() {
		
		return "Equipe [club=" + club + ", equipe=" + affEquipe() + "]";
	}
	
	public String affEquipe(){
		String equipe = "";
		for(int i = 0; i < this.equipe.size(); i++){
			Joueur joueur = this.equipe.get(i);
			equipe += joueur.toString();
			equipe += "\n";
		}				
		return equipe;
	}
	
	public void addJoueur(Joueur addJ){
		if(this.equipe.size() == 11){
			System.out.println("Les 12 apôtres ne jouaient pas au football");
		}
		else if(addJ.club != this.club){
			System.out.println("Judas que viens tu faire dans notre équipe? Tu ne fais pas partie de notre club! Ton club est "+addJ.club+" et le nôtre est "+this.club+", va à Knysna si tu veux mais pas chez nous, sale traître!");
		}
		else{
			addJ.equipe = new Equipe(this.club, this.equipe);
			this.equipe.add(addJ);
		}		
	}
	
	
}
