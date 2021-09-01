import java.util.Scanner;

public class exercise38 {
    public static void main(String[] args) {
        //Pedir números al usuario y cuando el usuario meta un -1 se terminará el programa.
        //Al terminar, mostrará lo siguiente:
        //– mayor numero introducido
        //– menor numero introducido
        //– suma de todos los numeros
        //– suma de los numeros positivos
        //– suma de los numeros negativos
        //– media de la suma (la primera que pido)
        //El número -1 no contara como número.


        int numeroUsuario=0;
        int menor=0;
        int mayor=0;
        int suma=0;
        double media;
        int contador=-1;
        int sumaPositivos=0;
        int sumaNegativos=0;

        Scanner sn = new Scanner(System.in);

        do{

            if(menor>numeroUsuario){
                menor = numeroUsuario;
            }

            if(mayor<numeroUsuario){
                mayor=numeroUsuario;
            }

            suma+=numeroUsuario;

            if(numeroUsuario>=0){
                sumaPositivos+=numeroUsuario;
            }else{
                sumaNegativos+=numeroUsuario;
            }

            contador++;

            System.out.println("Introduce un numero");
            numeroUsuario = sn.nextInt();

        }while(numeroUsuario!=-1);

        media = (double) suma / contador;

        System.out.println("El menor es: "+menor);
        System.out.println("El mayor es: "+mayor);
        System.out.println("La suma es: "+suma);
        System.out.println("La suma de los positivos es: "+sumaPositivos);
        System.out.println("La suma de los negativos es: "+sumaNegativos);
        System.out.println("La media es: "+media);

    }

}