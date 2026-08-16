public abstract class Pagamento {
    private double valor;

    public Pagamento() {

    }

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }
}