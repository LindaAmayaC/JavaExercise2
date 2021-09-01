import java.util.Scanner;

public class exercise37 {
    public static void main(String[] args) {
        //Crea el enum Mes, que contenga como parametros el orden(1,2,3,etc) y el numero de dias (febrero tendra 28 dias siempre).
        //Estos datos pueden pedirse por separado, asi que tienes que hacer sus respectivos get. No son necesarios los setters.
        //Create un arrays de Mes (mirate la funcion values), pide un numero por teclado e indica que meses tienen ese numero de dias (toda su informacion).
        //Por ejemplo, si escribes un 28, este te devolvera la informacion de FEBRERO.

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un numero de dias");
        int dias = sc.nextInt();
        getValidacionMeses(dias);

    }
    private static void getValidacionMeses(int dias) {
        Mes[] meses = Mes.values();
        for(int i = 0 ; i < meses.length ; i++) {
            if (meses[i].getNumDias() == dias) {
                System.out.println(meses[i].toString());
            }
        }
    }
}
