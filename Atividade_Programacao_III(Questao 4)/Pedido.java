public class Pedido {
    private double valorCompra;

    public Pedido(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double aplicarDesconto(EstrategiaDesconto estrategia) {
    double valorDoDesconto = estrategia.calcularDesconto(this.valorCompra);
    return this.valorCompra - valorDoDesconto;
    }
    
}
