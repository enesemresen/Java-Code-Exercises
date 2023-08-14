import java.util.Scanner;

public class CinZodyakHesapla {
    public static int getYear() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        int dogumyili = sc.nextInt();

        return dogumyili;
    }

    public static void hesapla(int dogumyili) {
        int zodyak = dogumyili % 12;
        String animal = "";

        if (zodyak == 0) {
            animal = "Maymun";
        }
        else if (zodyak == 1) {
            animal = "Horoz";
        }
        else if (zodyak == 2) {
            animal = "Köpek";
        }
        else if (zodyak == 3) {
            animal = "Domuz";
        }
        else if (zodyak == 4) {
            animal = "Fare";
        }
        else if (zodyak == 5) {
            animal = "Öküz";
        }
        else if (zodyak == 6) {
            animal = "Kaplan";
        }
        else if (zodyak == 7) {
            animal = "Tavşan";
        }
        else if (zodyak == 8) {
            animal = "Ejderha";
        }
        else if (zodyak == 9) {
            animal = "Yılan";
        }
        else if (zodyak == 10) {
            animal = "At";
        }
        else {
            animal = "Koyun";
        }

        System.out.print("Çin Zodyağı Burcunuz: " + animal);

//*********************************************************************************************************
/*
        switch(zodyak){
            case 0:
                animal = "Maymun";
                break;
            case 1:
                animal = "Horoz";
                break;
            case 2:
                animal = "Köpek";
                break;
            case 3:
                animal = "Domuz";
                break;
            case 4:
                animal = "Fare";
                break;
            case 5:
                animal = "Öküz";
                break;
            case 6:
                animal = "Kaplan";
                break;
            case 7:
                animal = "Tavşan";
                break;
            case 8:
                animal = "Ejderha";
                break;
            case 9:
                animal = "Yılan";
                break;
            case 10:
                animal = "At";
                break;
            case 11:
                animal = "Koyun";
                break;
        }
        System.out.print("Çin Zodyağı Burcunuz: " + animal);
*/
    }
}
