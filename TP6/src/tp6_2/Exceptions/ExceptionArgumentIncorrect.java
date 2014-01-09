package tp6_2.Exceptions;

/**
 * Created with IntelliJ IDEA.
 * User: Seb
 * Date: 09/01/14
 * Time: 10:25
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionArgumentIncorrect extends Exception {

    public ExceptionArgumentIncorrect(String s) {
        System.out.println("Argument passed to function is incorrect : " + s);
    }
}
