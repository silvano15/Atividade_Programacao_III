import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoDemo {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Carla", 4000, "TI"));
        funcionarios.add(new Funcionario("Ana", 7000, "Financeiro"));
        funcionarios.add(new Funcionario("Bruno", 5500, "RH"));

        // 1) Ordenação NATURAL (usa o compareTo definido em Funcionario -> por nome)
        List<Funcionario> porNome = new ArrayList<>(funcionarios);
        Collections.sort(porNome);
        imprimir("Ordem natural (por nome)", porNome);

        // 2) Ordenação EXTERNA por salário crescente
        List<Funcionario> salarioCresc = new ArrayList<>(funcionarios);
        Collections.sort(salarioCresc, new ComparatorSalarioCrescente());
        imprimir("Salário crescente", salarioCresc);

        // 3) Ordenação EXTERNA por salário decrescente
        List<Funcionario> salarioDecresc = new ArrayList<>(funcionarios);
        Collections.sort(salarioDecresc, new ComparatorSalarioDecrescente());
        imprimir("Salário decrescente", salarioDecresc);

        // 4) Ordenação EXTERNA por setor
        List<Funcionario> porSetor = new ArrayList<>(funcionarios);
        Collections.sort(porSetor, new ComparatorPorSetor());
        imprimir("Por setor", porSetor);
    }

    private static void imprimir(String titulo, List<Funcionario> lista) {
        System.out.println("== " + titulo + " ==");
        for (Funcionario f : lista) {
            System.out.println(f);
        }
        System.out.println();
    }
}
