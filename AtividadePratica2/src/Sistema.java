public class Sistema {

    private static void exibirMenu() {

        System.out.println("\nSISTEMA BIBLIOTECÁRIO PARTICULAR");
        System.out.println("1) Cadastrar Livros");
        System.out.println("2) Procurar Livro");
        System.out.println("3) Listar Livros");
        System.out.println("4) Excluir Livros");
        System.out.println("5) Excluir todos os Livros");
        System.out.println("0) Sair");
        System.out.print("Escolha um numero a cima: ");

    }

    private static void verificarOpcao(int op) {

        int numeroChamada;
        String titulo;
        String editora;
        String autor;
        String ano;

        switch (op) {
            case 1:

                System.out.println("\nNOVO LIVRO:");

                System.out.print("Numero da chamada do livro: ");
                numeroChamada = Console.lerInt();

                System.out.print("Titulo: ");
                titulo = Console.lerString();

                System.out.print("Editora: ");
                editora = Console.lerString();

                System.out.print("Autor: ");
                autor = Console.lerString();

                System.out.print("Ano: ");
                ano = Console.lerString();

                Livro l = new Livro(numeroChamada, titulo, editora, autor, ano);

                Cadastro.cadastrar(l);

                System.out.println("\nLivro cadastrado!");

                break;

            case 2:

                System.out.println("\nProcurar Livro:");

                System.out.print("Numero da chamada do livro: ");
                numeroChamada = Console.lerInt();

                Livro l = Cadastro.buscar(numeroChamada);

                if (l != null) {

                    System.out.println("\nLivro Localizado:");
                    System.out.println(l.toString());
                    return;

                }

                System.out.println("\nLivro " + numeroChamada + " não foi encontrado");

                break;

            case 3:

                System.out.println("\nTodos os livros da biblioteca:");

                if (Cadastro.getListaLivro().size() == 0) {

                    System.out.println("\nSem livros cadastrados...");
                    return;

                }

                for (Livro temp : Cadastro.getListaLivro()) {

                    System.out.println(temp.toString());

                }

                break;

            case 4:
                // excluir livro "UM"(TEM QUE FAZER!!!!!)
                break;

            case 5:
                // excluir livros "TODOS"(TEM QUE FAZER!!!!!)
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
