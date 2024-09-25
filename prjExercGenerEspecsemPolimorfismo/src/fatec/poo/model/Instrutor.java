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
public class Instrutor extends Pessoa {
    
    private int identificacao;
    private String areaAtuacao;
    
    public Instrutor (int i, String n, String t){
        super(n, t);
        identificacao = i;
    }
    
    public void setAreaAtuacao(String a){
        areaAtuacao = a;
    }
    
    public int getIdentifacacao(){
        return (identificacao);
    }
    
    public String getAreaAtuacao(){
        return (areaAtuacao);
    }
    
}
