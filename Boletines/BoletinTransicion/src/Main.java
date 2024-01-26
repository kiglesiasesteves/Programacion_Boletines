import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConversorTemperaturas conversor = new ConversorTemperaturas();
        Scanner scanner = new Scanner(System.in);
        boolean temp = false;

        while (!temp) {
            try {
                System.out.print("Introduce la temperatura en grados centígrados: ");
                float temperatura = scanner.nextFloat();

                float fahrenheit = conversor.centigradosAFharenheit(temperatura); // Corregido el nombre del método
                System.out.println("Temperatura en Fahrenheit: " + fahrenheit);

                float reamur = conversor.centigradosAReamur(temperatura);
                System.out.println("Temperatura en Reamur: " + reamur);
                temp = true;
            } catch (Excepcion e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());

            }
        }
    }
}