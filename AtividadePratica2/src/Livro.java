public class Livro {

    private int numeroChamada;
    private String titulo;

    public Livro() {
    }

    public Livro(int numeroChamada, String titulo) {
        this.numeroChamada = numeroChamada;
        this.titulo = titulo;
    }

    public int getNumeroChamada() {
        return numeroChamada;
    }

    public void setNumeroChamada(int numeroChamada) {
        this.numeroChamada = numeroChamada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {

        return "\nNumero da chamada: " + numeroChamada + "\nTitulo: " + titulo;
    }

    public int numeroChamada() {

        throw new UnsupportedOperationException("Unimplemented method 'numeroChamada'");
    }

}
