package Atividade_Programacao_III.Atividade_Programacao_III_10;

public class Pessoa {
        private String nome;
        private int idade;

        public Pessoa(){
            this.nome = "nome";
            this.idade = 0; 
        }

        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome () {
            return nome;
        }

        public void setNome (String nome) {
            this.nome = nome;
        }

        public int getIdade () {
            return idade;
        }

        public void setIdade (int idade) {
            this.idade = idade;
        }

        public void falar() {
            System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
        }

        private void segredo () {
            System.out.println("Método Privado");
        }
}