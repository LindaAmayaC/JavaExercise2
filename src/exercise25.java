import java.util.Scanner;

public class exercise25 {
    public static void main(String[] args) {
        //Crea una aplicación llamada CalculadoraPolacaInversaApp,
        // nos pedirá 2 operandos (int) y un signo aritmético (String),
        // según este último se realizara la operación correspondiente.
        // Al final mostrara el resultado en un cuadro de dialogo.

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero ");
        int num1 = sc.nextInt();

        System.out.println("Ingrese el segundo numero ");
        int num2 = sc.nextInt();

        System.out.println("Ingrese un signo de operacion (+ , - , * , / , ^ , % )");
        String operador = sc.next();

        switch (operador) {
            case "+":
                System.out.println("El resultado de la suma es: " + getSuma(num1, num2));
                break;
            case "-":
                System.out.println("El resultado de la Resta es: " + getResta(num1, num2));
                break;
            case "*":
                System.out.println("El resultado de la multiplicación es: " + getMultiplicacion(num1, num2));
                break;
            case "/":
                System.out.println("El resultado de la división es: " + getDivision(num1, num2));
                break;
            case "^":
                System.out.println("El resultado del exponencial es: " + getExponente(num1, num2));
                break;
            case "%":
                System.out.println("El resultado de la resto es: " + getResto(num1, num2));
                break;
            default:
                System.out.println("Ingrese los datos");
        }
    }
    public static int getSuma(int num1,int num2){
        return num1 + num2;
    }
    public static int getResta(int num1,int num2){
        return num1 - num2;
    }
    public static int getMultiplicacion(int num1,int num2){
        return num1 * num2;

    }public static Double getDivision(int num1,int num2){
        double division = num1 / num2;
        return division;

    }public static int getExponente(int num1,int num2){
        int exponente = (int)Math.pow(num1,num2);
        return exponente;

    }public static int getResto(int num1,int num2){
        return num1 % num2;
    }
}
