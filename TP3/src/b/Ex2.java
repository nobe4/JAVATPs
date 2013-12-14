package b;

import java.util.HashMap;

/**
 * Created by padawan on 12/14/13.
 */
public class Ex2 {

    public static void main(String[] args) {
        HashMap<Pair<String,String>,String> map  = new HashMap<Pair<String,String>,String>();
        map.put(new Pair<String,String>("jean-paul","sartre"),"mort");
        Pair<String, String> e = new Pair<String,String>("elvis","presley");
        map.put(e,"vivant");
        map.remove(e);
        System.out.println(map);
    }


    public static class Pair<U, V> {
        private final U first;
        private final V second;
        public Pair(U first, V second) {
            this.first=first;
            this.second=second;
        }
        public U getFirst() {
            return first;
        }
        public V getSecond() {
            return second;
        }
        @Override
        public String toString() {
            return first+" "+second;
        }
    }

}
