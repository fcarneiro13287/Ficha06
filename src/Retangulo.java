public class Retangulo implements Figura{
    private double x1,x2,y1,y2;

    //Construtores

    public Retangulo() {
    }

    public Retangulo(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    // Setters e Getters
    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    //metodos
    @Override
    public double calculaAltura() {
        return  (this.y2-this.y1);
    }
    @Override
    public double calculaBase() {
        return  (this.x2-this.x1);
    }
    @Override
    public double calculaArea() {
        return (this.calculaAltura()*this.calculaBase());
    }
    @Override
    public double calculaPerimetro() {
        return (2*this.calculaBase()+2*this.calculaAltura());
    }
}
