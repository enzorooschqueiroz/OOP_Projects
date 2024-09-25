import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author enzor
 */
public class Aplic {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite o coeficiente A: ");
        double coef_A = scanner.nextDouble();
        System.out.print("Digite o coeficiente B: ");
        double coef_B = scanner.nextDouble();
        System.out.print("Digite o coeficiente C: ");
        double coef_C = scanner.nextDouble();

        Equacao2Grau equacao = new Equacao2Grau(coef_A, coef_B, coef_C);

        System.out.println("Equação: " + equacao.exibeEquacao());

        double delta = equacao.calcDelta();

        if (delta > 0) {
            try {
                double raiz1 = equacao.calcRaiz(1);
                double raiz2 = equacao.calcRaiz(2);
                System.out.println("Raiz 1: " + df.format(raiz1));
                System.out.println("Raiz 2: " + df.format(raiz2));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } else if (delta == 0) {
            try {
                double raiz = equacao.calcRaiz(1);
                System.out.println("Raiz única: " + df.format(raiz));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Não tem raiz real");
        }

        scanner.close();
    }
    
}
