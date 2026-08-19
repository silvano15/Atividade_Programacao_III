// ItemCarrinho também é IMUTÁVEL. Se o cliente quiser mudar a
// quantidade, ele não altera o objeto: ele pede um NOVO ItemCarrinho
// (veja o método comAquantidade abaixo). Isso evita que alguém, por
// engano, altere um item "por fora" sem o Carrinho saber.
public final class ItemCarrinho {
    private final Produto produto;
    private final int quantidade;

    public ItemCarrinho(Produto produto, int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero");
        }
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Em vez de um "setQuantidade", devolvemos um item novo com a
    // quantidade atualizada. O objeto original continua intacto.
    public ItemCarrinho comQuantidade(int novaQuantidade) {
        return new ItemCarrinho(this.produto, novaQuantidade);
    }

    public double calcularSubtotalDoItem() {
        return produto.getPreco() * quantidade;
    }

    @Override
    public String toString() {
        return quantidade + "x " + produto.getNome() + " = R$ " + calcularSubtotalDoItem();
    }
}
