import java.util.Scanner;

public class exercise17 {
    public static void main(String[] args) {
        // Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no. Usa un switch para ello.
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese día a verificar");
        String dia = sc.nextLine();

        switch (dia){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println(dia + " Es día laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println(dia + " No es dia laboral");
                break;
            default:
                System.out.println("Ingrese un día valido");

        }
    }
}
