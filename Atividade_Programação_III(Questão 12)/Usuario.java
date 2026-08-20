package MD12;

@Tabela(nome = "usuarios")
public class Usuario {

    @Coluna(nome = "id")
    private int id;

    @Coluna(nome = "nome")
    private String nome;

    @Coluna(nome = "email")
    private String email;

    private String senha;

    public Usuario(int id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
}