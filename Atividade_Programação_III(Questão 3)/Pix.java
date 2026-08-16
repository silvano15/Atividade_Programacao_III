public class Pix extends Pagamento implements Processavel {

    public Pix() {

    }

    public Pix(double valor) {
        super(valor);
    }

    @Override
    public void processar() {
        System.out.println("Processando pix no valor de R$ " + this.getValor());
    }

    @Override
    public double calcularTaxa() {
        return this.getValor() * 0.2;
    }

    @Override
    public boolean validar() {
        return this.getValor() > 0;
    }

}