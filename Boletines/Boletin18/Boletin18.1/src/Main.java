public class Main {
    public static void main(String[] args) {
        Prezo prez = new Prezo();
        Chamada cham = new Chamada();
        do {
            prez.CantidadeMinutos();
        } while (cham.getMinuto() != 0);
    }
}