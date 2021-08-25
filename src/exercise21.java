public class exercise21 {
    public static void main(String[] args) {
        // Muestra los números primos entre 1 y 100.

        for(int i = 1 ; i <= 100; i ++){
            int contadorDeResto = 0;
            for(int j = 1 ; j <= i ; j++){
                if(i % j == 0){
                    contadorDeResto = contadorDeResto + 1;
                }
            }
            if(contadorDeResto <= 2){
                System.out.println(i);
            }
        }

    }
}
