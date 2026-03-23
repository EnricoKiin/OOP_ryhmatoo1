import java.util.Scanner;

public class Testryhmatoo {

    public static void main(String[] args) {

        Scanner teine = new Scanner(System.in);

        System.out.println("SISESTA OMA NIMI: ");

        String nimi = teine.nextLine();

        tudeng.setNimi(nimi);
    }


    public Baar looBaar(String nimi, int raskusTase) {
        int elud=0;
        double kaitseProtsent=0.0;
        int rynda_dmg=0;

        switch (raskusTase) {

            case 1:
                elud = (int) (Math.random() * 8) + 10;
                kaitseProtsent = Math.random() * 0.2 + 0.1;
                rynda_dmg = (int) Math.random() * 2 + 2;
                break;

            case 2:
                elud = (int) Math.random() * 8 + 15;
                kaitseProtsent = Math.random() * 0.2 + 0.3;
                rynda_dmg = (int) Math.random() * 2 + 3;
                break;

            case 3:
                elud = (int) Math.random() * 9 + 18;
                kaitseProtsent = Math.random() * 0.2 + 0.4;
                rynda_dmg = (int) Math.random() * 2 + 4;
                break;

        }

        Baar bar = new Baar(nimi, elud, kaitseProtsent, rynda_dmg);
        return bar;
    }
}
