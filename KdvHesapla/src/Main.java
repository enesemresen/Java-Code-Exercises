import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kdv = 20;
        System.out.print("Tutarı giriniz: ");
        double tutar = sc.nextDouble();

        double kdvTutar = (tutar/100) * kdv;
        double total = tutar + kdvTutar;

        if (tutar <= 500 && tutar > 0) {
            System.out.println("Kdv oranı: %" + kdv + "\n" + "Kdv tutarı: " + kdvTutar + "\n" + "Kdv'li tutar: " + total);
        }
        else {
            kdv = 10;
            kdvTutar = (tutar/100) * kdv;
            total = tutar + kdvTutar;
            System.out.println("Kdv oranı: %" + kdv + "\n" + "Kdv tutarı: " + kdvTutar + "\n" + "Kdv'li tutar: " + total);
        }


    }
}
