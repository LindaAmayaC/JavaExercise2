import java.util.Locale;
import java.util.Scanner;

public class exercise35 {
    public static void main(String[] args) {
    //Crea un enum con los días de la semana, pide un día de la semana e indica si es laboral o no (en el main).
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese dia de la semana");
        String dia = sc.nextLine();
        getDiaLaboralOno(dia);

    }
    private static void getDiaLaboralOno(String dia) {
        DaysOfWeek dias = DaysOfWeek.valueOf( dia.toUpperCase(Locale.ROOT));
        switch(dias){
            case LUNES:
            case MARTES:
            case MIERCOLES:
            case JUEVES:
            case VIERNES:
                System.out.println("El dia "+ dias.name() + " es laborable");
                break;
            case SABADO:
            case DOMINGO:
                System.out.println("El dia "+ dias +" no es laborable");
                break;
        }
    }
}
