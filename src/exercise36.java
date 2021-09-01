import java.util.Scanner;

public class exercise36 {
    public static void main(String[] args) {
        // Modifica el anterior enum para indicar que es día laborable directamente (usar toString).

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un dia de la semana");
        String dia = sc.next();

        DiasSemana diaS = DiasSemana.valueOf(dia.toUpperCase());

        System.out.println(diaS.toString());
    }
}