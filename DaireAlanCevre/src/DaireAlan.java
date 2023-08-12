import java.text.DecimalFormat;

public class DaireAlan {
    public static double alan(double yCap) {
        double dAlan = Math.PI * yCap * yCap;
        new DecimalFormat("##,####").format(dAlan);

        return dAlan;
    }
}
