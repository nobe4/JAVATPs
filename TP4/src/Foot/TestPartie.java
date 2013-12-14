package Foot;

/**
 * Created by padawan on 12/14/13.
 */
public class TestPartie {
    public TestPartie() {
        Equipe e1 = new Equipe("a");
        Equipe e2 = new Equipe("b");
        Arbitre a =  new Arbitre("1", "AZ", 12, Arbitre.XP.confirme);
        Partie p = new Partie(e1, e2, a);
        a.setPartie(p);
        Joueur j = new Joueur("qsd","qsd",12,12,"a");
        try {
            e1.add(j);
        } catch (MauvaiseEquipeException e) {
            e.printStackTrace();
        } catch (EquipePleineException e) {
            e.printStackTrace();
        }
        p.marquer(j);
        try {
            a.expulse(j);
        } catch (HorsEquipeException e) {
            e.printStackTrace();
        }
        System.out.println(p.toString());
    }
}
