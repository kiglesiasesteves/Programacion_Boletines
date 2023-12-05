public class satelite {

    private double meridiano;
    private double paralelo;
    private double distanciaTerra;


    public satelite() {
        double meridiano = 0;
        double paralelo = 0;
        double distanciaTerra = 0;

    }

    public satelite(double m, double p, double d) {

        meridiano = m;
        paralelo = p;
        distanciaTerra = d;
    }


    public void verPosicion() {

        System.out.println("o satelite encontrase  no meridiano:" + meridiano + ", paralelo:" + paralelo + ", a unha distancia da terra:" + distanciaTerra);
    }
}