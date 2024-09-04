/**
 *
 * @author enzor
 */

public class Circle{
    ///Atributes
    private double raio;

    ///Setters
    public void setRaio(double raio){
        this.raio = raio;
    }
    
    ///Getters
    public double getRaio(){
        return this.raio;
    }

    ///Calculos 
    public double calculaArea(){
        return Math.PI * Math.pow(raio, 2);
    }

    public double calculaPerimetro(){
        return 2 * Math.PI * raio;
    }

    public double calculaDiametro(){
        return 2 * raio;
    }
}
