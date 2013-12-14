package Exo3;

import javafx.util.Pair;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: padawan
 * Date: 12/2/13
 * Time: 9:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class Hashit {
    public static void main(String[] args) {
        HashMap<String,Pair<String, String >> map = new HashMap<String, Pair<String, String>>();

        map.put("Alice",new Pair<String, String>("Edith","Singe"));
        map.put("Bob",new Pair<String, String>("Izard","Chamoix"));
        map.put("June",new Pair<String, String>("Gold","Poisson Rouge"));

        System.out.println(map);

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(map.get(name).getKey() + map.get(name).getValue());
    }
}
