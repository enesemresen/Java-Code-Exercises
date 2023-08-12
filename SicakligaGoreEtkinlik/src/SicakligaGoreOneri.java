public class SicakligaGoreOneri {

    public static void Oneri() {
        double sicaklik = SicaklikAl.Sicaklik();

        if (sicaklik < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        }
        else if (sicaklik < 15) {
            System.out.println("Tiyatroya gidebilirsiniz.");
        }
        else if (sicaklik < 25) {
            System.out.println("Mangal yapabilirsiniz.");
        }
        else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
