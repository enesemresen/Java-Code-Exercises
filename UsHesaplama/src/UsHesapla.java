import java.util.Scanner;

public class UsHesapla {
    public static void hesapla() {
        int sayi, us, sonuc = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        sayi = sc.nextInt();
        System.out.print("Üs değerini giriniz: ");
        us = sc.nextInt();
        /*
        for (int i = 1; i <= us; i++) {
            sonuc = sonuc * sayi;
        }
        System.out.print("Cevap: " + sonuc);
        */
        int j = 1;
        while (j <= us) {
            sonuc = sonuc * sayi;
            j++;
        }
        System.out.print("Cevap: " + sonuc);

    }
}
