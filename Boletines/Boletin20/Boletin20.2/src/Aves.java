public class Aves implements IPodeVoar,IpodeCaminhar {

    @Override
    public void voar() {
        IPodeVoar.super.voar();
    }

    @Override
    public void caminhar() {
        IpodeCaminhar.super.caminhar();
    }
}
