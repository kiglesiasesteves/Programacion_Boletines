public class ContaCorriente extends Conta{

    private final double interes=0.015;

    public ContaCorriente() {
    }

    public ContaCorriente(long numeroConta, Persoa cliente) {
        super(numeroConta, cliente);
    }

    public double getInteres() {
        return super.getSaldo()*interes;
    }

    @Override
    public String toString() {
        return super.toString()+ ", aumento anual do saldo= " + getInteres()+"€";
    }




}