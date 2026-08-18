package Atividade_Programacao_III.Atividade_Programacao_III_11;

public class Produto {
        private String nome;
        private double preco;

        public Produto(){
            this.nome = "nome";
            this.preco = 0.0; 
        }

        public Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }

        public String getNome () {
            return nome;
        }

        public void setNome (String nome) {
            this.nome = nome;
        }

        public double getPreco () {
            return preco;
        }

        public void setPreco (double preco) {
            this.preco = preco;
        }

        public void falar() {
            System.out.println("O produto " + nome + " tem o valor de " + preco + " reais.");
        }

        private void segredo () {
            System.out.println("Método Privado");
        }
}