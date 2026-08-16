public class Boleto extends Pagamento implements Processavel {

    public Boleto() {

    }

    public Boleto(double valor) {
        super(valor);
    }

     @Override
    public void processar() {
        System.out.println("Processando Boleto no valor de R$ " + this.getValor());
    }

    @Override
    public double calcularTaxa() {
        return 5.00;
    }

    @Override
    public boolean validar() {
        return this.getValor() > 0;
    }
}