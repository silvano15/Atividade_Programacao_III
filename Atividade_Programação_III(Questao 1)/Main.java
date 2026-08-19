public class Main {
    public static void main(String[] args) {

    Autor meuAutor = new Autor("Walcyr Carrasco");
    Usuario meuUsuario = new Usuario("Gerson", 123456789-11, 2);
    Livro meuLivro = new Livro("A Volta ao Mundo em 80 Dias", true, meuAutor);
    Emprestimo emp = new Emprestimo(meuLivro, meuUsuario);
    System.out.println("Você realizou um empréstimo: " + emp.getDadosUsuario().getNome() + ", " + emp.getLivroEmprestado().getTitulo());
}
}
