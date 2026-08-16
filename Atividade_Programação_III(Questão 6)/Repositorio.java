import java.util.ArrayList;
import java.util.List;

public class Repositorio<T>{
    private List<T> lista = new ArrayList<>();
    
    public void adicionar(T elemento) {
        lista.add(elemento);
    }

    public void remover(T elemento) {
        lista.remove(elemento);
    }

    public List<T> getLista() {
        return lista;
    }

    public static <E> void imprimirLista(Repositorio<E> cadastro) {
        cadastro.getLista().forEach(System.out::println);
    }

    public static <E> E obterPrimeiro(List<E> lista) {
        return lista.isEmpty() ? null : lista.get(0);
    }
}

/*
Se fosse baseada em Object seria permitido adicionar tipos misturados na mesma lista, mas não seria possível garantir a segurança de tipos. 
Com o uso de generics,
podemos criar um repositório que aceita apenas elementos de um tipo específico, 
garantindo que não haja erros de tipo em tempo de execução.
*/

