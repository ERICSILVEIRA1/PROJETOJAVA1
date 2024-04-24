public class LivroFiccao extends Livro {

    private String genero;

    public LivroFiccao() {

    }

    public LivroFiccao(String titulo, String autor, int anoPublicacao, String genero) {

        super(titulo, autor, anoPublicacao);
        this.genero = genero;

    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {

        String txt = super.toString() + "\nGenero: " + genero;
        return txt;

    }
}
