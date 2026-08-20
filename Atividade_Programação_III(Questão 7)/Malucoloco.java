package md7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MalucoLoco {

    public static void main(String[] args) {

        List<Integer> numeros =
                Arrays.asList(10, 20, 30, 40, 50);

        System.out.println("Soma: "
                + UtilNumeros.soma(numeros));

        System.out.println("Média: "
                + UtilNumeros.media(numeros));

        System.out.println("Maior: "
                + UtilNumeros.maior(numeros));

        List<Number> valores = new ArrayList<>();

        UtilNumeros.adicionarInteiro(valores, 100);

        System.out.println("Lista após adicionar: "
                + valores);
    }
}