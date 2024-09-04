/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enzor
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Criação do ponteiro que vai apontar para o Objeto e Instanciação de um objeto da classe Retangulo
        Retangulo objRet1 = new Retangulo();
        Retangulo objRet = new Retangulo();
        
        //Passagens de mensagens
        objRet.setAltura(5.0);
        objRet.setBase(8.0);
        
        
        System.out.println("Medida da Base " + objRet.getBase());
        System.out.println("Medida da Altura " + objRet.getAltura());
        System.out.println("Medida da Area " + objRet.calcArea());
        System.out.println("Medida do Perimetro " + objRet.calcPerimetro());
        System.out.println("Medida do Perimetro " + objRet.calcDiagonal());
        
     
   
        
        objRet1.setAltura(3.0);
        objRet1.setBase(4.0);
        
        
        System.out.println("\nMedida da Base " + objRet1.getBase());
        System.out.println("Medida da Altura " + objRet1.getAltura());
        System.out.println("Medida da Area " + objRet1.calcArea());
        System.out.println("Medida do Perimetro " + objRet1.calcPerimetro());
        System.out.println("Medida do Perimetro " + objRet1.calcDiagonal());
        
    }
    
}
