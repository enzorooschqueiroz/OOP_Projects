

/**
 *
 * @author enzor
 */

public class Retangulo {
    // Variaveis
    private double altura;
    private double base;
    
    // Setters
    public void setAltura(double a){
        altura = a;
    }
    
    public void setBase(double b){
        base = b;
    }
    
    //Getters 
    public double getAltura(){
        return (altura);
    }
    
    public double getBase(){
        return (base);
    }
    
    //Calculas
    public double calcArea(){
        return (altura * base);
    }
    
    public double calcPerimetro(){
        return (2 * (altura + base));
    }
    
    public double calcDiagonal(){
        return  Math.sqrt(Math.pow(altura , 2) + Math.pow(base , 2 ));
    }
}
