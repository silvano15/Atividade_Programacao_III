public class Main {
    public static void main(String[] args) {

    Autor meuAutor = new Autor("Walcyr Carrasco");
    Usuario meuUsuario = new Usuario("Gerson");
    Livro meuLivro = new Livro("A Volta ao Mundo em 80 Dias", meuAutor);
    Emprestimo emp = new Emprestimo(meuUsuario, meuLivro);
    System.out.println("O livro " + emp.getLivro().getTitulo() + " foi emprestado para o usuário " + emp.getUsuario().getNome() + " e o autor do livro é " + emp.getLivro().getAutorLivro().getNome());
}
}