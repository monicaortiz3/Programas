package ciclos;

public class NumerosPerfectos {

    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            int suma = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    suma = suma + j;
                }
            }
            if (suma == i) {
                System.out.println("El numero es perfecto " + i);
            }
        }
        // variable suma
        int suma = 0;
        //numero que vamos a trabajar
        int numeroFijo = 2258;
        // ver si el numero es mayor a 0
        while (numeroFijo > 0) {
            // el residuo de la division va a ser sumado con la variable suma
            suma = suma + (numeroFijo % 10);
            // El numero a trabajar se ira dividiendo cada vez para quitarle un digito que ya fue sumado
            numeroFijo = numeroFijo / 10;
        }
        // mostrar la suma que se hace
        System.out.println("La suma de de los digitos es: " + suma);

        int numeroInvertido = 0; // 0, 0, 0, 0
        int numero = 5041; // 5841, 584, 58, 5
        while (numero > 0) { // 5841 > 0, 584 > 0, 58 > 0, 5 > 0
            numeroInvertido = numeroInvertido * 10 + (numero % 10); // 0 = 1, 1 = 4 4 = 8 8 = 5
            numero = numero / 10; // 5841 = 584, 584 = 58, 58 = 5, 5 = 5
        }
          System.out.println(numeroInvertido);

    }

}
