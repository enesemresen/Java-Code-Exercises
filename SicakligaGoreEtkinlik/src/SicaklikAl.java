import java.util.Scanner;

public class SicaklikAl {
    public static double Sicaklik() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz: ");
        double sicaklik = sc.nextDouble();

        return sicaklik;
    }
}
