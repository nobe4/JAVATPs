package Zoo;

/**
 * Created with IntelliJ IDEA.
 * User: padawan
 * Date: 12/2/13
 * Time: 8:17 AM
 * To change this template use File | Settings | File Templates.
 */
public class Chien extends Animal {
    private String maitre;

    public Chien(int poids, String nom, String maitre) {
        super(poids, nom);
        this.maitre = maitre;
    }

    public String getMaitre() {
        return maitre;
    }

    public void setMaitre(String maitre) {
        this.maitre = maitre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Chien chien = (Chien) o;

        if (!maitre.equals(chien.maitre)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + maitre.hashCode();
        return result;
    }

    @Override
    public void manger() {
        System.out.println("le chien mange");
    }

    @Override
    public String toString() {
        return "Chien{" +
                "maitre='" + maitre + '\'' +
                '}';
    }


}
