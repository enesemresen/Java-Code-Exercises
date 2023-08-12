import java.util.Arrays;
import java.util.Scanner;

public class SayilariAl {
    public static int[] GetSayi() {
        Scanner sc = new Scanner(System.in);
        int[] dizi = new int[3];

        for (int i = 0; i < 3; i++){
            System.out.print(i+1 + ". Sayıyı giriniz: ");
            dizi[i] = sc.nextInt();
        }
        System.out.println("Sayılar: " + Arrays.toString(dizi));

        return dizi;
    }
}
