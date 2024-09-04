import java.util.Scanner;
/**
 *
 * @author enzor
 */
public class Aplic {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        String unidade;
        
        System.out.print("Digite a unidade de medida: ");
        unidade = scanner.next();

        Circulo circulo = new Circulo(unidade);
        
        System.out.println("Digite o valor do Raio");
        circulo.setRaio(scanner.nextDouble());

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
                    System.out.println("O Valor da area do circulo é : " + circulo.calculaArea() +  circulo.getUnidadeMedida());
                    break;
                
                case 2:
                    System.out.println ("O Valor do perímetro do circulo é : " + circulo.calculaPerimetro() + circulo.getUnidadeMedida());
                    break;
                
                case 3:
                    System.out.println("O Valor do Diâmetro do circulo é :" +  circulo.calculaDiametro() + circulo.getUnidadeMedida());

                default:
                    break;
            }
        } while (opcao  != 4);

    
    }
}
