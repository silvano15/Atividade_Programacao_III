public class DescontoCorporativo implements EstrategiaDesconto {

    @Override
    public double calcularDesconto(double valorCompra) {
        return valorCompra * 0.20;
    }
    
}
