import java.lang.*;
import java.util.Objects;

public class Circulo {
    private double x,y,raio;
    //construtores

    public Circulo() {
    }

    public Circulo(double x, double y, double raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    //setters e getters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    //metodos
    public double calculaArea(){
        return (Math.PI*this.raio*this.raio);
    }
    public double calculaPerimetro(){
        return (2*Math.PI*this.raio);
    }
    public void aumentaRaio(double radius){
        this.raio = this.raio+radius;
    }
    public void diminuiRaio(double radius){
        this.raio = this.raio-radius;
    }

    public boolean equalsRaio (double radius) {
        if (this.raio > radius){ return true;}
        else { return false;}
    }


}
