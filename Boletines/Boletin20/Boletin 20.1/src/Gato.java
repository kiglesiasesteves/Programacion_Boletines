public class Gato extends Mamifero implements IPodeNadar {

    @Override
    public void nadar() {
        IPodeNadar.super.nadar();
    }

    @Override
    public void caminhar() {
        super.caminhar();
    }
}
