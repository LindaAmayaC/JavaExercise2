import java.util.Scanner;

public class exercise19 {
    public static void main(String[] args) {
        //Pide por teclado un número entero positivo (debemos controlarlo) y muestra  el número de cifras que tiene.
        //Por ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras. Tendremos que controlar si tiene una o mas cifras, al mostrar el mensaje.

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el numero");
        int x = sc.nextInt();

        if( x / 10 == 0 && x >= 0){
            System.out.println("El número tiene 1 cifra.");
        }
        else if(x / 100 == 0 && x >= 0){
            System.out.println("El número tiene 2 cifras.");
        }
        else if(x / 1000 == 0 && x >= 0){
            System.out.println("El número tiene 3 cifras.");
        }
        else if(x / 10000 == 0 && x >= 0){
            System.out.println("El número tiene 4 cifras.");
        }
        else if(x / 100000 == 0 && x >= 0){
            System.out.println("El número tiene 5 cifras.");
        }
        else{
            System.out.println("Ingrese un numero positivo");
        }
    }
}
