import java.util.Scanner;

/**
 *
 * @author enzor
 *////
public class Menu {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int option;
        
        Aluno aluno = new Aluno();  
        
        ///Interface
        
        System.out.println("Digite o RA do Aluno : ");
        aluno.setRA(scanner.nextInt());
        scanner.nextLine();  // Consumir a quebra de linha pendente

        System.out.println("Digite o Nome do Aluno : ");
        aluno.setNomeAluno(scanner.nextLine());
        
        System.out.println("Digite a Nota da Primeira Prova : ");
        aluno.setNotaProva1(scanner.nextDouble());
        
        System.out.println("Digite a Nota da Segunda Prova : ");
        aluno.setNotaProva2(scanner.nextDouble());
        
        System.out.println("Digite  a Nota do Primeiro Trabalho: ");
        aluno.setNotaTrabalho1(scanner.nextDouble());
        
        System.out.println("Digite a Nota da Segunda Prova");
        aluno.setNotaTrabalho2(scanner.nextDouble());
        
        do{
            System.out.println("1 - Exibir Nota das Provas/Trabalhos");
            System.out.println("2 - Exibir Média dos Trabalhos/Provas");
            System.out.println("3 - Exibir Média Final");
            System.out.println("4 - Sair");
            System.out.println("Escolha a Interação : ");
            option = scanner.nextInt();
            
            switch(option){
                case 1:
                    System.out.println("================================================================");
                    System.out.println(String.format("RA do Aluno %d", aluno.getRA()));
                    System.out.println(String.format("Nome do Aluno : %s", aluno.getNomeAluno()));
                    System.out.println(String.format("A nota da primeira prova foi : %.2f ", aluno.getNotaProva1()));
                    System.out.println(String.format("A nota da segunda prova foi : %.2f ", aluno.getNotaProva2()));
                    System.out.println(String.format("A nota do primeiro trabalho foi : %.2f ", aluno.getNotaTrabalho1()));
                    System.out.println(String.format("A nota do segundo trabalho foi : %.2f", aluno.getNotaTrabalho2()));
                    System.out.println("================================================================");
                    break;
            
                case 2:
                    System.out.println("================================================================");
                    System.out.println(String.format("RA do Aluno:  %d", aluno.getRA()));
                    System.out.println(String.format("Nome do Aluno : %s", aluno.getNomeAluno()));
                    System.out.println(String.format("A média das notas das provas foi : %.2f", aluno.calcMediaProva()));
                    System.out.println(String.format("A média das notas dos trabalhos foi : %.2f", aluno.calcMediaTrabalho()));
                    System.out.println("================================================================");
                    break;

                case 3:
                    System.out.println("================================================================");    
                    System.out.println(String.format("RA do Aluno %d", aluno.getRA()));
                    System.out.println(String.format("Nome do Aluno : %s", aluno.getNomeAluno()));
                    System.out.println(String.format("A Média total é : %.2f", aluno.calcMediaTotal()));
                    System.out.println("================================================================");
                    break;
                
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção Inválida... Tente novamente.");

            }
        }while (option != 4);
        
        scanner.close();
    }
}   

