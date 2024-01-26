
    import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            int[] notas = {7, 5, 3, 9, 8, 5, 6, 8, 9, 4, 6, 7, 8, 9, 4, 5, 7, 8, 7, 5, 8, 7, 6, 9, 5, 6, 8, 7, 5, 8};
            String[] nombres = {"Juan", "Ana", "Carlos", "María", "Pedro", "Laura", "Pablo", "Sofía", "Miguel", "Elena",
                    "Raúl", "Isabel", "David", "Carmen", "Alejandro", "Luisa", "Javier", "Natalia", "Francisco", "Lorena",
                    "Rubén", "Silvia", "José", "Paula", "Manuel", "Lucía", "Daniel", "Victoria", "Sergio", "Eva"};

            // Resto del código...

            // Visualizar la nota de un alumno determinado
            int indiceAlumno = 2; // Cambia el índice según el alumno que desees consultar
            System.out.println("Nota de " + nombres[indiceAlumno] + ": " + notas[indiceAlumno]);

            // Visualizar la lista de alumnos aprobados
            System.out.println("\nLista de alumnos aprobados:");
            for (int i = 0; i < notas.length; i++) {
                if (notas[i] >= 5) {
                    System.out.println(nombres[i] + ": " + notas[i]);
                }
            }

            // Lista ordenada por orden creciente de notas
            System.out.println("\nLista ordenada por orden creciente de notas:");
            ordenarPorNotas(notas, nombres);

            // Visualizar la nota de un alumno determinado solicitado por teclado
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nIntroduce el nombre del alumno para ver su nota: ");
            String nombreBuscado = scanner.nextLine();

            int indiceBuscado = buscarIndicePorNombre(nombreBuscado, nombres);
            if (indiceBuscado != -1) {
                System.out.println("Nota de " + nombreBuscado + ": " + notas[indiceBuscado]);
            } else {
                System.out.println("Alumno no encontrado.");
            }
        }

        // Función para ordenar por orden creciente de notas
        private static void ordenarPorNotas(int[] notas, String[] nombres) {
            int n = notas.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (notas[j] > notas[j + 1]) {
                        // Intercambiar las notas
                        int tempNota = notas[j];
                        notas[j] = notas[j + 1];
                        notas[j + 1] = tempNota;

                        // Intercambiar los nombres correspondientes
                        String tempNombre = nombres[j];
                        nombres[j] = nombres[j + 1];
                        nombres[j + 1] = tempNombre;
                    }
                }
            }

            // Mostrar la lista ordenada
            for (int i = 0; i < n; i++) {
                System.out.println(nombres[i] + ": " + notas[i]);
            }
        }

        // Función para buscar el índice de un alumno por nombre
        private static int buscarIndicePorNombre(String nombre, String[] nombres) {
            for (int i = 0; i < nombres.length; i++) {
                if (nombre.equalsIgnoreCase(nombres[i])) {
                    return i;
                }
            }
            return -1; // Si no se encuentra el nombre
        }
    }


