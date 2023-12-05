import javax.swing.*;
import java.util.Random;

public class Adivinar {
    public void Adivinar() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(50) + 1;
        int intentosRealizados = 0;

        while (true) {
            int intento = Integer.parseInt(JOptionPane.showInputDialog("Intenta adivinar el número (entre 1 y 50):"));
            intentosRealizados++;

            int distancia = Math.abs(numeroAleatorio - intento);

            if (distancia > 20) {
                JOptionPane.showMessageDialog(null, "Moi lonxe");
            } else if (distancia >= 10 && distancia <= 20) {
                JOptionPane.showMessageDialog(null, "Lonxe");
            } else if (distancia > 5 && distancia < 10) {
                JOptionPane.showMessageDialog(null, "Preto");
            } else if (distancia <= 5) {
                JOptionPane.showMessageDialog(null, "Moi Preto");
            }

            if (intento == numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "¡Adivinaches o número! O número era " + numeroAleatorio + "\nIntentos realizados: " + intentosRealizados);
                break;
            }
        }
    }
}
