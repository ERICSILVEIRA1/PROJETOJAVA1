import java.util.ArrayList;
import java.util.List;

public class Cadastro {

    private static List<Livro> listaLivro = new ArrayList<>();

    public static void cadastrar(Livro titulo) {
        listaLivro.add(titulo);
    }

    public static List<Livro> getListaLivro() {
        return listaLivro;
    }

    public static Livro buscar(String buscaTitulo) {

        for (Livro temp : listaLivro) {

            if (temp.getTitulo().equals(buscaTitulo)) {
                return temp;
            }

        }

        return null;
    }

    public static void excluir(String buscaTitulo) {

        for (Livro temp : listaLivro) {

            if (temp.getTitulo().equals(buscaTitulo)) {
                listaLivro.remove(temp);
                return;
            }

        }

    }

    public static void excluirTudo() {

        listaLivro.clear();

    }

}
