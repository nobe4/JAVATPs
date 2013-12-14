package Zoo;

import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: padawan
 * Date: 12/2/13
 * Time: 8:40 AM
 * To change this template use File | Settings | File Templates.
 */
public class Zoo {
    LinkedList<Animal> animals;

    public Zoo() {
        animals = new LinkedList<Animal>();
    }

    public void add(Animal a) {
        animals.add(a);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Zoo zoo = (Zoo) o;

        if (animals != null ? !animals.equals(zoo.animals) : zoo.animals != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return animals != null ? animals.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + animals +
                '}';
    }
}
