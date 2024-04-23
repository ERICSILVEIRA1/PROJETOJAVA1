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

    public static Livro buscar(int numeroChamada) {

        for (Livro temp : listaLivro) {

            if (temp.numeroChamada() == numeroChamada) {

                return temp;
            }

        }

        return null;

    }

}
