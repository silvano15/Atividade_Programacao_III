package MD13;

import java.lang.reflect.Field;

public class EntityManager<T> {

    private Class<T> classe;

    public EntityManager(Class<T> classe) {
        this.classe = classe;
    }

    public void save(T entidade) {

        Entidade anotacao =
                classe.getAnnotation(Entidade.class);

        if (anotacao == null) {
            throw new IllegalArgumentException(
                "A classe não possui @Entidade"
            );
        }

        String tabela = anotacao.tabela();

        StringBuilder colunas = new StringBuilder();
        StringBuilder valores = new StringBuilder();

        Field[] campos = classe.getDeclaredFields();

        for (Field campo : campos) {

            Campo anotacaoCampo =
                    campo.getAnnotation(Campo.class);

            if (anotacaoCampo == null) {
                continue;
            }

            try {

                campo.setAccessible(true);

                Object valor = campo.get(entidade);

                if (colunas.length() > 0) {
                    colunas.append(", ");
                    valores.append(", ");
                }

                colunas.append(anotacaoCampo.nome());

                if (valor instanceof String) {
                    valores.append("'")
                           .append(valor)
                           .append("'");
                } else {
                    valores.append(valor);
                }

            } catch (IllegalAccessException e) {

                throw new RuntimeException(
                    "Erro ao acessar o campo",
                    e
                );
            }
        }

        String sql =
                "INSERT INTO "
                + tabela
                + " ("
                + colunas
                + ") VALUES ("
                + valores
                + ");";

        System.out.println(sql);
    }

    public void findById(Object id) {

        Entidade anotacao =
                classe.getAnnotation(Entidade.class);

        String tabela = anotacao.tabela();

        String nomeId = null;

        for (Field campo : classe.getDeclaredFields()) {

            if (campo.isAnnotationPresent(Id.class)) {

                Campo anotacaoCampo =
                        campo.getAnnotation(Campo.class);

                if (anotacaoCampo != null) {
                    nomeId = anotacaoCampo.nome();
                }
            }
        }

        if (nomeId == null) {
            throw new IllegalArgumentException(
                "A entidade não possui @Id"
            );
        }

        String sql =
                "SELECT * FROM "
                + tabela
                + " WHERE "
                + nomeId
                + " = "
                + id
                + ";";

        System.out.println(sql);
    }

    public void delete(Object id) {

        Entidade anotacao =
                classe.getAnnotation(Entidade.class);

        String tabela = anotacao.tabela();

        String nomeId = null;

        for (Field campo : classe.getDeclaredFields()) {

            if (campo.isAnnotationPresent(Id.class)) {

                Campo anotacaoCampo =
                        campo.getAnnotation(Campo.class);

                if (anotacaoCampo != null) {
                    nomeId = anotacaoCampo.nome();
                }
            }
        }

        if (nomeId == null) {
            throw new IllegalArgumentException(
                "A entidade não possui @Id"
            );
        }

        String sql =
                "DELETE FROM "
                + tabela
                + " WHERE "
                + nomeId
                + " = "
                + id
                + ";";

        System.out.println(sql);
    }
}