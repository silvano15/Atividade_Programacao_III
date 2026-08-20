import java.util.Comparator;

// Ordena em ordem alfabética de setor.
public class ComparatorPorSetor implements Comparator<Funcionario> {
    @Override
    public int compare(Funcionario f1, Funcionario f2) {
        return f1.getSetor().compareTo(f2.getSetor());
    }
}
