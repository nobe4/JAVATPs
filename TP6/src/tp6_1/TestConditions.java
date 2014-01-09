package tp6_1;


import tp6_1.Exceptions.NotEnoughArgException;
import tp6_1.Exceptions.TooManyArgException;
import tp6_2.Exceptions.ExceptionArgumentIncorrect;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Seb
 * Date: 08/01/14
 * Time: 21:22
 * To change this template use File | Settings | File Templates.
 */
public class TestConditions {

    static void remplitAlea(ArrayList<Integer> array, int n) {
        int min = 0;
        int max = 50;
        do {
            array.add(min + (int) (Math.random() * ((max - min) + 1)));
        } while (n-- > 0);
    }

    static int compte(ArrayList<Integer> array, Condition condition, boolean bol) {
        int out = 0;
        for (int i : array) {
            if (condition.verif(i))
                out++;
        }
        if (!bol)
            out = array.size() - out;
        return out;
    }

    public static void main(String[] args) throws NotEnoughArgException, TooManyArgException, ExceptionArgumentIncorrect {
        if (args.length == 0)
            throw new NotEnoughArgException();
        if (args.length > 1)
            throw new TooManyArgException(args, 1);

        int n = 0;
        try {
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Incorrect number format.");
            throw new ExceptionArgumentIncorrect("Pas de comptage possible : " + args[0] + " | " + n);
        }

        ArrayList<Integer> array = new ArrayList<Integer>();

        //Fill array with random numbers
        remplitAlea(array, n);

        ArrayList<Condition> conditions = new ArrayList<Condition>();

        //Initialize conditions array
        conditions.add(new Pair());
        conditions.add(new SuperieurA(25));
        conditions.add(new InclusIntervalle(10, 35));

        //Go through array and show conditions
        for (Condition c : conditions) {
            int tmp = compte(array, c, true);
            System.out.println(c.toString() + " : " + tmp + "V+" + (array.size() - tmp) + "F");
        }


    }
}
