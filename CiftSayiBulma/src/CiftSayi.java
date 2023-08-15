import java.util.Scanner;

public class CiftSayi {
    static Scanner sc = new Scanner(System.in);
    public static void ciftBul() {
        System.out.print("Sayı giriniz: ");
        int sayi = sc.nextInt();


        for (int i = 1; i<=sayi; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void ortalamaHesapla() {
        System.out.print("Sayı giriniz: ");
        int sayi = sc.nextInt();
        int toplam = 0,sayac = 0, ortalama;

        for (int i = 0; i <= sayi; i++) {
            if (i % 4 == 0 && i % 5 == 0) {
                toplam += i;
                sayac += 1;
            }
        }
        ortalama = toplam / sayac;
        System.out.print("Ortalama: " + ortalama);
    }
}
