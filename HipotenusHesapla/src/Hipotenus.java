import java.util.Scanner;

public class Hipotenus {
    public static void hipotenus() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Kenarı giriniz: ");
        float kenar1 = sc.nextFloat();
        System.out.print("2. Kenarı giriniz: ");
        float kenar2 = sc.nextFloat();

        float hipotenus = (kenar1*kenar1) + (kenar2*kenar2);
        System.out.println("Hipotenüs: " + Math.sqrt(hipotenus));
    }
}
