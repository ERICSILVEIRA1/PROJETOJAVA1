public class Sistema {

    private static void exibirMenu() {

        System.out.println("\nSISTEMA BIBLIOTECÁRIO PARTICULAR");
        System.out.println("1) Cadastrar Livro de ficção");
        System.out.println("2) Cadastrar Livro de não ficção");
        System.out.println("3) Cadastrar Livro infantil");
        System.out.println("4) Procurar Livro");
        System.out.println("5) Listar Livros");
        System.out.println("6) Excluir Livros");
        System.out.println("7) Excluir todos os Livros");
        System.out.println("0) Sair");
        System.out.print("Escolha um numero a cima: ");

    }

    private static void verificarOpcao(int op) {

        String buscaTitulo;
        String titulo;
        String autor;
        int anoPublicacao;
        String genero;
        String tema;
        int faixaEtaria;

        switch (op) {

            case 1:

                System.out.println("\nNOVO LIVRO DE FICÇÃO:");

                System.out.print("Titulo: ");
                titulo = Console.lerString();

                System.out.print("Autor: ");
                autor = Console.lerString();

                System.out.print("Ano: ");
                anoPublicacao = Console.lerInt();

                System.out.println("Genero:");
                genero = Console.lerString();

                LivroFiccao lf = new LivroFiccao(titulo, autor, anoPublicacao, genero);

                Cadastro.cadastrar(lf);

                System.out.println("\nLivro de ficção cadastrado!");

                break;

            case 2:

                System.out.println("\nNOVO LIVRO DE NÃO FICÇÃO:");

                System.out.print("Titulo: ");
                titulo = Console.lerString();

                System.out.print("Autor: ");
                autor = Console.lerString();

                System.out.print("Ano: ");
                anoPublicacao = Console.lerInt();

                System.out.println("Tema:");
                tema = Console.lerString();

                LivroNaoFiccao lnf = new LivroNaoFiccao(titulo, autor, anoPublicacao, tema);

                Cadastro.cadastrar(lnf);

                System.out.println("\nLivro de não ficção cadastrado!");

                break;

            case 3:

                System.out.println("\nNOVO LIVRO INFANTIL:");

                System.out.print("Titulo: ");
                titulo = Console.lerString();

                System.out.print("Autor: ");
                autor = Console.lerString();

                System.out.print("Ano: ");
                anoPublicacao = Console.lerInt();

                System.out.println("Faixa Etária:");
                faixaEtaria = Console.lerInt();

                LivroInfantil li = new LivroInfantil(titulo, autor, anoPublicacao, faixaEtaria);

                Cadastro.cadastrar(li);

                System.out.println("\nLivro infantil cadastrado!");

                break;

            case 4:

                System.out.println("\nProcurar Livro:");

                System.out.print("Título do livro: ");
                buscaTitulo = Console.lerString();

                Livro livro = Cadastro.buscar(buscaTitulo);

                if (livro != null) {

                    System.out.println("\nLivro Localizado:");
                    System.out.println(livro.toString());
                    return;

                }

                System.out.println("\nLivro " + buscaTitulo + " não foi encontrado");

                break;

            case 5:

                System.out.println("\nTodos os livros da biblioteca:");

                if (Cadastro.getListaLivro().size() == 0) {

                    System.out.println("\nSem livros cadastrados...");
                    return;

                }

                for (Livro temp : Cadastro.getListaLivro()) {

                    System.out.println(temp.toString());

                }

                break;

            case 6:

                System.out.println("\nExcluir Livro: ");

                System.out.print("\nTítulo do livro: ");
                buscaTitulo = Console.lerString();

                Cadastro.excluir(buscaTitulo);

                if (buscaTitulo != null) {

                    System.out.println("Livro " + buscaTitulo + "removido com sucesso!");
                    return;

                }

                System.out.println("\nLivro " + buscaTitulo + " não foi encontrado");

                break;

            case 7:
                System.out.println("\nExcluindo todos os livros cadastrados! ");
                Cadastro.excluirTudo();
                System.out.println("\nLivros Excluidos com sucesso! ");
                break;

            case 0:

                System.out.println("\nO programa foi finalizado...");
                break;

            default:

                System.out.println("\nOpção inválida, por favor digite novamente!");
                break;
        }

    }

    public static void executar() {

        int op;
        do {

            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);

        } while (op != 0);

    }

}
