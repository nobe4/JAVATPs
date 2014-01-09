package football;

import java.util.Arrays;

public class Partie {
	private Equipe[] equipesCompetition = new Equipe[2];
	private Arbitre arbitre;
	protected int[] score = new int[2];
	
	
	public Partie(Equipe equipe1, Equipe equipe2, Arbitre arbitre) {
		super();
		this.equipesCompetition[0] = equipe1;
		this.equipesCompetition[1] = equipe2;
		this.arbitre = arbitre;
		this.score[0] = 0;
		this.score[1] = 0;
	}
	
	
	public void marqueurBut(Joueur buteur){
		if(this.equipesCompetition[0].equipe.contains(buteur)){
			this.score[0]++;
		}
		else{
			this.score[1]++;			
		}
			
	}


	@Override
	public String toString() {
		return "Partie [equipesCompetition="
				+ Arrays.toString(equipesCompetition) + ", arbitre=" + arbitre
				+ ", score=" + Arrays.toString(score) + "]";
	}
	
	public void classementSalaire(){
		
	}
}
