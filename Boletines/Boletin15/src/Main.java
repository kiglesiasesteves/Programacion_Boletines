public class Main {
    public static void main(String[] args) {
        Futbol fut = new Futbolista(5, "lateral", 3, "ana", "maja", 34);
        Futbol entr = new Entrenador("aaa", 3, "pepe", "ramirez", 23);

        System.out.println(fut.toString());
        System.out.println(entr.toString());
    }

}