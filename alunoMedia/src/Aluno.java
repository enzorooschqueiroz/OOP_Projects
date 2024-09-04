/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enzor
 */
public class Aluno {
    private int RA;
    private String NomeAluno;
    private double NotaProva1;
    private double NotaProva2;
    private double NotaTrabalho1;
    private double NotaTrabalho2;
    
    ///Metodos de Set
    public void setRA(int RA){
        this.RA = RA;
    }
    
    public void setNotaProva1(double NotaProva1){
        this.NotaProva1 = NotaProva1;
    }
    
    public void setNotaProva2(double NotaProva2){
        this.NotaProva2 = NotaProva2;
    }
    
    public void setNotaTrabalho1(double NotaTrabalho1){
        this.NotaTrabalho1 = NotaTrabalho1;
    }
    
    public void setNotaTrabalho2(double NotaTrabalho2){
        this.NotaTrabalho2 = NotaTrabalho2;
    }
    
    public void setNomeAluno(String NomeAluno){
        this.NomeAluno = NomeAluno;
    }
    
    ///Métodos de Get
    public int getRA(){
        return RA;
    }
    
    public double getNotaProva1(){
        return NotaProva1;
    }
    
    public double getNotaProva2(){
        return NotaProva2;
    }
    
    public double getNotaTrabalho1(){
        return NotaTrabalho1;
    }
    
    public double getNotaTrabalho2(){
        return NotaTrabalho2;
    }
    
    public String getNomeAluno(){
        return NomeAluno;
    }
    
    ///Métodos de calculo de Nota    
    public double calcMediaTrabalho(){
        return 0.25*(NotaTrabalho1 + NotaTrabalho2)/2;
    }
    
    public double calcMediaProva(){
        return 0.75*(NotaProva1 + 2*NotaProva2)/3;
    }
    
    public double calcMediaTotal(){
        return calcMediaProva() + calcMediaTrabalho();
    }
        
    
}
