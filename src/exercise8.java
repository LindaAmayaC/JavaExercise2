import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        // Modifica el ejercicio anterior, para que en lugar de pedir un número, pida un carácter (char) y muestre su código en la tabla ASCII.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un caracter ASCII");
        char caracter = sc.next().charAt(0);

        int codigo = (int) caracter;

        System.out.println(codigo);
    }
}
