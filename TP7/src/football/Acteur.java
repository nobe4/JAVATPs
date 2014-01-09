package football;

public abstract class  Acteur {
	protected final String nom;
	protected final String prenom;
	protected int age;
		
	abstract double getSalaire();
	
	public Acteur(String nom, String prenom, int age){
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNom() {
		return nom;
	}

	@Override
	public String toString() {
		return "Acteur [nom=" + nom + ", prenom=" + prenom + ", age=" + age
				+ "]";
	}

	public String getPrenom() {
		return prenom;
	}	
	
}
