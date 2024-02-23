import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        System.out.println();
        System.out.println("Benvindo a nosa biblioteca");


        biblioteca.engadir("La Sombra del Viento", "Carlos Ruiz Zafón", "978-8408051097", 25.99, 50);
        biblioteca.engadir("Cien Años de Soledad", "Gabriel García Márquez", "978-0307474720", 22.50, 30);
        biblioteca.engadir("1984", "George Orwell", "978-0451524935", 19.95, 40);
        biblioteca.engadir("El Código Da Vinci", "Dan Brown", "978-0307474270", 18.75, 25);
        biblioteca.engadir("Harry Potter y la Piedra Filosofal", "J.K. Rowling", "978-8478884459", 27.60, 60);
        biblioteca.engadir("Crimen y Castigo", "Fyodor Dostoevsky", "978-0143058147", 15.00, 35);
        biblioteca.engadir("To Kill a Mockingbird", "Harper Lee", "978-0061120084", 21.35, 42);
        biblioteca.engadir("El Gran Gatsby", "F. Scott Fitzgerald", "978-0743273565", 24.80, 28);
        biblioteca.engadir("Orgullo y Prejuicio", "Jane Austen", "978-0141439518", 14.99, 48);

        int busqueda = Integer.parseInt(JOptionPane.showInputDialog("Qué es lo que quieres hacer? \n 1-Añadir un nuevo título \n 2-Declarar una venta \n 3- MOstrar todos los libros de nuestra biblioteca? \n 4-Consultar un título especifico \n 5- Para terminar el programa"));

        while (busqueda<= 5){


            switch (busqueda) {
                case 1:
                    biblioteca.engadir_consola();
         busqueda = Integer.parseInt(JOptionPane.showInputDialog("Qué es lo que quieres hacer? \n 1-Añadir un nuevo título \n 2-Declarar una venta \n 3- MOstrar todos los libros de nuestra biblioteca? \n 4-Consultar un título especifico \n 5- Para terminar el programa"));

                    break;
                case 2:
                    biblioteca.vender();
         busqueda = Integer.parseInt(JOptionPane.showInputDialog("Qué es lo que quieres hacer? \n 1-Añadir un nuevo título \n 2-Declarar una venta \n 3- MOstrar todos los libros de nuestra biblioteca? \n 4-Consultar un título especifico \n 5- Para terminar el programa"));

                    break;
                case 3:
                    biblioteca.amosar();
         busqueda = Integer.parseInt(JOptionPane.showInputDialog("Qué es lo que quieres hacer? \n 1-Añadir un nuevo título \n 2-Declarar una venta \n 3- MOstrar todos los libros de nuestra biblioteca? \n 4-Consultar un título especifico \n 5- Para terminar el programa"));

                    break;
                case 4:
                    biblioteca.consulta();
         busqueda = Integer.parseInt(JOptionPane.showInputDialog("Qué es lo que quieres hacer? \n 1-Añadir un nuevo título \n 2-Declarar una venta \n 3- MOstrar todos los libros de nuestra biblioteca? \n 4-Consultar un título especifico \n 5- Para terminar el programa"));

                    break;

                default:

                    break;
            }

            biblioteca.baixas();
        }
    }
}

