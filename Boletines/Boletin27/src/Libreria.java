import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Libreria {


    public static ArrayList<Libro> engadirLibros(ArrayList<Libro> lista) {
        lista.add(new Libro(LerDatos.lerString("Insertar nome do libro:"),
                LerDatos.lerString("Insertar nome do autor:"),
                LerDatos.lerFloat("Insertar prezo do libro"),
                LerDatos.lerInt("Insertar unidades do libro")));
        return lista;
    }

    public static ArrayList<Libro> consultarLibros(ArrayList<Libro> lista) {
        String pedirtitulo = LerDatos.lerString("Inserte el titulo del libro del que desea saber el precio:");
        Libro libs = new Libro();
        for (int i = 0; i < lista.size(); i++) {
            if (pedirtitulo == libs.getNomeLibro()) {
                JOptionPane.showMessageDialog(null, libs.getPrecio());
            } else {
                JOptionPane.showMessageDialog(null, "O libro non se encontra la libreria");
            }
        }
        return lista;
    }

    public static void amosarLibros(ArrayList<Libro> lista) {
        for (int i = 0; i < lista.size(); i++)
            JOptionPane.showMessageDialog(null, "\n" + lista.get(i));
    }

    public static ArrayList<Libro> eliminarLibros0Stock(ArrayList<Libro> lista) {
        Libro libs = new Libro();
        for (int i = 0; i < lista.size(); i++) {
            if (libs.getUnidades() == 0)
                lista.remove(i);
        }
        return lista;
    }

    public static ArrayList<Libro> modificarPrezo(ArrayList<Libro> lista) {
        String pedirTitulo = LerDatos.lerString("Inserte el título del libro del que desea modificar el precio:");
        boolean encontrado = false;
        for (Libro libro : lista) {
            if (pedirTitulo.equals(libro.getNomeLibro())) {
                float novoPrecio = LerDatos.lerFloat("Inserte o novo prezo");
                libro.setPrecio(novoPrecio);
                JOptionPane.showMessageDialog(null, "Precio modificado correctamente");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("O título non se encontra no noso catálogo");
        }
        return lista;
    }
}
