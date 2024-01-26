import java.util.Scanner;
public class Main {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Pedir el número del DNI al usuario
            System.out.print("Introduce el número del DNI: ");
            int numeroDNI = scanner.nextInt();

            // Calcular el resto de la división por 23
            int resto = numeroDNI % 23;

            // Asociar el resto a la letra correspondiente
            char letraNIF = obtenerLetraNIF(resto);

            // Mostrar el resultado
            System.out.println("La letra del NIF es: " + letraNIF);
        }

        private static char obtenerLetraNIF(int resto) {
            // Tabla de correspondencia entre el resto y la letra
            char[] letrasNIF = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

            // Comprobar si el resto está en el rango válido
            if (resto >= 0 && resto < letrasNIF.length) {
                return letrasNIF[resto];
            } else {
                System.out.println("Error: Resto fuera del rango válido.");
                return '\0'; // Carácter nulo para indicar un resultado no válido
            }
        }
    }


