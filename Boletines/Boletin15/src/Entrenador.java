public class Entrenador extends Futbol {

    private String idFederacion;

    public Entrenador() {
    }

    public Entrenador(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public Entrenador(String idFederacion, int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return super.toString() + "Entrenador{" + "idFederacion=" + idFederacion + '}';
    }

    public void dirixirPartido() {

    }

    public void dirixirEntrenamento() {

    }
}