package MD13;

@Entidade(tabela = "pessoas")
public class Pessoa {

    @Id
    @Campo(nome = "id")
    private int id;

    @Campo(nome = "nome")
    private String nome;

    @Campo(nome = "email")
    private String email;

    public Pessoa(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }
}