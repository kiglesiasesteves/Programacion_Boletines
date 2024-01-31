public class Conta {
    public void contar(int[] array) {
        int contador = 0;
        for (int elemento : array) {
            if (elemento == 3) {
                contador++;
            }
        }
        System.out.println("Número de veces que aparece el 3: " + contador);
    }
}
