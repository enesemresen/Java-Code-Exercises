import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ortalama,toplam = 0;
        String[] dersler = {"Turkce", "Matematik", "Kimya", "Fizik", "Müzik", "Tarih"};
        int[] notlar = new int[6];
        Scanner input = new Scanner(System.in);

        for(int i=0; i < dersler.length; i++) {
            System.out.print(dersler[i] + " Notunuzu giriniz: ");
            notlar[i] = input.nextInt();
            toplam += notlar[i];
        }
        ortalama = toplam / notlar.length;
        System.out.println("Not ortalamanız: " + ortalama);


        while (ortalama>=60) {
            System.out.println("Sınıfı Geçtiniz!");
            break;
        }

        while (ortalama<60) {
            System.out.println("Sınıfta Kaldınız!");
            break;
        }

    }
}