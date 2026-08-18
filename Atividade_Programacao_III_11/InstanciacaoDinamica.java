package Atividade_Programacao_III.Atividade_Programacao_III_11;

import java.lang.reflect.Constructor;

public class InstanciacaoDinamica {
    
    public static void main(String[] args) {
        
        try {
            
            Class<?> classe = Class.forName("Atividade_Programacao_III.Atividade_Programacao_III_11.Produto");
            
            System.out.println("NOME DA CLASSE");
            System.out.println(classe.getName());

            System.out.println("\nINSTANCIANDO COM CONSTRUTOR PADRÃO");
            
            // Obtendo o construtor padrão usando getDeclaredConstructor().
            Constructor<?> construtorVazio = classe.getDeclaredConstructor();
            
            // setAccessible(true) ignora modificadores de acesso "Chave mestra".
            construtorVazio.setAccessible(true);
            
            // Instanciando o objeto dinamicamente usando newInstance().
            Object produto1 = construtorVazio.newInstance();
            System.out.println("Objeto criado com sucesso: " + produto1);

            
            System.out.println("\nINSTANCIANDO COM CONSTRUTOR COM PARÂMETROS");
            
            // Obtendo o construtor especificando os tipos dos parâmetros (String e double).
            Constructor<?> construtorComParametros = classe.getDeclaredConstructor(String.class, double.class);
            construtorComParametros.setAccessible(true);
            
            // Instanciando o objeto com os valores reais como argumentos.
            Object produto2 = construtorComParametros.newInstance("Notebook Gamer", 4500.00);
            System.out.println("Objeto criado com sucesso: " + produto2);
            
            
            System.out.println("\nTESTANDO ERRO (CONSTRUTOR INEXISTENTE)");
            
            // Tentando buscar um construtor que não existe na classe Produto.
            // Isso fará o código pular direto para o catch (NoSuchMethodException).
            // O try-catch é necessário para imprimir uma mensagem de erro e não "crashar" o sistema.
            Constructor<?> construtorFalso = classe.getDeclaredConstructor(boolean.class);
            
        } catch (ClassNotFoundException e) {
            System.out.println("Classe não encontrada: " + e.getMessage());
        } catch (NoSuchMethodException e) {
            System.out.println("Construtor não encontrado: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro ao instanciar o objeto: " + e.getMessage());
        }
    }
    
    /*
     * RESPOSTA TEÓRICA EXIGIDA NA QUESTÃO 11:
     * 
     * 1. Problemas de Segurança: O uso do 'setAccessible(true)' permite instanciar objetos 
     *    mesmo que o construtor seja 'private'. Isso quebra totalmente o encapsulamento
     *    gerando riscos de segurança e integridade no sistema.
     * 
     * 2. Acoplamento e Manutenção: Como o nome da classe e os tipos dos parâmetros são 
     *    informados através de Strings e reflexão, o compilador do Java não consegue validar 
     *    se eles estão certos na hora em que estamos programando. Se o nome da classe 'Produto' mudar 
     *    no futuro, o sistema só vai estourar um erro em tempo de execução na mão do usuário final.
     */
}