import java.util.Scanner;

public class KuvvetHesapla {
    public static void hesapla() {
        int n, sinir;
        Scanner sc = new Scanner(System.in);
        System.out.print("N Değerini giriniz: ");
        n = sc.nextInt();
        System.out.print("Sınır Değerini Giriniz: ");
        sinir = sc.nextInt();

        for (int i = 0; i <= sinir; i++) {
            if (Math.pow(n,i) <= sinir){
                System.out.println(Math.pow(n,i));
            }
        }
    }
}
