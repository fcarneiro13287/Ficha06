public class ConstroiCirculo {

    public static void main(String[] args) {
        Circulo circle1 = new Circulo(1.0,1.0,5.0);
        Circulo circle2 = new Circulo(5.0,5.0,3.0);

        System.out.println("Area: "+circle1.calculaArea());
        System.out.println("Perimetro: "+circle1.calculaPerimetro());
        System.out.println("Area: "+circle2.calculaArea());
        System.out.println("Perimetro: "+circle2.calculaPerimetro());

        circle1.aumentaRaio(2.0);
        circle2.diminuiRaio(1.5);

        System.out.println("Area: "+circle1.calculaArea());
        System.out.println("Perimetro: "+circle1.calculaPerimetro());
        System.out.println("Area: "+circle2.calculaArea());
        System.out.println("Perimetro: "+circle2.calculaPerimetro());

        System.out.println("Raio circulo 1 é maior que Raio circulo 2?"+circle1.equalsRaio(circle2.getRaio()));
    }

}
