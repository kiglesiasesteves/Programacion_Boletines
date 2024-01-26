import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {

        public static void main(String[] args) {

            int[] notas = {7, 5, 3, 9, 8, 5, 6, 8, 9, 4, 6, 7, 8, 9, 4, 5, 7, 8, 7, 5, 8, 7, 6, 9, 5, 6, 8, 7, 5, 8};
                    String[] nombres = {"Juan", "Ana", "Carlos", "María", "Pedro", "Laura", "Pablo", "Sofía", "Miguel", "Elena",
                            "Raúl", "Isabel", "David", "Carmen", "Alejandro", "Luisa", "Javier", "Natalia", "Francisco", "Lorena",
                            "Rubén", "Silvia", "José", "Paula", "Manuel", "Lucía", "Daniel", "Victoria", "Sergio", "Eva"};



            // Visualizar aprobados y suspensos
            int aprobados = 0;
            int suspensos = 0;

            for (int nota : notas) {
                if (nota >= 5) {
                    aprobados++;
                } else {
                    suspensos++;
                }
            }

            System.out.println("Aprobados: " + aprobados);
            System.out.println("Suspensos: " + suspensos);

            // Calcular y visualizar la nota media
            int sumaNotas = 0;
            for (int nota : notas) {
                sumaNotas += nota;
            }

            double media = (double) sumaNotas / notas.length;
            DecimalFormat formato = new DecimalFormat("#.##"); // Define el formato a dos decimales
            String mediaFormateada = formato.format(media);
            System.out.println("Nota media de la clase: " + mediaFormateada);

            // Visualizar la nota más alta
            int notaMasAlta = Arrays.stream(notas).max().getAsInt();
            System.out.println("Nota más alta: " + notaMasAlta);
        }
    }


