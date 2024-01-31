import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[6];

        // Ejercicio 1: Crear y visualizar el array
        System.out.println("Introduce los datos del array (6 elementos):");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Ejercicio 2: Visualizar el array utilizando la clase Ver
        Ver ver = new Ver();
        ver.visualizar(array);
    }
}
