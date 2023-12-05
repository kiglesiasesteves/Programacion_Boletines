public class Revista extends Publicacion {
    private int numero;

    public Revista() {
    }

    public Revista(int numero) {
        this.numero = numero;
    }

    public Revista(int numero, int codigo, String titulo, int ano) {
        super(codigo, titulo, ano);
        this.numero = numero;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString()+"revista{" + "numero=" + numero + '}';
    }

}