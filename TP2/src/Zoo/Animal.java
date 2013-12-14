package Zoo;

/**
 * Created with IntelliJ IDEA.
 * User: padawan
 * Date: 12/2/13
 * Time: 8:16 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Animal {
    private int poids;
    private String nom;

    public Animal(int poids, String nom) {
        this.poids = poids;
        this.nom = nom;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "poids=" + poids +
                ", nom='" + nom + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (poids != animal.poids) return false;
        if (!nom.equals(animal.nom)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = poids;
        result = 31 * result + nom.hashCode();
        return result;
    }

    public abstract void manger();

}
