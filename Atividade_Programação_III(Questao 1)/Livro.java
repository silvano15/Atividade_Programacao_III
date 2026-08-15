public class Livro {
    private String titulo;
    private boolean disponivel;
    private Autor autorLivro;

    public Livro () {

    }

    public Livro (String titulo, boolean disponivel, Autor autorLivro) {
        this.titulo = titulo;
        this.disponivel = disponivel;
        this.autorLivro = autorLivro;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }

    public Autor getAutorLivro() {
        return this.autorLivro;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void setAutorLivro(Autor autorLivro) {
        this.autorLivro = autorLivro;
    }
}