/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author enzor
 */
public class FuncionarioComissionado extends Funcionario {
    private double salBase;
    private double taxaComissao;
    private double totalVendas;
    
    public FuncionarioComissionado(int r, String n, String dtAdm, double tc){
        super(r, n, dtAdm);
        taxaComissao = tc;
    }
    
    public void setSalBase(double sb){
        salBase = sb;
    }
    
    public double getSalbase(){
        return (salBase);
    }
    
    public double getTotalVendas(){
        return (totalVendas);
    }
    
    public double getTaxaComissao(){
        return(taxaComissao);
    }
    
    public void addVendas(double v){
        totalVendas += v;
    }
    
    public double calcSalBruto(){
        return (salBase + taxaComissao * totalVendas);
    }
    
    @Override
    public double calcSalLiquido(){
        return(super.calcSalLiquido() + calcGratificacao());
    }
    
    public double calcGratificacao(){
        if (totalVendas > 5000 || totalVendas <= 10000){
            return(calcSalBruto() * 0.003);
        } else{
            if(totalVendas > 10000){
                return(calcSalBruto() * 0.005);
            }else{
                return(calcSalBruto() * 0);
            }
        }
    }
}
