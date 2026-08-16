public class Credito extends Pagamento implements Processavel {
    
    public Credito() {

    }

    public Credito(double valor) {
        super(valor);
    }

     @Override
    public void processar() {
        System.out.println("Processando Cartão de Crédito no valor de R$ " + this.getValor());
    }

    @Override
    public double calcularTaxa() {
        return this.getValor() * 0.05;
    }

    @Override
    public boolean validar() {
        return this.getValor() > 0;
    }
}