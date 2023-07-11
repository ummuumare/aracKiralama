package aracKiralama;

import java.util.Scanner;

public class ArapPrimHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean devam = true;
        do {
            AracTipleri.start();
            int donem = input.nextInt();

            switch (donem) {
                case 1:
                    AracTipleri.PrimHesaplama(1);
                    break;
                case 2:
                    AracTipleri.PrimHesaplama(2);
                    break;
                default:
                    System.out.println("Gecersiz bilgi girdiniz.Lutfen tekrar deneyiniz");
                    break;
            }
        } while (devam);

    }
}