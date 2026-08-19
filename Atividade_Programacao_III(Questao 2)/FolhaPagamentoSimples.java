import java.util.ArrayList;
import java.util.List;

// Classe base abstrata: todo funcionário tem nome e salário,
// mas cada um calcula a remuneração do seu próprio jeito.
abstract class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Método abstrato: cada subclasse escreve a sua versão.
    public abstract double calcularRemuneracao();
}

// Gerente ganha o salário + um bônus fixo.
class Gerente extends Funcionario {
    double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    @Override
    public double calcularRemuneracao() {
        return salario + bonus;
    }
}

// Desenvolvedor ganha salário + horas extras.
class Desenvolvedor extends Funcionario {
    int horasExtras;
    double valorHora;

    public Desenvolvedor(String nome, double salario, int horasExtras, double valorHora) {
        super(nome, salario);
        this.horasExtras = horasExtras;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularRemuneracao() {
        return salario + (horasExtras * valorHora);
    }
}

// Estagiário só recebe a bolsa (salario), sem extras.
class Estagiario extends Funcionario {

    public Estagiario(String nome, double bolsa) {
        super(nome, bolsa);
    }

    @Override
    public double calcularRemuneracao() {
        return salario;
    }
}

public class FolhaPagamentoSimples {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Gerente("Ana", 5000, 1000));
        funcionarios.add(new Desenvolvedor("Bruno", 4000, 10, 50));
        funcionarios.add(new Estagiario("Carla", 1200));

        // Note: nenhum if/else verificando o tipo. O laço só chama
        // calcularRemuneracao() e cada objeto sabe responder sozinho.
        double total = 0;
        for (Funcionario f : funcionarios) {
            double valor = f.calcularRemuneracao();
            System.out.println(f.nome + ": R$ " + valor);
            total += valor;
        }
        System.out.println("Total da folha: R$ " + total);
    }
}
