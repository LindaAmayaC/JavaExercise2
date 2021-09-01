import java.util.Locale;
import java.util.Scanner;

public class exercise30 {
    public static void main(String[] args) {
        //Convertir una frase a mayúsculas o minúsculas, que daremos opción a que el usuario lo pida y mostraremos el resultado por pantalla.
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese frase");
        String frase = sc.nextLine();
        System.out.println("Escoja la conversión de la frase");
        System.out.println("1.Convertir a Mayúscula. \n2.Convertir a Minúscula.");
        int opcion = sc.nextInt();

        System.out.println(getConversionFrase(frase, opcion));
    }

    private static String getConversionFrase(String frase,int opcion) {
        String conversionFrase;

        if(opcion == 1){
            return conversionFrase = frase.toUpperCase(Locale.ROOT);
        }
        if (opcion == 2){
            return conversionFrase = frase.toLowerCase(Locale.ROOT);
        }
         return "opción no valida";
    }
}
