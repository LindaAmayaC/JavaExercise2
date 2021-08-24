import java.util.Scanner;
import javax.swing.*;

public class exercise4 {
    public static void main(String[] args) {
        //Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (recuerda usar JOptionPane).

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = sc.nextLine();

        System.out.println("Bienvenido " + nombre);
        //version JOptionPane
        /*  String nombre=JOptionPane.showInputDialog("Introduce tu nombre");

        System.out.println("Bienvenido "+nombre);
       */

    }
}