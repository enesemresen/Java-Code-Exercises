import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        while (loop){
            System.out.print("Hipotenus hesabı => 1\n" + "Alan hesabı => 2\n");
            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
            int secim = sc.nextInt();

            if(secim == 1){
                Hipotenus.hipotenus();

            }
            else if (secim == 2) {
                Alan.alan();

            }
            else {
                System.out.println("Geçersiz karakter girdiniz. Tekrar deneyin.");
            }

            System.out.print("Başka işlem yapmak ister misiniz? Y/N \n");
            String yn = sc.next();
            if (yn.equals("Y") || yn.equals("y")){
                continue;
            }
            else if (yn.equals("N") || yn.equals("n")) {
                break;
            }
        }
        System.out.println("döngü bitti");
    }

}
