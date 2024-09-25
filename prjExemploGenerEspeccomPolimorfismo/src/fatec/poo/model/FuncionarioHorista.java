package fatec.poo.model;

/**
 *
 * @author Dimas
 */
public class FuncionarioHorista extends Funcionario{
    private double valHorTrab;
    private int qtdeHorTrab;
    
    public FuncionarioHorista(int r, String n, String dtAdm, double vht){
        super(r, n, dtAdm);//chamda do método construtor da superclasse
        valHorTrab = vht;
    }
    
    public double getValHorTrab(){
        return(valHorTrab);
    }
    public void setQtdeHorTrab(int qht){
        qtdeHorTrab = qht;
    }
    
    @Override
    public double calcSalLiquido(){
        return(super.calcSalLiquido() + calcGratificacao());
    }
    public double calcSalBruto(){
        return(valHorTrab * qtdeHorTrab);
    }
    
    public double calcGratificacao(){
        return (calcSalBruto() * 0.075);
    }
}
