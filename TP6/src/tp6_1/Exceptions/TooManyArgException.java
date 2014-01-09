package tp6_1.Exceptions;

/**
 * Created with IntelliJ IDEA.
 * User: Seb
 * Date: 08/01/14
 * Time: 22:06
 * To change this template use File | Settings | File Templates.
 */
public class TooManyArgException extends Exception {
    public TooManyArgException() {
        System.out.println("Too many arguments pass to function.");
    }

    public TooManyArgException(String[] args, int i) {
        System.out.println("Arguments ignored : ");
        while(i < args.length)
        {
            System.out.println(args[i] + " | ");
            i++;
        }
    }
}
