public class ContaAhorro extends Conta{

    private double interes;
    private double sminimo=1;

    public ContaAhorro() {
    }

    public ContaAhorro(double interes, double sminimo) {
        this.interes = interes;
        this.sminimo = sminimo;
    }

    public ContaAhorro(double interes, double sminimo, long numeroConta, Persoa cliente) {
        super(numeroConta, cliente);
        this.interes = interes;
        this.sminimo = sminimo;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getInteres() {
        return interes;
    }




    @Override
    public String toString() {
        return super.toString()+  " Interes anual= " + (interes*super.getSaldo());
    }

}