package partes;

public class Procesador {float velocidade;

    public Procesador() {
    }

    public Procesador(float velocidade) {
        this.velocidade = velocidade;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Procesador{" +
                "velocidade=" + velocidade +
                '}';
    }
}
