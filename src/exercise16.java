import java.util.Scanner;

public class exercise16 {
    public static void main(String[] args) {
        //Escribe una aplicación con un String que contenga una contraseña cualquiera.
        // Después se te pedirá que introduzcas la contraseña, con 3 intentos.
        // Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo “Enhorabuena”
        // Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).

        Scanner sc = new Scanner(System.in);
        String clave = "piwis";
        int intentos = 3;

        boolean acierto=false;
        String password;

        for (int i=0;i<intentos && !acierto;i++){
            System.out.println("Introduce una contraseña");
            password = sc.next();

            if (password.equals(clave)){
                System.out.println("Enhorabuena, acertaste");
                acierto=true;
            }
        }
    }
}
