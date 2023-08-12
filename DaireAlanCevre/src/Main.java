import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Daire alan formülü: pi * r * r
        //Daire çevre formülü: 2 * pi * r

        Scanner sc = new Scanner(System.in);
        double yCap, a , alan, cevre;
        System.out.print("Dairenin yarıçapını giriniz: ");
        yCap = sc.nextDouble();
        System.out.print("Dairenin merkez açısının ölçüsünü giriniz (a): ");
        a = sc.nextDouble();

        //alan = Math.PI * yCap * yCap;
        //cevre = 2 * Math.PI * yCap;

        System.out.println("Dairenin alanı: " + DaireAlan.alan(yCap) + "cm^2\n" + "Dairenin cevresi: " + DaireCevre.cevre(yCap) + "cm");
        System.out.println("Daire diliminin alanı: " + DaireDilimAlan.dilimAlan(yCap,a) + "cm^2");
    }
}