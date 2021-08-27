import java.util.Scanner;

public class exercise27 {
    public static void main(String[] args) {
        //Crear una aplicación que nos permite insertar números hasta que insertemos un -1. Calcular el numero de números introducidos.
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese numero");
        int numero = sc.nextInt();

        System.out.println("La cantidad de numeros ingresados fue de: " + getCantidadNumeros(numero,sc));
    }

    public static int getCantidadNumeros(int num,Scanner sc){
        int cantidadNumeros= 0 ;
         while(num != -1){
            cantidadNumeros++;
            System.out.println("Ingrese numero");
            num = sc.nextInt();
        }
         return cantidadNumeros;
    }
}
