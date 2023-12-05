public class Publicacion {

    private int codigo;
    private String titulo;
    private int ano;

    public Publicacion() {
    }

    public Publicacion(int codigo, String titulo, int ano) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.ano = ano;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "biblioteca{" + "codigo=" + codigo + ", titulo=" + titulo + ", ano=" + ano + '}';
    }


}
