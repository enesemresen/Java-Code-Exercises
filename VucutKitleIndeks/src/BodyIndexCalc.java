import java.util.Scanner;

public class BodyIndexCalc {
    // Kilo(kg)/Boy(m) * Boy(m)
    public static void bodyIndex(){
        Scanner sc = new Scanner(System.in);
        float boy, kg, bIndex;

        System.out.print("Boyunuzu giriniz(m): ");
        boy = sc.nextFloat();
        System.out.print("Kilonuzu giriniz(kg): ");
        kg = sc.nextFloat();

        bIndex = kg/(boy * boy);

        System.out.println("Vücut Kitle İndexsiniz: " + bIndex);

        if (bIndex <= 18.5){
            System.out.print("Zayıf");
        }
        else if (bIndex > 18.5 && bIndex <= 24.9 ) {
            System.out.print("İdeal");
        }
        else if (bIndex > 25 && bIndex <= 29.9 ) {
            System.out.print("Şişman");
        }
        else if (bIndex > 30 && bIndex <= 34.9 ) {
            System.out.print("Obez");
        }
        else if (bIndex > 35) {
            System.out.print("Aşırı Obez");
        }
    }
}
