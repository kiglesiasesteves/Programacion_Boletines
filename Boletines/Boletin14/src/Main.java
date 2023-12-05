import partes.*;
public class Main {
    public static void main(String[] args) {
        Monitor obxM=new Monitor("RYzen",16f);
        Teclado obxT=new Teclado("Samsung");
        Procesador obxP=new Procesador(8f);
        Ordenador ord1=new Ordenador(obxM,obxT,obxP,1000);

        System.out.println(ord1);
    }
}