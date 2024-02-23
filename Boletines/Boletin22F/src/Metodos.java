import javax.swing.*;
import java.util.Random;

public class Metodos {

    // Ejercicio 1

    public static int[][] crearTaboa(int[][] taboa) {
        for (int fila = 0; fila < taboa.length; fila++) {
            for (int columna = 0; columna < taboa[fila].length; columna++) {
                /*
                 * Opcion de pedir numeros uno a uno(izquierda -> derecha | arriba -> abajo):
                 * taboa[fila][columna]=
                 * Integer.parseInt(JOptionPane.showInputDialog("Inserte os valores:"));
                 */

                // Opcion de rellenar la tabla automaticamente con numeros generados
                // aleatoriamente
                taboa[fila][columna] = generarDatos();
            }
        }
        return taboa;
    }

    public static int generarDatos() {
        Random random = new Random();
        int numeroRandom = random.nextInt(6); // Genera un numero aleatorio entre 0 y 5 (ambos incluidos)
        return numeroRandom;
    }

    public static void amosarTaboa(int[][] taboa, String[] xornadas, String[] equipos) {
        System.out.print("Equipo/Xornada ");
        for (int columna = 0; columna < xornadas.length; columna++) {
            System.out.print("  " + xornadas[columna]);
        }
        for (int fila = 0; fila < taboa.length; fila++) {
            System.out.print("\n" + equipos[fila] + "  ");
            for (int columna = 0; columna < taboa[fila].length; columna++) {
                if (xornadas[columna].length() == 2) { // Condicion para alinear adecuadamente la tabla (3 espacios si
                    // X*, 4 si X**)
                    System.out.print(taboa[fila][columna] + "   ");
                } else {
                    System.out.print(taboa[fila][columna] + "    ");
                }

            }
        }
        System.out.println("");
    }

    // Ejercicio 2

    public static void ordenarEquiposSegunGolesT(int[] sumas, String[] equipos) {

        for (int i = 1; i < sumas.length; i++) {
            if (sumas[i - 1] > sumas[i]) {
                // Ordenar array sumas
                int temp = sumas[i - 1];
                sumas[i - 1] = sumas[i];
                sumas[i] = temp;
                // Ordenar array equipos simultaneamente
                String temp2 = equipos[i - 1];
                equipos[i - 1] = equipos[i];
                equipos[i] = temp2;
            }
        }
        System.out.print("Equipos ordenados por menor numero de goles: ");
        for (String equipo : equipos)
            System.out.print(equipo);
    }

    public static int[] sumarGoles(int[][] taboa, int[] sumas) {
        int suma = 0;
        for (int fila = 0; fila < taboa.length; fila++) {
            suma = 0;
            for (int columna = 0; columna < taboa[fila].length; columna++) {
                suma = suma + taboa[fila][columna];
            }
            sumas[fila] = suma;
        }
        return sumas;
    }

    // Ejercicio 3

    public static void masGolesPorJornada(int[][] taboa, String[] xornadas, String[] equipos) {

        for (int jornada = 0; jornada < xornadas.length; jornada++) {
            int maxGoles = 0;
            int numEquiposMaxGoles = 0;
            String[] equiposMaxGoles = new String[equipos.length];

            // Iterar sobre los equipos
            for (int equipo = 0; equipo < equipos.length; equipo++) {
                int goles = taboa[equipo][jornada];

                if (goles > maxGoles) {
                    maxGoles = goles;
                    numEquiposMaxGoles = 1;
                    equiposMaxGoles[0] = equipos[equipo];
                } else if (goles == maxGoles) {
                    // Agregar a la lista si hay un empate en el máximo de goles
                    equiposMaxGoles[numEquiposMaxGoles++] = equipos[equipo];
                }
            }
            System.out.println("\n\nJornada " + xornadas[jornada] + ":");
            System.out.println(" - Máximo de goles: " + maxGoles);
            System.out.print(" - Equipos con el maximo de goles: ");
            for (int i = 0; i < equiposMaxGoles.length; i++) {
                if (equiposMaxGoles[i] != null) {
                    System.out.print(equiposMaxGoles[i]);
                }
            }
        }
    }

    // Ejercicio 4

    public static void maisGoles(int[][] taboa, String[] equipos, String[] xornadas) {
        int maxGoles = 0;
        String equipoMaxGoles = "";
        String jornadaMaxGoles = "";

        for (int jornada = 0; jornada < xornadas.length; jornada++) {
            for (int equipo = 0; equipo < equipos.length; equipo++) {
                int goles = taboa[equipo][jornada];

                if (goles > maxGoles) {
                    maxGoles = goles;
                    equipoMaxGoles = equipos[equipo];
                    jornadaMaxGoles = xornadas[jornada];
                }
            }
        }
        System.out.println("- Equipo: " + equipoMaxGoles);
        System.out.println("- Jornada: " + jornadaMaxGoles);
        System.out.println("- Cantidad de goles: " + maxGoles);
    }

    // Ejercicio 5

    public static void consultas(int[][] taboa, String[] equipos, String[] xornadas) {
        String equipoBuscar = JOptionPane.showInputDialog("Inserte el equipo:");
        String xornadaBuscar = JOptionPane.showInputDialog("Inserte a xornada:");

        int filaConsulta = 0;
        int columnaConsulta = 0;

        for (int i = 0; i < xornadas.length; i++) {
            if (xornadas[i].equals("X" + xornadaBuscar)) {
                columnaConsulta = i;
            }
        }
        for (int j = 0; j < equipos.length; j++) {
            if (equipos[j].contains(equipoBuscar)) {
                filaConsulta = j;
            }
        }
        JOptionPane.showMessageDialog(null, "O numero de goles do equipo" + equipoBuscar + "na xornada" + xornadaBuscar
                + "é " + taboa[filaConsulta++][columnaConsulta++]);

    }
}
