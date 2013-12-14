/**
 * Created by padawan on 12/14/13.
 */
public class Ex1 {
    public static void main(String[] args) {
        System.out.println("la moyenne est : " + String.valueOf(makeAverage(args)));
    }

    static Integer parseArg(String a) {
        Integer result = null;

        try {
            result = Integer.valueOf(a);
        } catch (NumberFormatException e) {
            System.out.println("Error : " + a + " not an integer (" + e.toString() + ")");
        }
        return result;
    }

    static Integer makeAverage(String[] args) {
        if (args == null || args.length == 0)
            return 0;

        Integer average = 0;
        int size = 0;

        Integer tmp = 0;


        for (String a : args) {
            tmp = parseArg(a);
            if (tmp != null) {
                System.out.println("new int : " + a);
                average += tmp;
                size++;
            }
        }

        try {
            average = average / size;
        } catch (ArithmeticException e) {
            System.out.println("Error : Cannot divide by 0  (" + e.toString() + ")");
        }

        return average;
    }
}

