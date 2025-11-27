package calculadora;

/**
 * <p><strong>Classe de Teste da Calculadora</strong></p>
 *
 * <p>Esta classe contém o método principal responsável por executar
 * diversos testes utilizando a classe {@code Calculadora}. O objetivo
 * é demonstrar o funcionamento das operações básicas e o tratamento de
 * exceções.</p>
 *
 * <p>Este arquivo faz parte do projeto de demonstração envolvendo:</p>
 * <ul>
 *     <li>Técnicas de revisão estática (caixa branca)</li>
 *     <li>Depuração e tratamento de exceções</li>
 *     <li>Utilização dos métodos puros da classe Calculadora</li>
 *     <li>Documentação com Javadoc</li>
 * </ul>
 *
 * <p>Os testes realizados aqui validam operações válidas e cenários de erro,
 * como divisão por zero e operador inválido.</p>
 *
 * @author Seu Nome
 * @version 1.0
 */
public class TesteCalculadora {

    /**
     * Método principal responsável por executar testes da classe {@link Calculadora}.
     *
     * <p>Os seguintes cenários são testados:</p>
     * <ul>
     *     <li>Operações válidas de soma, subtração, multiplicação e divisão</li>
     *     <li>Tentativa de divisão por zero (gera exceção)</li>
     *     <li>Uso de operador inválido (gera exceção)</li>
     * </ul>
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.calcular(2, 3, "+"));
        System.out.println(calc.calcular(10, 4, "-"));
        System.out.println(calc.calcular(3, 5, "*"));
        System.out.println(calc.calcular(8, 2, "/"));

        try {
            System.out.println(calc.calcular(8, 0, "/")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(calc.calcular(5, 5, "x")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}


