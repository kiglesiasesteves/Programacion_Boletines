public class Morcego extends Mamifero implements IPodeVoar {
    @Override
    public void caminhar() {
        super.caminhar();
    }

    @Override
    public void voar() {
        IPodeVoar.super.voar();
    }
}
