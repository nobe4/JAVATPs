package package1;

/**
 * Created with IntelliJ IDEA.
 * User: padawan
 * Date: 11/28/13
 * Time: 11:12 AM
 * To change this template use File | Settings | File Templates.
 */
public class Morse {
    public static void main(String[] args) {
        String result = "";
        for (String s : args) {
            result += s + " Stop. ";
        }

        StringBuilder result2 = new StringBuilder();
        for (String s : args) {
            result2.append(s + " Stop. ");
        } // avantage ?

        System.out.println(result);
        System.out.println(result2);


        String first = args[0];
        String second = args[1];
        String last= args[2];
        System.out.println(first + ' ' + second + ' ' + last);

        // quelle différence il y a-t-il ?

    }
}
