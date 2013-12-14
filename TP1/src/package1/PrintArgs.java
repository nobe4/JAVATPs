package package1;

/**
 * Created with IntelliJ IDEA.
 * User: padawan
 * Date: 11/27/13
 * Time: 4:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class PrintArgs {
    public static void main(String[] args) {
        /*
            Si aucun argument n'est passé, il y a une erreur quand on essaye d'afficher le premier argument.
            Logique puisque args[0] n'existe pas sans au moins un argument.
         */

        for (Integer i = 0; i < args.length; i++) {
            System.out.println("args[" + i.toString() + "] : " + args[i]);
        }

        for (String arg : args) {
            System.out.println(arg);
        }
    }
    // no toString needed
}
