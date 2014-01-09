package football;

public class Arbitre extends Acteur{		

	private int degreExperience;
	private Partie partie;
	
	public Partie getPartie() {
		return partie;
	}



	public void setPartie(Partie partie) {
		this.partie = partie;
	}



	public Arbitre(String nom, String prenom, int age, int degreExperience) {
		super(nom, prenom, age);
		this.degreExperience = degreExperience;
	}
	
	public boolean validerUnBut(Joueur buteur){
		return true;
	}
	
	
	@Override
	double getSalaire() {
		double salaire = (double)((Math.random()/10)*this.degreExperience);
		return salaire;
	}

	public void expulsionJoueur(Joueur j, Equipe e){
		if(!e.equipe.contains(j)){
			System.out.println(j.nom+" ne fais pas partie de l'équipe !");
		}
		else{
			e.equipe.remove(j);
		}
	}

	@Override
	public String toString() {
		return "Arbitre [degreExperience=" + degreExperience + ", nom=" + nom
				+ ", prenom=" + prenom + ", age=" + age + ", getSalaire()="
				+ getSalaire() + ", getAge()=" + getAge() + ", getNom()="
				+ getNom() + ", toString()=" + super.toString()
				+ ", getPrenom()=" + getPrenom() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
}
