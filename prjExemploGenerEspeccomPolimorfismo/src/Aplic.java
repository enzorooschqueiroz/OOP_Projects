import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.FuncionarioComissionado;
import java.text.DecimalFormat;


/**
 *
 * @author enzor
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");

        // Instanciando FuncionarioHorista
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, 
                                                          "Pedro Silveira",
                                                          "15/03/1978",
                                                           15.80);
        funcHor.setQtdeHorTrab(90);
        System.out.println("Funcionario Horista:");
        System.out.println("Salário Bruto: " + df.format(funcHor.calcSalBruto()));
        System.out.println("Gratificação: " + df.format(funcHor.calcGratificacao()));
        System.out.println("Desconto: " + df.format(funcHor.calcDesconto()));
        System.out.println("Salário Líquido: " + df.format(funcHor.calcSalLiquido()));
        System.out.println();

        // Instanciando FuncionarioMensalista
        FuncionarioMensalista funcMens = new FuncionarioMensalista(2020, 
                                                                "Maria Oliveira",
                                                                "10/05/1985", 
                                                                1320.00);  // Salário mínimo
        funcMens.setNumSalMin(3);  // Exemplo: Maria recebe 3 salários mínimos
        System.out.println("Funcionario Mensalista:");
        System.out.println("Salário Bruto: " + df.format(funcMens.calcSalBruto()));
        System.out.println("Desconto: " + df.format(funcMens.calcDesconto()));
        System.out.println("Salário Líquido: " + df.format(funcMens.calcSalLiquido()));
        System.out.println();

        // Instanciando FuncionarioComissionado
        FuncionarioComissionado funcCom = new FuncionarioComissionado(3030, 
                                                                    "Carlos Pereira", 
                                                                    "20/09/1990", 
                                                                    0.05); // Taxa de comissão: 5%
        funcCom.setSalBase(2000);  // Salário base
        funcCom.addVendas(12000);  // Total de vendas
        System.out.println("Funcionario Comissionado:");
        System.out.println("Salário Bruto: " + df.format(funcCom.calcSalBruto()));
        System.out.println("Gratificação: " + df.format(funcCom.calcGratificacao()));
        System.out.println("Desconto: " + df.format(funcCom.calcDesconto()));
        System.out.println("Salário Líquido: " + df.format(funcCom.calcSalLiquido()));
    }
}
