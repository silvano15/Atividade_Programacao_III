public class CarrinhoDemo {
    public static void main(String[] args) {
        Produto teclado = new Produto("Teclado Mecânico", 250.0);
        Produto mouse = new Produto("Mouse Gamer", 120.0);
        Produto monitor = new Produto("Monitor 24\"", 800.0);

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem(teclado, 1);
        carrinho.adicionarItem(mouse, 2);
        carrinho.adicionarItem(monitor, 1);

        System.out.println("Itens do carrinho:");
        for (ItemCarrinho item : carrinho.getItens()) {
            System.out.println(" - " + item);
        }

        System.out.printf("Subtotal: R$ %.2f%n", carrinho.calcularSubtotal());
        System.out.printf("Desconto: R$ %.2f%n", carrinho.calcularDesconto());
        System.out.printf("Frete:    R$ %.2f%n", carrinho.calcularFrete());
        System.out.printf("Total:    R$ %.2f%n", carrinho.calcularTotal());
    }
}
