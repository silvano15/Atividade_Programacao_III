package MD12;

import java.lang.reflect.Field;

public class GeradorSQL {

    public static String gerarInsert(Object objeto) {

        Class<?> classe = objeto.getClass();

        Tabela tabela = classe.getAnnotation(Tabela.class);

        if (tabela == null) {
            throw new IllegalArgumentException(
                "A classe não possui @Tabela"
            );
        }

        StringBuilder colunas = new StringBuilder();
        StringBuilder valores = new StringBuilder();

        Field[] campos = classe.getDeclaredFields();

        for (Field campo : campos) {

            Coluna coluna = campo.getAnnotation(Coluna.class);

            if (coluna == null) {
                continue;
            }

            try {

                campo.setAccessible(true);

                Object valor = campo.get(objeto);

                if (colunas.length() > 0) {
                    colunas.append(", ");
                    valores.append(", ");
                }

                colunas.append(coluna.nome());

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

        return "INSERT INTO "
                + tabela.nome()
                + " ("
                + colunas
                + ") VALUES ("
                + valores
                + ");";
    }
}