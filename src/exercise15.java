import java.util.Scanner;

public class exercise15 {
    public static void main(String[] args) {
        //Lee un número por teclado y comprueba que este numero es mayor o igual que cero,
        // si no lo es lo volverá a pedir (do while), después muestra ese número por consola.

        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.println("Ingresa numero");
            num = sc.nextInt();
        }while (num<=0);

        System.out.println(num);
    }
}
