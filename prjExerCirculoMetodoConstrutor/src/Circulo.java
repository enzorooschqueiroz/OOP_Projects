/**
 *
 * @author enzor
 */

public class Circulo{
    ///Atributes
    private double raio;
    private String unidadeMedida;
    ///Constructor
    
    public Circulo(String uniMed){
        unidadeMedida = uniMed;
    }
    ///Setters
    public void setRaio(double raio){
        this.raio = raio;
    }
    
    ///Getters
    public double getRaio(){
        return this.raio;
    }
    
    public String getUnidadeMedida(){
        return unidadeMedida;
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
