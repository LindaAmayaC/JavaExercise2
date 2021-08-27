import java.util.Scanner;

public class exercise26 {
    public static void main(String[] args) {
        //Realizar la suma del 1 al numero que indiquemos, este debe ser mayor que 1.
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese numero");
        int numero = sc.nextInt();

        System.out.println("La suma total de los numero es de: " + getSumaNumeros(numero));
    }
    public static int getSumaNumeros(int num){
        int suma = 0;
        for(int i = 1; i <= num ; i++){
            suma += i;
        }
        return suma;
    }
}
