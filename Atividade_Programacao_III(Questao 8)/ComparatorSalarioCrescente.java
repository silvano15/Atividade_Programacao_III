 import java.util.Comparator;

// Comparator = uma estratégia de ordenação EXTERNA à classe.
// Aqui, ordenamos por salário do menor para o maior.
public class ComparatorSalarioCrescente implements Comparator<Funcionario> {
    @Override
    public int compare(Funcionario f1, Funcionario f2) {
        return Double.compare(f1.getSalario(), f2.getSalario());
    }
}
