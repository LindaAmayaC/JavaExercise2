import java.util.Scanner;

public class exercise20 {
    public static void main(String[] args) {

        //Pide un numero por teclado e indica si es un número primo o no. Un numero primo es aquel solo puede dividirse entre 1 y si mismo.
        // Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
        //Un buen truco para calcular la raíz cuadrada del numero e ir comprobando que si es divisible desde ese numero hasta 1.
        //NOTA: Si se introduce un numero menor o igual que 1, directamente es no primo.

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el numero");
        int x = sc.nextInt();

        if(esPrimo(x)==true){
            System.out.println("El numero SI es primo");
        }else{
            System.out.println("El numero NO es primo");
        }
    }
    public static boolean esPrimo(int x){
        for (int i = 2 ; i < x ; i++){
            if( x % i ==0) {
                return false;
            }
        }
        return true;
    }
}
