import java.util.Scanner;
/**
 *
 * @author enzor
 */
public class Aplic {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        Circle circle = new Circle();
        
        System.out.println("Digite o valor do Raio");
        circle.setRaio(scanner.nextDouble());

        do {
            System.out.println("Menu:");
            System.out.println("1 - Mostrar Area");
            System.out.println("2 - Mostrar Perimetro");
            System.out.println("3 - Mostrar Diâmetro");
            System.out.println("4 - Sair");
            System.out.print("Digite a opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println(String.format("O Valor da area de um circulo com raio : %.2f é %.2f", circle.getRaio(), circle.calculaArea()));
                    break;
                
                case 2:
                    System.out.println(String.format("O Valor do perímetro de um circulo com raio : %.2f é %.2f", circle.getRaio(), circle.calculaPerimetro()));
                    break;
                
                case 3:
                    System.out.println(String.format("O Valor do Diâmetro de um circulo com raio : %.2f é %.2f", circle.getRaio(), circle.calculaDiametro()));

                default:
                    break;
            }
        } while (opcao  != 4);

    
    }
}
