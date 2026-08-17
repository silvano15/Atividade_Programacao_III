public class DescontoComum implements EstrategiaDesconto {

    @Override
    public double calcularDesconto(double valorCompra) {
        return valorCompra * 0.05;
    }
    
}
