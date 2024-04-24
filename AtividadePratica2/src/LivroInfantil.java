public class LivroInfantil extends Livro {

    private int faixaEtaria;

    public LivroInfantil() {

    }

    public LivroInfantil(String titulo, String autor, int anoPublicacao, int faixaEtaria) {

        super(titulo, autor, anoPublicacao);
        this.faixaEtaria = faixaEtaria;

    }

    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    @Override
    public String toString() {

        String txt = super.toString() + "\nFaixa etária: " + faixaEtaria;
        return txt;

    }
}
