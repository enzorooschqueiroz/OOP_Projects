import java.text.DecimalFormat;
/**
 *
 * @author enzor
 */


public class Equacao2Grau {
    private double coef_A;
    private double coef_B;
    private double coef_C;

    public Equacao2Grau(double coef_A, double coef_B, double coef_C) {
        this.coef_A = coef_A;
        this.coef_B = coef_B;
        this.coef_C = coef_C;
    }

    public double calcDelta() {
        return Math.pow(coef_B, 2) - 4 * coef_A * coef_C;
    }

    public double calcRaiz(int raiz) {
        double delta = calcDelta();
        if (delta < 0) {
            throw new IllegalArgumentException("Não tem raiz real");
        }
        if (raiz == 1) {
            return (-coef_B + Math.sqrt(delta)) / (2 * coef_A);
        } else {
            return (-coef_B - Math.sqrt(delta)) / (2 * coef_A);
        }
    }

    public String exibeEquacao() {
        return coef_A + "x² " + (coef_B >= 0 ? "+ " : "- ") + Math.abs(coef_B) + "x " + 
               (coef_C >= 0 ? "+ " : "- ") + Math.abs(coef_C);
    }
}

