import java.util.Scanner;

public class exercise31 {
    public static void main(String[] args) {
        //Mostrar la longitud de una cadena.
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese cadena");
        String cadena = sc.nextLine();
        System.out.println("la longitud de la cadena es de: "+ cadena.length());
    }
}
