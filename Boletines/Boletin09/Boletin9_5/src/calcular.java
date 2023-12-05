import javax.swing.*;

public class calcular {
    float sueldo;
    int j;
    int i;
    int k;


    public void calcularSoldo() {

        do {
            sueldo = Float.parseFloat(JOptionPane.showInputDialog("Introduce el sueldo del empleado" + (j + 1)));
            j++;


            if (1750 >= sueldo && sueldo >= 1000) {
                i++;

            } else if (sueldo < 1000) {
                k++;

            }


        } while (sueldo != 0);
        float porcentaje = (float) k / j * 100;
        System.out.println("Hay un total de " + i + " trabajadores que cobran entre 1000 y 1750€");
        System.out.println("El porcentaje de trabajadores que cobran menos de 1000€ es: " + porcentaje + "%.");


    }
}



