   import java.util.ArrayList;
import java.util.List;

public class OperacionGenerico {

    public static int minimo(List<Integer> lista) {
        if (lista.isEmpty()) {
            return Integer.MIN_VALUE;
        }
        int min = lista.get(0);
        for (int num : lista) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int maximo(List<Integer> lista) {
        if (lista.isEmpty()) {
            return Integer.MAX_VALUE;
        }
        int max = lista.get(0);
        for (int num : lista) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int buscar(List<Integer> lista, int elemento) {
        return lista.indexOf(elemento);
    }

    public static Object borrar(List<Integer> lista, int elemento) {

        int borrado=buscar(lista, elemento);
            if (lista.contains(borrado)) {

        lista.remove(borrado);

        return elemento;
        }
        else{
            return null;
        }

    }
}