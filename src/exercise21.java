public class exercise21 {
    public static void main(String[] args) {
        // Muestra los números primos entre 1 y 100.

        for(int i = 1 ; i <= 100; i ++){
                if(cantidadDeResto(i) <= 2){
                System.out.println(i);
            }
        }
    }
    public static int cantidadDeResto(int i){
        int contadorDeResto = 0;
        for(int j = 1 ; j <= i ; j++){
            if(i % j == 0){
               contadorDeResto = contadorDeResto + 1;
            }
        }
        return contadorDeResto;
    }
}
