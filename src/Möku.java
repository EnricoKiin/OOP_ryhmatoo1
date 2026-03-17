public class Möku implements Vastane {

    private int health = 50;

    private int rynde_tugevus = 5;


    public void ryndab() {

        if (kangelane_kaitseb) {
            System.out.println("Möku ahvatles sind 5-eurose õluga.");
        }

        else {
            set.kangelaseElud(int rynde_tugevus);
        }


    };

    public boolean kaitseb() {

        return true;
    }

    public int getElud() {

    }

    public void setElud() {

    }
}
