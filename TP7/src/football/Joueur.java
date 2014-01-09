package football;

public class Joueur extends Acteur{
	protected String club;
	private double euroMillions;
	protected Equipe equipe;
	// On pourrait mettre en protected ces attributs et fonction
	// pour ainsi avoir que les classes qui en héritent puissent
	// y accéder
	public Joueur(String nom, String prenom, int age, String club, double euroMillions) {
		super(nom, prenom, age);
		this.club = club;
		this.euroMillions = euroMillions;
	}
	public Joueur(String nom, String prenom, int age, double euroMillions) {
		this( nom,  prenom,  age, "Knysna Syndrome Club", euroMillions);
	}
	public String getClub() {
		return club;
	}
	
	public Equipe getEquipe() {
		return equipe;
	}
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	double getSalaire() {
		double salaire = (double)(Math.random()*this.euroMillions);
		return salaire;
	}
	@Override
	public String toString() {
		return "Joueur [club=" + club + ", euroMillions=" + euroMillions
				+ ", getClub()=" + getClub() + ", getSalaire()=" + getSalaire()
				+ ", getAge()=" + getAge() + ", getNom()=" + getNom()
				+ ", toString()=" + super.toString() + ", getPrenom()="
				+ getPrenom() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}	
}
