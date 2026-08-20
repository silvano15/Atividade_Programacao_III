package MD12;

public class MalucoDoido {

    public static void main(String[] args) {

        Usuario usuario = new Usuario(
            1,
            "Manel",
            "manel@email.com",
            "123456"
        );

        String sql = GeradorSQL.gerarInsert(usuario);

        System.out.println(sql);
    }
}