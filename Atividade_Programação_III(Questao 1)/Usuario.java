public class Usuario {
    private String nome;
    private float cpf;
    private int quantidadeEmprestimos;

    public Usuario() {

    }

    public Usuario(String nome, float cpf, int quantidadeEmprestimos) {
        this.nome = nome;
        this.cpf = cpf;
        this.quantidadeEmprestimos = quantidadeEmprestimos;
    }

    public String getNome() {
        return this.nome;
    }

    public float getCpf() {
        return this.cpf;
    }

    public int getQuantidadeEmprestimos() {
        return this.quantidadeEmprestimos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setQuantidadeEmprestimos(int quantidadeEmprestimos) {
        this.quantidadeEmprestimos = quantidadeEmprestimos;
    }
}
