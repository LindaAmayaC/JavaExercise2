import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {
        //Realiza una aplicación que nos pida un número de ventas a introducir
        //después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado
        //Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.


        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el numero de ventas a registrar");
        int ventas = sc.nextInt();

        int ttlVentas=0;

        for(int i = 1 ; i <= ventas; i++){
            System.out.println("Escriba el valor de la venta "+i);
            int valorVentas = sc.nextInt();
            ttlVentas += valorVentas;
        }
        System.out.println("El valor total de las ventas es de: "+ttlVentas);
    }
}
