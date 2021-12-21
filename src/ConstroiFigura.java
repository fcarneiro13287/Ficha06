import java.util.Scanner;

public class ConstroiFigura {

    public static void main(String[] args) {
        Retangulo rect = new Retangulo();
        Scanner sc= new Scanner(System.in);
        System.out.println("digite x1");
        double val = Double.parseDouble(sc.nextLine());
        rect.setX1(val);
        System.out.println("digite y1");
        double val1 = Double.parseDouble(sc.nextLine());
        rect.setY1(val1);
        System.out.println("digite x2");
        double val2= Double.parseDouble(sc.nextLine());
        rect.setX2(val2);
        System.out.println("digite y2");
        double val3 = Double.parseDouble(sc.nextLine());
        rect.setY2(val3);

        System.out.println("Altura: "+rect.calculaAltura());
        System.out.println("Base: "+rect.calculaBase());
        System.out.println("Perimetro: "+rect.calculaPerimetro());
        System.out.println("Area: "+rect.calculaArea());
    }

}
