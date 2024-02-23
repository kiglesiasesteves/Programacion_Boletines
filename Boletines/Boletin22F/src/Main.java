import javax.swing.*;

public class Main {

    static String[] xornadas = new String[36];

    static String[] equipos = { "R. Madrid      ",
            "Girona         ",
            "Barcelona      ",
            "Atlético       ",
            "Athletic       ",
            "Betis          ",
            "R. Sociedad    ",
            "Valencia       ",
            "Las Palmas     ",
            "Getafe         ",
            "Alavés         ",
            "Osasuna        ",
            "Villareal      ",
            "Rayo           ",
            "Sevilla        ",
            "Celta          ",
            "Mallorca       ",
            "Cádiz          ",
            "Granada        ",
            "Almería        " };

    static int[][] taboa = new int[20][36];
    static int[] sumas = new int[20];

    static String espaciado = "                  ";
    static String opcion1 = "\n 1.Gravar e imprimir a taboa.";
    static String opcion2 = "\n 2.Ordear equipos por menor Nº Goles.";
    static String opcion3 = "\n 3.Equipo con mais goles/xornada.";
    static String opcion4 = "\n 4.Equipo e xornada con mais goles.";
    static String opcion5 = "\n 5.Consulta goles por equipo & xornada.";
    static String opcion6 = "\n 6.Saír";

    public static void xenerarXornadas() {
        int j = 1;
        for (int i = 0; i < 36; i++) {
            xornadas[i] = "X" + j;
            j++;
        }
    }

    public static void main(String[] args) {

        xenerarXornadas();
        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane
                    .showInputDialog(
                            espaciado + "***Menú***" + opcion1 + opcion2 + opcion3 + opcion4 + opcion5 + opcion6));
            switch (opcion) {
                case 1:
                    System.out.println("\n[APP] | Creando tabla...");
                    Metodos.crearTaboa(taboa);
                    System.out.println("\n*** TABLA CREADA ***");
                    Metodos.amosarTaboa(taboa, xornadas, equipos);
                    break;
                case 2:
                    System.out.println("*** LISTA DE EQUIPOS ORDENADOS SEGUN EL NUMERO DE GOLES (MENOR A MAYOR) ***");
                    Metodos.ordenarEquiposSegunGolesT(Metodos.sumarGoles(taboa, sumas), equipos);
                    break;
                case 3:
                    System.out.println("*** LISTA DE EQUIPOS QUE MARCAN MAS GOLES EN CADA JORNADA ***");
                    Metodos.masGolesPorJornada(taboa, xornadas, equipos);
                    break;
                case 4:
                    System.out.println("*** EQUIPO Y JORNADA EN LA QUE SE HAN MARCADO MAS GOLES ***");
                    Metodos.maisGoles(taboa, equipos, xornadas);
                    break;
                case 5:
                    System.out.println("*** CONSULTA POR EQUIPO Y JORNADA ***");
                    Metodos.consultas(taboa, equipos, xornadas);
                    break;
                case 6:
                    System.exit(0);
            }
        } while (opcion < 7);
    }

}