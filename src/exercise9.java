import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
    final double IVA = 0.19;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor del prodcuto");
        double valorProducto = sc.nextDouble();
        double totalIva = valorProducto * IVA;
        System.out.println("El valor total del producto con el IVA es de: " + (valorProducto+totalIva));
    }
}
