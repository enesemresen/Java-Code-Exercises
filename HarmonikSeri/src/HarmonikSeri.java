import java.util.Scanner;

public class HarmonikSeri {
    public static void hesapla() {
        double n, sonuc = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("N değerini giriniz: ");
        n = sc.nextInt();

        for (double i = 1; i <= n; i++){
            sonuc += (1.0 / i);
        }
        System.out.print(sonuc);

    }
}
