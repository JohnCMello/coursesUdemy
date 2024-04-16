package secao_10_comportamentoMemoria_arrays_listas;

public class TipoReferenciaTipoValor {

	public static void main(String[] args) {
		/*
		 * Em Java, os tipos de dados podem ser divididos em dois tipos principais:
		 * tipos de valor (value types) e tipos de referência (reference types).
		 * 
		 * Tipos de Valor (Value Types): Os tipos de valor representam diretamente o
		 * valor dos dados. Eles são armazenados na memória da pilha (stack memory), o
		 * que os torna mais eficientes em termos de acesso e manipulação. Exemplos de
		 * tipos de valor em Java incluem: int, float, double, char, boolean, entre
		 * outros. Quando você atribui um valor de um tipo de valor a outra variável,
		 * uma cópia real do valor é feita. Ou seja, as variáveis contêm valores
		 * independentes.
		 */

		int a = 5;
		int b = a; // Uma cópia real de 'a' é feita e atribuída a 'b'
		b = 10; // 'a' continua sendo 5, pois 'b' tem uma cópia do valor de 'a'

		/*
		 * Tipos de Referência (Reference Types): Os tipos de referência armazenam
		 * endereços de memória que apontam para onde os dados estão armazenados. Eles
		 * são armazenados na memória do heap (heap memory), o que os torna menos
		 * eficientes em termos de acesso direto, mas oferecem mais flexibilidade.
		 * Exemplos de tipos de referência em Java incluem: objetos de classes, arrays,
		 * interfaces, entre outros. Quando você atribui uma variável de tipo de
		 * referência a outra, você está copiando o endereço de memória, não os próprios
		 * dados. Isso significa que ambas as variáveis apontam para o mesmo objeto ou
		 * array na memória.
		 */

		String str1 = "Olá";
		String str2 = str1; // 'str2' agora aponta para o mesmo objeto que 'str1'
		str2 = "Mundo"; // 'str1' ainda é "Olá", pois 'str2' agora aponta para uma nova String

		/*
		 * Em resumo, a principal diferença é que os tipos de valor armazenam os
		 * próprios dados, enquanto os tipos de referência armazenam endereços de
		 * memória que apontam para onde os dados estão armazenados. Isso afeta como os
		 * valores são manipulados e compartilhados entre variáveis em Java.
		 */

		/*
		 * Em Java, os valores padrão são os valores atribuídos automaticamente às
		 * variáveis se nenhum valor for explicitamente definido pelo programador. O
		 * valor padrão depende do tipo de dados da variável.
		 * 
		 * Aqui está uma lista dos valores padrão para diferentes tipos de dados em
		 * Java:
		 * 
		 * Tipos Numéricos Inteiros (byte, short, int, long): O valor padrão é 0.
		 * 
		 * Tipo Numérico de Ponto Flutuante (float, double): O valor padrão é 0.0.
		 * 
		 * Tipo Char: O valor padrão é '\u0000', que representa o caractere nulo.
		 * 
		 * Tipo Booleano: O valor padrão é false.
		 * 
		 * Tipos de Referência (objetos, arrays): O valor padrão é null, o que significa
		 * que a variável não faz referência a nenhum objeto na memória.
		 * 
		 * Aqui está um exemplo demonstrando os valores padrão para diferentes tipos de
		 * dados em Java:
		 */


		ExemploValoresPadrao.main(args);
	}

}

class ExemploValoresPadrao {
	static byte byteValue;
	static short shortValue;
	static int intValue;
	static long longValue;
	static float floatValue;
	static double doubleValue;
	static char charValue;
	static boolean booleanValue;
	static String stringValue;

	public static void main(String[] args) {
		System.out.println("Valor padrão de byte: " + byteValue);
		System.out.println("Valor padrão de short: " + shortValue);
		System.out.println("Valor padrão de int: " + intValue);
		System.out.println("Valor padrão de long: " + longValue);
		System.out.println("Valor padrão de float: " + floatValue);
		System.out.println("Valor padrão de double: " + doubleValue);
		System.out.println("Valor padrão de char: " + (int) charValue); // Convertido para int para exibir o código
																		// Unicode
		System.out.println("Valor padrão de boolean: " + booleanValue);
		System.out.println("Valor padrão de String: " + stringValue);
	}
}
