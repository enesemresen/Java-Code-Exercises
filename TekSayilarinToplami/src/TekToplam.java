import java.util.Scanner;

public class TekToplam {
    static Scanner sc = new Scanner(System.in);
    public static void toplamHesapla() {
        boolean loop = true;
        int toplam = 0;

        while (loop) {
            System.out.print("Sayi giriniz: ");
            int sayi = sc.nextInt();

            if (sayi < 0) {
                System.out.println("Toplam: " + toplam);
                loop = false;
            }
            else if (sayi % 2 == 1){
                toplam += sayi;
            }
            else continue;
        }

    }

    public static void ciftToplamHesapla() {
        int toplam = 0;
        boolean loop = true;

        while (loop) {
            System.out.print("Sayi giriniz: ");
            int sayi = sc.nextInt();

            if (sayi % 2 == 0 || sayi % 4 == 0){
                toplam += sayi;
            }
            else if (sayi < 0) {
                System.out.println("Toplam: " + toplam);
                loop = false;
            }

        }
    }
}
