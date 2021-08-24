import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        //Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por
        // teclado (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio del circulo a calcular");
        Double radio = sc.nextDouble();
        Double areaCirculo = Math.PI * (Math.pow(radio,2));
        System.out.println("el area del circulo es: " + areaCirculo);

        //version con JOptionPane
        /*String texto=JOptionPane.showInputDialog("Introduce un radio");
        //Pasamos el String a double
        double radio=Double.parseDouble(texto);

        //Formula area circulo, usamos algunos de los metodos de Math
        double area=Math.PI*Math.pow(radio, 2);

        System.out.println("El area del circulo es "+area);*/
    }
}

