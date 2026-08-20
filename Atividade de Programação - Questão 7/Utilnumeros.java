package md7;

import java.util.List;

public class UtilNumeros {

    public static double soma(List<? extends Number> numeros) {
        double total = 0;

        for (Number numero : numeros) {
            total += numero.doubleValue();
        }

        return total;
    }

    public static double media(List<? extends Number> numeros) {
        if (numeros.isEmpty()) {
            return 0;
        }

        return soma(numeros) / numeros.size();
    }

    public static <T extends Comparable<T>> T maior(List<T> valores) {
        if (valores.isEmpty()) {
            return null;
        }

        T maior = valores.get(0);

        for (T valor : valores) {
            if (valor.compareTo(maior) > 0) {
                maior = valor;
            }
        }

        return maior;
    }

    public static void adicionarInteiro(
            List<? super Integer> lista, Integer valor) {

        lista.add(valor);
    }
}