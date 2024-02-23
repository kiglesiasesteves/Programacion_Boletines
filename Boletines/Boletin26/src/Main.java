import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(5);
        listaEnteros.add(3);
        listaEnteros.add(9);
        listaEnteros.add(2);
        listaEnteros.add(7);
        listaEnteros.add(1);
        listaEnteros.add(8);

        System.out.println("Lista de enteros: " + listaEnteros);
        System.out.println("Mínimo: " + OperacionGenerico.minimo(listaEnteros));
        System.out.println("Máximo: " + OperacionGenerico.maximo(listaEnteros));

        int elementoBuscar = 4;
        int posicion = OperacionGenerico.buscar(listaEnteros, elementoBuscar);
        if (posicion != -1) {
            System.out.println("El elemento " + elementoBuscar + " se encuentra en la posición " + posicion);
        } else {
            System.out.println(-1);


        }
        System.out.println( "O elemento eliminado é " +OperacionGenerico.borrar(listaEnteros, 4));
    }
}

