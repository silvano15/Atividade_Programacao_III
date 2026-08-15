/* 
     * Justificativa das regras de negócio:
     * O uso da classe Emprestimo para as regras de negócio é para usá-la como 
     * intermediária entre o Livro e o Usuário, trazendo e cruzando as informações 
     * em um só lugar, otimizando código, tempo e facilitando a implementação e o seu funcionamento.
     */

public class Emprestimo {
    private Livro livroEmprestado;
    private Usuario dadosUsuario;

    public Emprestimo () {

    }

    public Emprestimo (Livro livroEmprestado, Usuario dadosUsuario) {
        this.livroEmprestado = livroEmprestado;
        this.dadosUsuario = dadosUsuario;
    }

    public Livro getLivroEmprestado () {
        return this.livroEmprestado;
    }
    public Usuario getDadosUsuario () {
        return this.dadosUsuario;
    }

    public void setLivroEmprestado (Livro livroEmprestado) {
        this.livroEmprestado = livroEmprestado;
    }

    public void setDadosUsuario (Usuario dadosUsuario) {
        this.dadosUsuario = dadosUsuario;
    }

    public void realizarEmprestimo() {
        if (livroEmprestado.isDisponivel() == false) {
            System.out.println("Esse livro está indisponível");
            return;
        }

        if (dadosUsuario.getQuantidadeEmprestimos() >= 3) {
            System.out.println("Você ja possui 3 empréstimos");
            return;
        }

        livroEmprestado.setDisponivel(false);
        dadosUsuario.setQuantidadeEmprestimos(dadosUsuario.getQuantidadeEmprestimos() + 1);
        System.out.println("Livro Realizado com sucesso");
    }

    public void realizarDevolucao() {
        livroEmprestado.setDisponivel(true);
        dadosUsuario.setQuantidadeEmprestimos(dadosUsuario.getQuantidadeEmprestimos() - 1);
        System.out.println("Livro devolvido com Sucesso");
    }
}