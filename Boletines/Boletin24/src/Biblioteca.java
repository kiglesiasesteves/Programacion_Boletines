import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    // Declaración e inicialización de listas
    List <String>  titulos = new ArrayList<>();
    List<String> autores = new ArrayList<>();
    List<String> isbns = new ArrayList<>();
    List<Double> precios = new ArrayList<>();
    List<Integer> unidades = new ArrayList<>();

    String nuevoTitulo;
    String nuevoAutor;
    String nuevoISBN;

    double nuevoPrecio;
    int nuevasUnidades;

    public void imprimir(){
        System.out.println(titulos.size());
    }
    public  void engadir(String nuevoTitulo, String nuevoAutor, String nuevoISBN, double nuevoPrecio, int nuevasUnidades) {
        // Agregar el nuevo libro a las listas
        titulos.add(nuevoTitulo);
        autores.add(nuevoAutor);
        isbns.add(nuevoISBN);
        precios.add(nuevoPrecio);
        unidades.add(nuevasUnidades);

    }
public  void engadir_consola(){
        engadir( JOptionPane.showInputDialog("Escribe el título"),JOptionPane.showInputDialog("Escribe el autor"),JOptionPane.showInputDialog("Escribe el ISBN"),  Double.parseDouble(JOptionPane.showInputDialog("Escribe el precio")),Integer.parseInt(JOptionPane.showInputDialog("Escribe el número de unidades") ));
        int ultimoIndice = titulos.size() - 1;
    System.out.println("Libro añadido:");
    System.out.println("Título: " + titulos.get(ultimoIndice));
    System.out.println("Autor: " + autores.get(ultimoIndice));
    System.out.println("ISBN: " + isbns.get(ultimoIndice));
    System.out.println("Precio: " + precios.get(ultimoIndice));
    System.out.println("Número de unidades: " + unidades.get(ultimoIndice));
    System.out.println();

}
    public void vender() {
        String busqueda = JOptionPane.showInputDialog("Escribe o nome do libro que queres buscar");
        boolean encontrado = false;

        for (int i = 0; i < titulos.size(); i++) {
            if (busqueda.equals(titulos.get(i))) {
                int vendidos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos libros se vendieron?"));

                if (vendidos <= unidades.get(i)) {
                    unidades.set(i, unidades.get(i) - vendidos);
                    encontrado = true;

                    System.out.println("Título: " + titulos.get(i));
                    System.out.println("Autor: " + autores.get(i));
                    System.out.println("ISBN: " + isbns.get(i));
                    System.out.println("Precio: " + precios.get(i));
                    System.out.println("Número de unidades: " + unidades.get(i));
                    System.out.println();
                } else {
                    JOptionPane.showMessageDialog(null, "No hay suficientes libros para vender.");
                }
                break;  // Salir del bucle después de encontrar y procesar el libro
            }
        }

        if (!encontrado) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Título no encontrado. Quieres volver a buscar?\n1. Sí\n2. No"));
            if (opcion == 1) {
                vender();  // Llamada recursiva para volver a buscar
            } else {
                JOptionPane.showMessageDialog(null, "Operación de venta cancelada.");
            }
        }
    }


    public void amosar() {
        for (int i = 0; i < titulos.size(); i++) {
            System.out.println("Título: " + titulos.get(i));
            System.out.println("Autor: " + autores.get(i));
            System.out.println("ISBN: " + isbns.get(i));
            System.out.println("Precio: " + precios.get(i));
            System.out.println("Número de unidades: " + unidades.get(i));
            System.out.println();
        }
    }

    public void consulta() {
        String busqueda = JOptionPane.showInputDialog("Escribe o nome do libro que queres buscar");
        for (int i = 0; i < titulos.size(); i++) {

            if (busqueda.equals(titulos.get(i))) {
                System.out.println("Autor: " + autores.get(i));
                System.out.println("ISBN: " + isbns.get(i));
                System.out.println("Precio: " + precios.get(i));
                System.out.println("Número de unidades: " + unidades.get(i));
                System.out.println();

            }
        }


        }


    public void baixas() {

        for (int i = 0; i < unidades.size(); i++) {
            if (0 == unidades.get(i)) {
                titulos.remove(i);
                autores.remove(i);
                precios.remove(i);
                unidades.remove(i);
                isbns.remove(i);
            } else {

            }
        }
    }

            }