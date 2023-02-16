package Domaci;

import java.util.Scanner;

public class DomaciDeset {
    public static void main(String[] args) {
//        2. Napraviti program gde cete uneti broj nekih knjiga na lageru,
//        zatim svaki put kada unesete '.' on ce skinuti po jednu knjigu sa lagera,
//tek nakon sto unesete neki drugi string ili ponestaje knjiga na lageru, izaci ce iz petlje i ispisati poruku,
// ukoliko je ponestajalo knjiga
//ispisati poruku da nema vise knjiga na lageru,
// ukoliko je unet neki drugi String, onda samo ispisati stanje knjiga na lageru.

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj knjiga na lageru ");
        int brojKnjiga = s.nextInt();
        System.out.println("Upis");
        String unos = s.next();
        while(unos.equals(".")){
            System.out.println("Upis");
            unos=s.next();
            brojKnjiga--;
            if (!unos.equals(".")){
                System.out.println("Broj knjiga na lageru je " + brojKnjiga);
                break;
            } if (brojKnjiga -1 ==0) {
                System.out.println("Nema vise knjiga na lageru");
                break;
            }

        }

    }
}
