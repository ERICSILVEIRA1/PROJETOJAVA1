public class LivroNaoFiccao extends Livro {

    private String tema;

    public LivroNaoFiccao() {

    }

    public LivroNaoFiccao(String titulo, String autor, int anoPublicacao, String tema) {

        super(titulo, autor, anoPublicacao);
        this.tema = tema;

    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public String toString() {

        String txt = super.toString() + "\nTema: " + tema;
        return txt;

    }
}
