package Atividade_Programacao_III.Atividade_Programacao_III_10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class InspecaoClasse {
    
    public static void main(String[] args) {
        
        try {

            Class<?> classe = Class.forName("Atividade_Programacao_III.Atividade_Progrmacao_III_10.Pessoa");

            System.out.println("NOME DA CLASSE");
            System.out.println(classe.getName());

            System.out.println("\nATRIBUTOS");

            // Obtendo os atributos da classe com DeclaredFields() para ter os atributos privados.
            Field[] atributos = classe.getDeclaredFields();

            for (Field atributo : atributos) {
             System.out.print(atributo);
            }

            System.out.println("\nCONSTRUTORES");
           
            // Obtendo os construtores da classe com getDeclaredConstructors() para ter os construtores.
            Constructor<?>[] construtores = classe.getDeclaredConstructors();
            for (Constructor<?> construtor : construtores) {
                System.out.println("Construtor: " + construtor.getName());
                System.out.println("Parâmetros: " + Arrays.toString(construtor.getParameterTypes()));
            }

            System.out.println("\n MÉTODOS DECLARADOS");

            // Obtendo os métodos da classe com getDeclaredMethods().
            Method[] metodos = classe.getDeclaredMethods();
            for (Method metodo : metodos) {
                System.out.println("Método: " + metodo);
            }

            // Obtendo apenas métodos públicos com getMethods().
            System.out.println("\n MÉTODOS PÚBLICOS");
            Method[] metodosPublicos = classe.getMethods();
            for (Method metodoPublico : metodosPublicos) {
                System.out.println("Método Público: " + metodoPublico);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Classe não encontrada");
        }
    }
}