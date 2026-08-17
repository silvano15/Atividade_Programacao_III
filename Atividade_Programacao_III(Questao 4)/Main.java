/*
//              Análise do princípio Open/Closed:
//  Foi criado o método abstrato na interface no qual todas as classes subsequentes
// vão reescrever aplicando a lógica contendo o desconto espcífico para aquele cargo.
//  Na classe Pedido foi criado uma função genérica que usa a variável valorDoDesconto
// para puxar o método da interface que as classes reutilizam, cauculando o valor do desconto
// de acordo com a classe que for chamada. Por isso se for preciso criar uma nova classe,
// não será necessário modificar nada do que já foi criado.
*/

public class Main {
    public static void main(String[] args) {

        Pedido p = new Pedido(1000.00);
        EstrategiaDesconto desconto = new DescontoPremium();
        System.out.println("O valor do seu desconto Premium foi de: " + p.aplicarDesconto(desconto));
 
        desconto = new DescontoComum();
        System.out.println("O valor do seu desconto Comum foi de: " + p.aplicarDesconto(desconto));
        
        desconto = new DescontoCorporativo();
        System.out.println("O valor do seu desconto Corporativo foi de: " + p.aplicarDesconto(desconto));
    }
    
}
