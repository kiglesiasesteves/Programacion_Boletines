import javax.swing.*;

public class Adivinar {
    int numeroAdivinar = Integer.parseInt(JOptionPane.showInputDialog("Primer jugador, elige un número entre 1 y 50:"));
    int intentosMaximos = Integer.parseInt(JOptionPane.showInputDialog("Primer jugador, establece el número máximo de intentos:"));
    int intentosRealizados = 0;

    public void Adivinar(){

        while (intentosRealizados < intentosMaximos) {
            int intento = Integer.parseInt(JOptionPane.showInputDialog("Segundo jugador, intenta adivinar el número:"));

            if (intento == numeroAdivinar) {
                JOptionPane.showMessageDialog(null, "¡Has adivinado el número! El número era " + numeroAdivinar);
                break;
            } else if (intento < numeroAdivinar) {
                JOptionPane.showMessageDialog(null, "El número a adivinar es mayor que " + intento);
            } else {
                JOptionPane.showMessageDialog(null, "El número a adivinar es menor que " + intento);
            }

            intentosRealizados++;
        }

        if (intentosRealizados >= intentosMaximos) {
            JOptionPane.showMessageDialog(null, "Se acabaron los intentos. El número a adivinar era " + numeroAdivinar);
        }
    }



}


