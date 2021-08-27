import java.util.Scanner;

public class exercise28 {
    public static void main(String[] args) {
        //Eliminar los espacios de una frase pasada por consola por el usuario
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese Frase");
        String frase = sc.nextLine();

        System.out.println(frase.replace(" ",""));
    }
}
