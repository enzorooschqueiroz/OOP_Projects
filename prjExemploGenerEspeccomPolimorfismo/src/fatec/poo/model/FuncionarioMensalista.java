package fatec.poo.model;

/**
 *
 * @author enzor
 */
public class FuncionarioMensalista extends Funcionario {
    private double valSalMin;
    private double numSalMin;
    
    public FuncionarioMensalista (int r, String n, String dtAdm, double vsm){
        super(r, n, dtAdm);
        valSalMin= vsm;
    }

    public double getNumSalMin(){
        return(numSalMin);
    }
    
    public void setNumSalMin(int nsm){
        numSalMin = nsm;
    }
    
    public double calcSalBruto() {
       return (valSalMin * numSalMin); 
    }
    
    
    
}
