import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Carrinho {

    // A lista é PRIVADA. Ninguém de fora consegue pegar essa lista
    // e sair adicionando/removendo itens sem passar pelos métodos
    // do Carrinho. Isso é "controlar a manipulação da coleção interna".
    private final List<ItemCarrinho> itens = new ArrayList<>();

    public void adicionarItem(Produto produto, int quantidade) {
        itens.add(new ItemCarrinho(produto, quantidade));
    }

    public void removerItem(int indice) {
        if (indice < 0 || indice >= itens.size()) {
            throw new IndexOutOfBoundsException("Item inexistente");
        }
        itens.remove(indice);
    }

    // Nunca devolvemos a lista "itens" original. Devolvemos uma cópia
    // não-modificável, então quem chama esse método pode LER os itens,
    // mas não pode alterar o carrinho por fora dele.
    public List<ItemCarrinho> getItens() {
        return Collections.unmodifiableList(new ArrayList<>(itens));
    }

    public double calcularSubtotal() {
        double subtotal = 0;
        for (ItemCarrinho item : itens) {
            subtotal += item.calcularSubtotalDoItem();
        }
        return subtotal;
    }

    // Regra simples de desconto: 10% para compras acima de R$ 500.
    public double calcularDesconto() {
        double subtotal = calcularSubtotal();
        return subtotal > 500 ? subtotal * 0.10 : 0;
    }

    // Regra simples de frete: grátis acima de R$ 300, senão R$ 20 fixo.
    public double calcularFrete() {
        return calcularSubtotal() > 300 ? 0 : 20.0;
    }

    public double calcularTotal() {
        return calcularSubtotal() - calcularDesconto() + calcularFrete();
    }
}
