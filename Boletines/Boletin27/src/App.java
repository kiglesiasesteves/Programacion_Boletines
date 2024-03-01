import java.util.ArrayList;

public class App {

    public static void main(String[] args) {


            int opcion;

            ArrayList<Libro> ficheiro = new ArrayList<>();
            do {

                opcion = LerDatos.lerInt("1.Engadir libro.\n 2.Consultar titulo polo prezo.\n 3.Visualizar.\n 4.Borrar libros sen stock. \n 5.Modificar precio\n 6.Salir");

                switch (opcion) {
                    case 1:
                        Libreria.engadirLibros(ficheiro);
                        break;
                    case 2:
                        Libreria.consultarLibros(ficheiro);
                        break;
                    case 3:
                        Libreria.amosarLibros(ficheiro);
                        break;
                    case 4:
                        Libreria.eliminarLibros0Stock(ficheiro);
                        break;
                    case 5:
                        Libreria.modificarPrezo(ficheiro);
                        break;
                    case 6:
                        System.exit(0);
                }
            } while (opcion < 10);
        }
    }


