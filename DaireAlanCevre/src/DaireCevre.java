import java.text.DecimalFormat;

public class DaireCevre {
    public static double cevre(double yCap) {
        double dCevre = 2 * Math.PI * yCap;
        new DecimalFormat("##,##").format(dCevre);

        return dCevre;
    }
}
