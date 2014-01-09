package b;

import java.util.HashMap;

/**
 * Created by padawan on 12/14/13.
 */
public class Ex1 {
    public static void main(String[] args) {
        HashMap<String, Animal> liste = new HashMap<String, Animal>();
        liste.put("Alice", new Animal("edith", "singe"));
        liste.put("Bob", new Animal("izard", "chamoix"));
        liste.put("June", new Animal("gold", "poisson"));

        System.out.println(liste.get(args[0]).toString());
    }

    public static class Animal {
        String name, type;


        public Animal(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "Animal{" +
                    "name='" + name + '\'' +
                    ", type='" + type + '\'' +
                    '}';
        }
    }

}

