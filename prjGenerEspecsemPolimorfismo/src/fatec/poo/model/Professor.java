

package fatec.poo.model;

/**
 *
 * @author enzor
 */
public class Professor extends Pessoa{

    private int regFuncional;
    private double salario;
    
    public Professor(int r, String n, String dn){
        super(n, dn);
        regFuncional = r;
    }
    
    public void setSalario(double s){
        salario = s;
    }
    
    public int getRegFuncional(){
        return(regFuncional);
    }
    
    public double getSalario(){
        return(salario);
    }
}
