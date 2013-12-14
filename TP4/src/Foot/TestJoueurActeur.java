package Foot;

/**
 * Created by padawan on 12/14/13.
 */
public class TestJoueurActeur {
    public static void main(String[] args) throws EquipePleineException, MauvaiseEquipeException {
        Equipe e = new Equipe("zer");
        Joueur j = new Joueur("nom", "prenom", 12, 817263, "zer");
        Joueur j2 = new Joueur("nqsdom", "presdnom", 12, 8263, "zer");
        Joueur j3 = new Joueur("nqsdom", "prensdom", 12, 81763, "zer");
        try {
            e.add(j);
            e.add(j2);
            e.add(j3);
        } catch (MauvaiseEquipeException e1) {
            e1.printStackTrace();
        } catch (EquipePleineException e1) {
            e1.printStackTrace();
        }


        Equipe e2 = new Equipe("unio");
        Joueur j21 = new Joueur("nom", "prenom", 12, 81263, "unio");
        Joueur j22 = new Joueur("nqsdom", "presdnom", 12, 83, "unio");
        Joueur j23 = new Joueur("nqsdom", "prensdom", 12, 863, "unio");
        try {
            e2.add(j21);
            e2.add(j22);
            e2.add(j23);
        } catch (MauvaiseEquipeException e1) {
            e1.printStackTrace();
        } catch (EquipePleineException e1) {
            e1.printStackTrace();
        }

        Arbitre a = new Arbitre("a", "a", 123, Arbitre.XP.confirme);


        Partie p = new Partie(e, e2, a);
        a.setPartie(p);

        System.out.println(p.toString());
        p.marquer(j21);
        p.marquer(j);
        p.marquer(j);

       /* try {
            a.expulse(j);
        } catch (HorsEquipeException e1) {
            e1.printStackTrace();
        }*/
        System.out.println(p.toString());

        TestComparaisonSalaires t = new TestComparaisonSalaires(p);

    }
}
