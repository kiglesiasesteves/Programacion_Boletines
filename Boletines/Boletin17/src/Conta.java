import javax.swing.*;

public class Conta {

    private long numeroConta;
    private double saldo;
    private Persoa cliente;

    public Conta() {
    }

    public Conta(long numeroConta, Persoa cliente) {
        this.numeroConta = numeroConta;
        this.cliente = cliente;
    }

    public long getConta() {
        return numeroConta;
    }

    public void setConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persoa getCliente() {
        return cliente;
    }

    public void setCliente(Persoa cliente) {
        this.cliente = cliente;
    }

    public void ingresar(double ingreso){
        saldo=ingreso+saldo;
    }

    public void retirar(double retiro){
        if(saldo>0){
            saldo=saldo-retiro;
        }else
            JOptionPane.showMessageDialog(null, "O saldo da conta é " +saldo+ ", non é posible retirar esa cantidade");
    }

    public void actualizarSaldo(double saldo){
        this.saldo=saldo;
    }

    public void elexirConta(){
        int tipocuenta=Integer.parseInt(JOptionPane.showInputDialog("Introduzca o número correspondente ao tipo de conta desexada tendo en conta que \nConta Corriente=1 \nConta Ahorro=2"));

        switch(tipocuenta){
            case 1:
                Persoa per= new Persoa(JOptionPane.showInputDialog("Nome do titular da conta"),JOptionPane.showInputDialog("Apelido do titular da conta"),JOptionPane.showInputDialog("NIF do titular da conta"));
                ContaCorriente con = new ContaCorriente(Long.parseLong(JOptionPane.showInputDialog("Numero da conta")),per);
                con.ingresar(Double.parseDouble(JOptionPane.showInputDialog("Cantidade que desexa ingresar")));
                con.retirar(Double.parseDouble(JOptionPane.showInputDialog("Cantidade que desexa retirar")));
                con.getInteres();
                System.out.println(con);
                break;

            case 2:
                Persoa per2= new Persoa(JOptionPane.showInputDialog("Nome do titular da conta"),JOptionPane.showInputDialog("Apelido do titular da conta"),JOptionPane.showInputDialog("NIF do titular da conta"));
                ContaAhorro aho=new ContaAhorro(0.5,1,Long.parseLong(JOptionPane.showInputDialog("Numero da conta")),per2);
                aho.ingresar(Double.parseDouble(JOptionPane.showInputDialog("Cantidade que desexa ingresar")));
                aho.retirar(Double.parseDouble(JOptionPane.showInputDialog("Cantidade que desexa retirar")));

                System.out.println(aho);
                break;
            default: System.out.println("Opción incorrecta");
        }
    }


    @Override
    public String toString() {
        return "Número de conta=" + numeroConta + ", saldo=" + saldo + cliente;
    }



}