import fatec.poo.model.Aluno;
import fatec.poo.model.Professor;
import java.text.DecimalFormat;
/**
 *
 * @author enzor
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Professor objPro = new Professor(505, "Gabriela Amoroso", "10/06/2004");
        Aluno objAlu = new Aluno(1010, "Enzo Queiroz", "15/03/1978");
        
        objPro.setSalario(1500);
        System.out.println("Registro : " + objPro.getRegFuncional());
        System.out.println("Nome do Aluno : " + objPro.getNome());
        System.out.println("Data de Nascimento : " + objPro.getDataNascimento());
        System.out.println("Valor da Mensalidade : " + df.format(objPro.getSalario()));
        
        
        objAlu.setMensalidade(900);
        
        System.out.println("Registro : " + objAlu.getRegEscolar());
        System.out.println("Nome do Aluno : " + objAlu.getNome());
        System.out.println("Data de Nascimento : " + objAlu.getDataNascimento());
        System.out.println("Valor da Mensalidade : " + df.format(objAlu.getMensalidade()));
    }
    
}
