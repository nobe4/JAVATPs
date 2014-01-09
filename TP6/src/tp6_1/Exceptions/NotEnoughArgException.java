package tp6_1.Exceptions;

/**
 * Created with IntelliJ IDEA.
 * User: Seb
 * Date: 08/01/14
 * Time: 21:59
 * To change this template use File | Settings | File Templates.
 */
public class NotEnoughArgException extends Exception{
    public NotEnoughArgException(){
        System.out.println("Not enough arguments pass to function.");
    }
}
