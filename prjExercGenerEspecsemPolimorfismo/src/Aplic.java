
import java.text.DecimalFormat;

/**
 *
 * @author enzor
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,#0.0");
        Instrutor objInst = new Instrutor(133, "Marcos Raso", "11991537562");
        Cliente objCli = new Cliente("123.456.789-11", "Adriano Leão", "11994518216"");
        
        objInst.setAreaAtuacao("Atletismo");
        System.out.println(obj);
        
    }
    
}
