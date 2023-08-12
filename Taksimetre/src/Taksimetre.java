import java.util.Scanner;

public class Taksimetre {
    public static void hesapla() {
        double toplamMesafe, toplamTutar;
        Scanner sc = new Scanner(System.in);

        System.out.print("Toplam mesafeyi giriniz: ");
        toplamMesafe = sc.nextDouble();
        toplamTutar = 10 + (toplamMesafe * 2.20);

        if (toplamTutar < 20){
            toplamTutar = 20;
            System.out.println("Toplam tutar: " + toplamTutar + "TL");
        }
        else {
            System.out.println("Toplam tutar: " + toplamTutar + "TL");
        }
    }
}
