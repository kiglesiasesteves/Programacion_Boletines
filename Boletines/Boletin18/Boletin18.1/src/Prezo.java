import java.io.PrintStream;
import java.util.Scanner;

public class Prezo extends Chamada{
    Scanner sc;

    private double prezo;

    public double getPrezo() {
        return prezo;
    }

    public void setPrezo(double prezo) {
        this.prezo = prezo;
    }

    public Prezo() {
        this.sc = new Scanner(System.in);
    }

    public void CantidadeMinutos() {
        System.out.println("Escriba a cantidade de minutos que falou. Para parar o programa pulse 0");
        this.setMinuto(this.sc.nextInt());
        if (this.getMinuto() > 0 && this.getMinuto() <= 5) {
            this.setPrezo(1.0);
            this.Horaprecio();
        } else if (this.getMinuto() > 5 && this.getMinuto() <= 8) {
            this.setPrezo(1.8);
            this.Horaprecio();
        } else if (this.getMinuto() > 8 && this.getMinuto() <= 10) {
            this.setPrezo(2.5);
            this.Horaprecio();
        } else if (this.getMinuto() > 1 && this.getMinuto() > 10) {
            this.setPrezo(3.0);
            this.Horaprecio();
        } else if (this.getMinuto() == 0) {
            this.sc.close();
        } else {
            System.out.println("numero erroneo");
            this.CantidadeMinutos();
        }

    }

    public void Horaprecio() {
        System.out.println("A que hora chamou? Escriba a hora sen minutos e de 1-24");
        this.setHora(this.sc.nextInt());
        if (this.getHora() <= 12 && this.getHora() > 0) {
            this.setPrezo(this.getPrezo() + this.getPrezo() * 0.15);
        } else if (this.getHora() < 24 && this.getHora() > 12) {
            this.setPrezo(this.getPrezo() + this.getPrezo() * 0.1);
        } else {
            System.out.println("numero erroneo");
            this.Horaprecio();
        }

        this.Semana();
    }

    public void Semana() {
        System.out.println("O dia que chamou era domingo? No caso afirmativo clique 1, no caso negativo pulse outro número");
        this.setDomingo(this.sc.nextInt());
        if (this.getDomingo() == 1) {
            this.setPrezo(this.getPrezo() + this.getPrezo() * 0.03);
        }

        this.setPrezo(Math.round(this.getPrezo() * 100.0) / 100.0);

        System.out.println("O prezo final é " + this.getPrezo());

        this.CantidadeMinutos();
    }
}
