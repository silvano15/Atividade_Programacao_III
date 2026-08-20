package MD13;

public class MalucoDoido {

    public static void main(String[] args) {

        EntityManager<Pessoa> manager =
                new EntityManager<>(Pessoa.class);

        Pessoa pessoa = new Pessoa(
            1,
            "Manel",
            "manel@email.com"
        );

        manager.save(pessoa);

        manager.findById(1);

        manager.delete(1);
    }
}