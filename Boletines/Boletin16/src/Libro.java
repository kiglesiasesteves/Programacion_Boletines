public class Libro extends Publicacion {
    private String prestado;

    public Libro() {
    }


    public Libro(String prestado) {
        this.prestado = prestado;
    }

    public Libro(String prestado, int codigo, String titulo, int ano) {
        super(codigo, titulo, ano);
        this.prestado = prestado;
    }



    public String getPrestado() {
        return prestado;
    }

    public void setPrestado(String prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return super.toString()+"libro{" + "prestado=" + prestado + '}';
    }




}