import sun.invoke.empty.Empty;

import java.util.Scanner;

public class exercise29 {
    public static void main(String[] args) {
        //Pedir al usuario que nos escriba frases de forma infinita hasta
        //que insertemos una cadena vacia. Mostrar la cadena resultante
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese Frase");
        String cadena = sc.nextLine();

        System.out.println("La frase ingresada fue: " + getCadena(cadena,sc));
    }
    public static String getCadena(String cadena,Scanner sc){
        String cadenas="";
        while(!cadena.equals("")){
            cadenas+=cadena;
            System.out.println("Ingrese frase");
            cadena = sc.nextLine();
        }
        return cadenas;
    }
}
