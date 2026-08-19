import java.util.Comparator;

// Ordena por salário do maior para o menor. Repare que é só
// inverter a ordem dos argumentos em relação ao comparator anterior.
public class ComparatorSalarioDecrescente implements Comparator<Funcionario> {
    @Override
    public int compare(Funcionario f1, Funcionario f2) {
        return Double.compare(f2.getSalario(), f1.getSalario());
    }
}
