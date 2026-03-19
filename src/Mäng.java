import java.util.Scanner;

public class Mäng {
    private Tudeng tudeng;
    private Vastane vastane;

    public Mäng(Tudeng tudeng, Vastane vastane) {
        this.tudeng = tudeng;
        this.vastane = vastane;
    }


    public void mängi() {
        int vastaneTegevus = (int)(Math.random() * 100);

        if (vastaneTegevus <= 44) {
            vastane.setTegevus(Tegevus.RYNDA);
        }
        else if (vastaneTegevus <= 89) {
            vastane.setTegevus(Tegevus.KAITSE);
        }
        else {
            vastane.setTegevus(Tegevus.BOOST);
        }

        Scanner sc = new Scanner(System.in);

        int TudengiOtsus;
        while (true) {
            System.out.println("Vali tegevus:");
            System.out.println("1 - ründa    2 - kaitse    3 - saa stippi");
            if (sc.hasNextInt()) {
                TudengiOtsus = sc.nextInt();
                if (TudengiOtsus == 1 || TudengiOtsus == 2 || TudengiOtsus == 3) {
                    break;
                }
                else {
                    System.out.println("Vale sisend!");
                }
            }
            else {
                System.out.println("Vale sisend!");
            }
        }

        switch (TudengiOtsus) {
            case 1:
                tudeng.setTegevus(Tegevus.RYNDA);
                break;
            case 2:
                tudeng.setTegevus(Tegevus.KAITSE);
                break;
            case 3:
                tudeng.setTegevus(Tegevus.RAVI);
                break;
        }
    }


    public void mehaanika() {

        Scanner teine = new Scanner(System.in);

        System.out.println("SISESTA OMA NIMI: ");

        String nimi = teine.nextLine();

        tudeng.setNimi(nimi);

    }

    /**
     * Korraldab Tudengi ja Vastase vahel lahingut
     * @return Tagastab Vastava klassi isendi, kes ära suri. Muidu null
     */
    public Tegelane lahing () {
        Tegevus tudengiOtsus = tudeng.getTegevus();
        Tegevus vastaseOtsus = vastane.getTegevus();

        // Tudengil on ründamises eelis
        if (tudengiOtsus == Tegevus.RYNDA) {
            int tudengATK = tudeng.getRynda_dmg();
            if (vastaseOtsus == Tegevus.KAITSE) {
                tudengATK = (int)(tudengATK * vastane.getKaitsePrtosent());
            }
            vastane.kaotaElud(tudengATK);
            if (!vastane.onElus()) {
                return vastane;
            }
        }
        // Tudeng saab alati elusid endale juurde anda enne kui vastas saab rünnata
        if (tudengiOtsus == Tegevus.RAVI) {
            tudeng.saaStippi();
        }

        // Vastase ründeskeem
        if (vastaseOtsus == Tegevus.RYNDA) {
            int vastaseATK = vastane.getRynda_dmg();
            if (tudengiOtsus == Tegevus.KAITSE) {
                vastaseATK = (int)(vastaseATK * tudeng.getKaitsePrtosent());
            }
            tudeng.kaotaElud(vastaseATK);
            if (!tudeng.onElus()) {
                return tudeng;
            }

        }
        // Vastane boostib enda ATK
        if (vastaseOtsus == Tegevus.BOOST) {
            vastane.ryndeBoost();
        }
        return null;


    }


}
