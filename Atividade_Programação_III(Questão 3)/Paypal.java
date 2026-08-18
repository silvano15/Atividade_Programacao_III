public class Paypal extends Pagamento implements Processavel {

    public Paypal() {

    }

    public Paypal(double valor) {
        super(valor);
    }

    @Override
    public void processar() {
        System.out.println("Processando paypal no valor de R$ " + this.getValor());
    }

    @Override
    public double calcularTaxa() {
        return this.getValor() * 0.3;
    }

    @Override
    public boolean validar() {
        return this.getValor() > 0;
    }
}
