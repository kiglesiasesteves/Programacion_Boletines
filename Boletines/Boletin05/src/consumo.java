
public class consumo {
    private float kilometros;
    private float litros;
    private float vMed;
    private float PGas;
    public consumo () {
    }


    public consumo(float km, float l, float v, float PG) {
        kilometros=km;
        litros=l;
        vMed=v;
        PGas=PG;
    }
    public float getTempo() {
        return vMed*kilometros;
    }
    public void consumoMedio() {
        System.out.println("consumo Medio="+(litros/(kilometros*100)));
    }
    public void consumoEuros() {
        System.out.println("consumo Euros=" +(litros*PGas/(kilometros*100)));

    }
    public void Tempo() {
        System.out.println ("Tiempo de viaje=" +(kilometros/vMed));
    }
    public void setKms(float km) {
        kilometros= km;

    }

    public void setLitros(float l) {
        litros= l;

    }
    public void setvMed(float v) {
        vMed= v;



    }
    public void setPGas(float PG) {
        PGas= PG;

    }
}