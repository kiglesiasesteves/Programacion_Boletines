import java.util.Scanner;

public class LerDatos {
    private static Scanner scanner = new Scanner(System.in);

    public static int lerInt(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextInt();
    }

    public static float lerFloat(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextFloat();
    }

    public static double lerDoble(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextDouble();
    }

    public static boolean lerBooleano(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextBoolean();
    }

    public static String lerString(String mensaje) {
        System.out.println(mensaje);
        return scanner.next();
    }
}
