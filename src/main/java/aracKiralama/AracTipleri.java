package aracKiralama;

import java.util.Scanner;

public class AracTipleri {
    public static Scanner scan = new Scanner(System.in);

    public static void start() {
        System.out.println("""
                Arac Sigortalama Sirketimize Hosgeldiniz
                1.donem(Haziran 2023;
                2.donem(Aralik 2023;
                Lutfen donem seciniz.""");
    }

    public static void PrimHesaplama(int donem) {
        System.out.println("""
                 Arac Tipleri:
                 1.otomobil
                 2.Kamyon
                 3.Otobus
                 4.Motosiklet
                Lutfen arac tipini seciniz""");

        int aractipi = scan.nextInt();
        int prim = 0;

        switch (aractipi) {
            case 1:
                prim = (donem == 1) ? 2000 : 2500;
                break;
            case 2:
                prim = (donem == 1) ? 3000 : 3500;
                break;
            case 3:
                System.out.println("""
                         Otobus Tipleri
                        1. 18-30 koltuk
                        2. 31 ve ustu koltuk""");
                int otobusTipi = scan.nextInt();

                if (otobusTipi == 1) {
                    prim = (donem == 1) ? 4000 : 4500;
                } else if (otobusTipi == 2) {
                    prim = (donem == 1) ? 5000 : 5500;
                } else {
                    System.out.println("Gecersiz bilgi girdiniz");
                }
                break;
            case 4:
                prim = 0;
                break;
            default:
                System.out.println("Gecersiz islem girdiniz.");
        }
        System.out.println("prim=" + prim);

    }
}
