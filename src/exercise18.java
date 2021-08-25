import java.util.Scanner;

public class exercise18 {
    public static void main(String[] args) {
        //Pide por teclado dos número y genera 10 números aleatorios entre esos números.
        // Usa el método Math.random para generar un número entero aleatorio (recuerda el casting de double a int).
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el primer numero");
        int num1=sc.nextInt();

        System.out.println("Ingresa el segundo numero");
        int num2=sc.nextInt();

            //Para generar un número entre un número que deseemos a otro , debemos escribir *(num_minimo-num_maximo)+num_maximo, por ejemplo, Math.random()*(5-20)+20.
        for (int i = 0 ; i < 10 ; i++){
            int numAleatorio=(int)Math.floor(Math.random()*(num1-(num2+1))+(num2));
            System.out.println(numAleatorio);
        }

    }

}
