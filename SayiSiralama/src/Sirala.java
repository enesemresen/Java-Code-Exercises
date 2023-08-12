public class Sirala {
    public static void SayiSirala() {
        int[] dizi = SayilariAl.GetSayi();
        int gecici;

        for (int i = 0; i < 2; i++) {
            for (int j = i+1; j < 3; j++){
                if(dizi[j] < dizi[i]) {
                    gecici = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = gecici;
                }
            }
        }
        System.out.println("Dizinin Küçükten büyüğe sıralı hali: ");
        for(int i = 0; i < 3; i++)
        {
            System.out.println(dizi[i]);
        }
    }
}
