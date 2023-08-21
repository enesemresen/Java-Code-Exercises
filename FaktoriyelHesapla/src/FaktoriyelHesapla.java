import java.util.Scanner;

public class FaktoriyelHesapla {
    public static void hesapla() {
        int sayi, sonuc=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        sayi = sc.nextInt();

        for(int i = sayi; i > 0; i--) {
            sonuc = sonuc * i;
        }
        System.out.print(sayi + " faktöriyel: " + sonuc);
    }
}
