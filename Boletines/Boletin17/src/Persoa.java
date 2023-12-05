public class Persoa {

    private String nome;
    private String apelidos;
    private String NIF;

    public Persoa() {
    }

    public Persoa(String nome, String apelidos, String NIF) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.NIF = NIF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    @Override
    public String toString() {
        return " Datos do titular da conta: " + "nome=" + nome + ", apelidos=" + apelidos + ", NIF=" + NIF;
    }




}