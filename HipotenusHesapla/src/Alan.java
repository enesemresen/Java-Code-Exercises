import java.util.Scanner;

public class Alan {
    public static void alan(){
        // Alan = 2u
        // u = (a+b+c)/2
        // alan*alan = u * (u-a) * (u-b) * (u-c)

        Scanner sc = new Scanner(System.in);

        float a,b,c,u,area;
        System.out.print("1. Kenarı giriniz: ");
        a = sc.nextFloat();
        System.out.print("2. Kenarı giriniz: ");
        b = sc.nextFloat();
        System.out.print("3. Kenarı giriniz: ");
        c = sc.nextFloat();

        u = (a+b+c)/2;
        area = u * (u-a) * (u-b) * (u-c);
        double alan = Math.sqrt(area);
        System.out.println("Üçgenin alanı: " + alan);
    }
}
