import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        //Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.

        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el numero a verificar");
        int numero = sc.nextInt();
        int resto = numero % 2;

        if(resto ==0){
            System.out.println(numero + " es divisible entre 2");
        }else{
            System.out.println(numero + " no es divisible entre 2");
        }
    }
}
