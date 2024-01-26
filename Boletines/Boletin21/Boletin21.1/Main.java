import java.util.Arrays;
public class Main {



        public static void main(String[] args) {
            int[] numeros = new int[6];

            // Llenar el array con números aleatorios entre 1 y 50
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = (int) (Math.random() * 50) + 1;
            }

            System.out.println("Array original: " + Arrays.toString(numeros));

            // Mostrar el array al revés
            System.out.println("Array al revés: ");
            for (int i = numeros.length - 1; i >= 0; i--) {
                System.out.print(numeros[i] + " ");
            }
        }
    }


