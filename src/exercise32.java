import java.util.Scanner;

public class exercise32 {
    public static void main(String[] args) {
    // Pedir dos palabras por teclado, indicar si son iguales.
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese frase 1");
        String frase1 = sc.nextLine();

        System.out.println("Ingrese frase 2");
        String frase2 = sc.nextLine();
        System.out.println("Las frases: " + getSoniguales(frase1,frase2));
    }

    private static  String getSoniguales(String frase1, String frase2) {
        String respuesta;
        if(frase1.compareToIgnoreCase(frase2) == 0 ){
            return respuesta = "son iguales";
        }
        return respuesta = "No son iguales";
    }
}
