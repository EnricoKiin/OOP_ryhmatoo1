public class Möku implements Vastane {

    private int health = 50;

    private int rynde_tugevus = 5;
    private boolean ryndab;
    private boolean kaitseb;


    public void ryndab() {

        if (kangelane_kaitseb) {
            System.out.println("Möku ahvatles sind 5-eurose õluga.");
        }

        else {
            set.pangakonto(int rynde_tugevus);
        }


    };

    public void kaitseb() {
        this.kaitseb = true;
        return true;
    }

    public int getElud() {

    }

    public void setElud() {

    }
}
