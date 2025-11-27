package calculadora;

/**
 * <p>
 * <strong>Projeto Calculadora</strong>
 * </p>
 *
 * <p>
 * Esta classe fornece operações matemáticas básicas como soma, subtração,
 * multiplicação e divisão, além de um método principal que seleciona a operação
 * desejada com base em um operador informado pelo usuário.
 * </p>
 *
 * <p>
 * Esse projeto é utilizado para demonstrar:
 * </p>
 * <ul>
 * <li>Técnicas de revisão estática (caixa branca)</li>
 * <li>Técnicas de revisão (caixa branca)</li>
 * <li>Aplicação de refatoração em código Java</li>
 * <li>Documentação com Javadoc</li>
 * </ul>
 *
 * <p>
 * Após a refatoração, os métodos desta classe são <strong>métodos
 * puros</strong>,
 * sem efeitos colaterais, permitindo maior legibilidade e facilitando testes
 * unitários.
 * </p>
 *
 * @author Vitor Assunção Arruda  -  RA 248425
 * @version 1.0
 */
public class Calculadora {

    /**
     * Soma dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da soma de {@code a} e {@code b}
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai o segundo número do primeiro.
     *
     * @param a primeiro operando 
     * @param b segundo operando
     * @return o resultado da subtração de {@code a} e {@code b}
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da multiplicação de {@code a} e {@code b}
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a divisão entre dois números inteiros.
     *
     * @param a dividendo
     * @param b divisor
     * @return o resultado da divisão de {@code a} por {@code b}
     * @throws IllegalArgumentException se {@code b} for igual a zero
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida");
        }
        return a / b;
    }

    /**
     * Executa uma operação matemática com base no operador fornecido.
     *
     * <p>
     * Operadores permitidos:
     * </p>
     * <ul>
     * <li>"+" — soma</li>
     * <li>"-" — subtração</li>
     * <li>"*" — multiplicação</li>
     * <li>"/" — divisão</li>
     * </ul>
     *
     * @param a        primeiro operando
     * @param b        segundo operando
     * @param operador símbolo representando a operação desejada
     * @return o resultado da operação indicada
     * @throws IllegalArgumentException se o operador informado for inválido
     */
    public int calcular(int a, int b, String operador) {
        return switch (operador) {
            case "+" -> somar(a, b);
            case "-" -> subtrair(a, b);
            case "*" -> multiplicar(a, b);
            case "/" -> dividir(a, b);
            default -> throw new IllegalArgumentException("Operador inválido: " + operador);
        };
    }
}
