package modelo;
public class Numeros {
    
    private Double primeiroNumero;
    private Double segundoNumero;
    
    public Numeros() {}
    
    public Numeros (Double primeiroNumero, Double segundoNumero) {
        this.primeiroNumero = primeiroNumero;
        this.primeiroNumero = primeiroNumero;
    }
    public Double Somar(Double primeiroNumero, Double segundoNumero) {
        return primeiroNumero + segundoNumero;
    }
    public Double Subtrair(Double primeiroNumero,Double segundoNumero) {
        return primeiroNumero - segundoNumero;
    }
    public Double Multiplicar(Double primeiroNumero,Double segundoNumero) {
        return primeiroNumero * segundoNumero;
    }
    public Double Dividir(Double primeiroNumero,Double segundoNumero ){
        return  primeiroNumero / segundoNumero;
    }
    
    public Double getPrimeiroNumero() {
        return this.primeiroNumero;
    }
    public void setPrimeiroNumero(Double primeiroNumero) {
        this.primeiroNumero = primeiroNumero;
    }
    public Double getSegundoNumero() {
        return this.segundoNumero;
    }
    public void setSegundoNumero(Double segundoNumero) {
        this.segundoNumero = segundoNumero;
    }

    
    public String toString() {
        return "Numeros{" + "primeiroNumero = " + primeiroNumero + ", segundoNumero=" + segundoNumero + '}';
    }
    
    
}
