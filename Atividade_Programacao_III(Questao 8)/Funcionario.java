// Funcionario implementa Comparable<Funcionario>: isso define a
// ORDENAÇÃO NATURAL da classe, ou seja, "qual é o jeito padrão de
// comparar dois Funcionarios" quando ninguém especifica outro critério.
public class Funcionario implements Comparable<Funcionario> {
    private String nome;
    private double salario;
    private String setor;

    public Funcionario(String nome, double salario, String setor) {
        this.nome = nome;
        this.salario = salario;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getSetor() {
        return setor;
    }

    // Ordenação natural: por nome, em ordem alfabética.
    @Override
    public int compareTo(Funcionario outro) {
        return this.nome.compareTo(outro.nome);
    }

    @Override
    public String toString() {
        return nome + " | R$ " + salario + " | " + setor;
    }
}
