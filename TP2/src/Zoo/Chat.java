package Zoo;

/**
 * Created with IntelliJ IDEA.
 * User: padawan
 * Date: 12/2/13
 * Time: 8:30 AM
 * To change this template use File | Settings | File Templates.
 */
public class Chat extends Animal {
    private String race;

    public Chat(int poids, String nom, String race) {
        super(poids, nom);
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "race='" + race + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Chat chat = (Chat) o;

        if (!race.equals(chat.race)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + race.hashCode();
        return result;
    }

    @Override
    public void manger() {
        System.out.println("le chat mange");
    }
}
