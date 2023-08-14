import java.util.Scanner;

public class BurcHesapla {
    static Scanner sc = new Scanner(System.in);
    public static int GetDay() {
        System.out.print("Doğum gününüzü giriniz: ");
        int day = sc.nextInt();

        return day;
    }
    public static int GetMonth() {
        System.out.print("Doğduğunuz ayı giriniz(rakamlarla giriniz): ");
        int month = sc.nextInt();

        return month;
    }

    public static void hesapla(int day, int month) {
        String burc = "";
        String errorMsg = "Hatalı giriş yaptınız.";
        if (month >= 1 && month <=12) {
            if (month == 1) {
                if (day <=21) {
                    burc = "Oğlak";
                }else {
                    burc = "Kova";
                }
            }

            else if (month == 2) {
                if (day <=19) {
                    burc = "Kova";
                }else {
                    burc = "Balık";
                }
            }

            else if (month == 3) {
                if (day <=20) {
                    burc = "Balık";
                }else {
                    burc = "Koç";
                }
            }

            else if (month == 4) {
                if (day <=20) {
                    burc = "Koç";
                }else {
                    burc = "Boğa";
                }
            }

            else if (month == 5) {
                if (day <=21) {
                    burc = "Boğa";
                }else {
                    burc = "İkizler";
                }
            }

            else if (month == 6) {
                if (day <=22) {
                    burc = "İkizler";
                }else {
                    burc = "Yengeç";
                }
            }

            else if (month == 7) {
                if (day <=22) {
                    burc = "Yengeç";
                }else {
                    burc = "Aslan";
                }
            }

            else if (month == 8) {
                if (day <=22) {
                    burc = "Aslan";
                }else {
                    burc = "Başak";
                }
            }

            else if (month == 9) {
                if (day <=22) {
                    burc = "Başak";
                }else {
                    burc = "Terazi";
                }
            }

            else if (month == 10) {
                if (day <=22) {
                    burc = "Terazi";
                }else {
                    burc = "Akrep";
                }
            }

            else if (month == 11) {
                if (day <=21) {
                    burc = "Akrep";
                }else {
                    burc = "Yay";
                }
            }

            else {
                if (day <=21) {
                    burc = "Yay";
                }else {
                    burc = "Oğlak";
                }
            }
            System.out.print("Burcunuz: " + burc);

        }
        else {
            System.out.print(errorMsg);
        }
    }
}
