import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[12];


        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*30+1);
            // Ejercicio 4: Visualizar todos los elementos del array utilizando la clase Ver

        }
        Ver ver = new Ver();
        ver.visualizar(array);

        // Ejercicio 3: Contar el número de veces que aparece el 3 en el array
        Conta conta = new Conta();
        conta.contar(array);



        // Ejercicio 5: Ordenar el array de menor a mayor
        Ordenar ordena = new Ordenar();
        ordena.ordenar(array);
        System.out.println("Array ordenado de menor a mayor:");
        ver.visualizar(array);

        // Ejercicio 6: Consultar si está el número 5 en el array
        boolean encontrado = false;
        for (int elemento : array) {
            if (elemento == 5) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El número 5 está en el array.");
        } else {
            System.out.println("El número 5 no está en el array.");
        }
    }
}
