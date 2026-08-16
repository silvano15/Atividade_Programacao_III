public class Main {

    public static void main(String[] args) {
    Processavel p = new Pix(100.00);
    finalizarCompra(p);

    Processavel b = new Boleto(50.00);
    finalizarCompra(b);

    Processavel c = new Credito(75.00);
    finalizarCompra(c);
    }


    public static void finalizarCompra(Processavel formaDePagamento) {
        formaDePagamento.processar();
        System.out.println("Taxa cobrada: R$ " + formaDePagamento.calcularTaxa());
    }
}
