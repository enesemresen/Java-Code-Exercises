import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0, kg;
        double salatalik = 3.14, elma = 4.11, kabak = 2.22, domates = 0.98, patlican = 7.00;
        String[] manav = {"Salatalık","Elma","Kabak","Domates","Patlıcan"};

        System.out.print("***Manava Hoşgeldiniz***\n Ürün kg Fiyatları\n");
        System.out.println("Salatalık: 3,14TL \nElma: 4,11TL \nKabak: 2,22TL \nDomates: 0,98TL \nPatlıcan: 7,00TL\n");

        for(int i = 0; i < manav.length; i++){
            System.out.println("Kaç kilo " + manav[i] + " istersiniz?");
            kg = sc.nextDouble();

            if (manav[i] == "Salatalık") {
                total += kg * salatalik;
            }
            else if (manav[i] == "Elma"){
                total += kg * elma;
            }
            else if (manav[i] == "Kabak"){
                total += kg * kabak;
            }
            else if (manav[i] == "Domates"){
                total += kg * domates;
            }
            else if (manav[i] == "Patlıcan"){
                total += kg * patlican;
            }
        }
        System.out.println("Toplam tutar: " + new DecimalFormat("##.##").format(total) + "TL");
    }
}