package fatec.poo.model;

/**
 *
 * @author enzor
 */
public class Cliente extends Pessoa {
    private String cpf;
    private double peso;
    private double altura;
    
    public Cliente(String n, String t, String CPF){
        super(n, t);
        cpf = CPF;
    }
    
    public void setPeso(double p){
        peso = p;
    }
    
    public void setAltura(double a){
        altura = a;
    }
    
    public double getPeso(){
        return (peso);
    }
    
    public double getAltura(){
        return (altura);
    }
    
    public double calcIMC(){
        return  peso / (Math.pow(altura, 2));
    }
}
