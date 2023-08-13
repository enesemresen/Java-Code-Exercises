import java.util.Scanner;

public class ArtikYilHesapla {
    public static void hesapla() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Yılı giriniz: ");
        int yil = sc.nextInt();

        if((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0) ){
            System.out.print(yil + " artık yıldır");
        }
        else {
            System.out.print(yil + " artık yıl değildir.");
        }
    }
}
