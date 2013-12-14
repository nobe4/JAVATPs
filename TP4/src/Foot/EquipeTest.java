package Foot;

/**
 * Created by padawan on 12/14/13.
 */
class EquipeTest {
    EquipeTest() {
        Equipe e = new Equipe("NoPlaying Inc");
        try {
            e.add(new Joueur("e","e",1,1,"NoPlaying Inc"));
            e.add(new Joueur("e","e",1,1,"NoPlaying Inc"));
            e.add(new Joueur("e","e",1,1,"NoPlaying Inc"));
            e.add(new Joueur("e","e",1,1,"NoPlaying Inc"));
            e.add(new Joueur("e","e",1,1,"NoPlaying Inc"));
            //e.add(new Joueur("e","e",1,1,"qsdsd Inc"));
            e.add(new Joueur("e","e",1,1,"NoPlaying Inc"));
            e.add(new Joueur("e","e",1,1,"NoPlaying Inc"));
            e.add(new Joueur("e","e",1,1,"NoPlaying Inc"));
            e.add(new Joueur("e","e",1,1,"NoPlaying Inc"));
            e.add(new Joueur("e","e",1,1,"NoPlaying Inc"));
            //e.add(new Joueur("e","e",1,1,"NoPlaying Inc"));
            //e.add(new Joueur("e","e",1,1,"NoPlaying Inc"));
        } catch (MauvaiseEquipeException e1) {
            e1.printStackTrace();
        } catch (EquipePleineException e1) {
            e1.printStackTrace();
        }
    }
}
