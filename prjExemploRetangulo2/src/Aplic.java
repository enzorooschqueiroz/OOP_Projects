import java.util.Scanner;
/**
 *
 * @author enzor
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Retangulo objRet = new Retangulo();
        
        System.out.println("Digite a medida da Altura :  ");
        objRet.setAltura(scanner.nextDouble());
        
        System.out.println("Digite a medida da Base :  ");
        objRet.setBase(scanner.nextDouble());
        
        
        
        System.out.println(String.format("A medida da altura é : {}", objRet.getAltura()));
        System.out.println(String.format("A medida da base é : {}", objRet.getBase()));
        System.out.println("Medida da Area " + objRet.calcArea());
        System.out.println("Medida do Perimetro " + objRet.calcPerimetro());
        System.out.println("Medida do Perimetro " + objRet.calcDiagonal());
        
        
        scanner.close();
    }
    
}
