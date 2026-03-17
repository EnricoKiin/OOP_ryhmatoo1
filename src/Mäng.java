import java.util.Scanner;

public class Mäng {
    private Tudeng tudeng;
    private Vastane vastane;

    public Mäng(Tudeng tudeng, Vastane vastane) {
        this.tudeng = tudeng;
        this.vastane = vastane;
    }


    public void mängi() {
        int vastaneTegevus = (int)(Math.random() * 2);

        if (vastaneTegevus == 0) {
            vastane.ryndab();
        }
        else {
            vastane.kaitseb();
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
                tudeng.rynda(vastane);
                break;
            case 2:
                tudeng.kaitse(vastane);
                break;
            case 3:
                tudeng.saaStippi(vastane);
                break;
        }
    }


}
