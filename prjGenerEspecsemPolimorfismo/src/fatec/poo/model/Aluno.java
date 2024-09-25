package fatec.poo.model;

import javafx.scene.shape.Arc;

/**
 *
 * @author Dimas
 */
public class Aluno extends Pessoa{
    private int regEscolar;
    private double mensalidade;
    
    public Aluno(int r, String n, String dn){
        super(n,dn); //chamada do método construtor da superclasse
        regEscolar = r;
    }
    public void setMensalidade(double m){
        mensalidade = m;
    }
    public int getRegEscolar(){
        return(regEscolar);
    }
    public double getMensalidade(){
        return(mensalidade);
    }
    
    
}
