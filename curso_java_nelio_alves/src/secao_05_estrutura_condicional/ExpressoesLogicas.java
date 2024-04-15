package secao_05_estrutura_condicional;

public class ExpressoesLogicas {

	public static void main(String[] args) {
		/*
		 * Operadores
		 * 
		 * && e
		 * || ou
		 * ! não
		 */
		
		int x = 5;
		
//		&& todas as condições tem que ser verdadeira
		
//		x <= 20 && x == 10 => false
//		x > 0 && x != 3 => true
//		x <= 20 && x == 10 && x != 3 => false
		
		/*
		 * Tabela verdade &&
		 * 
		 * A - B | A && B
		 * F   F     F
		 * F   V     F
		 * V   F     F
		 * V   V     V
		 */
		
//		|| pelo menos uma das condições tem que ser verdadeira
		
//		x == 10 || x <= 20 => true
//		x > 0 || x != 3 => true
//		x <= 0 || x != 3 || x != 5 => true
		
		/*
		 * Tabela verdade ||
		 * 
		 * A - B | A || B
		 * F   F     F
		 * F   V     V
		 * V   F     V
		 * V   V     V
		 */
		
//		| diferente ou inverte valor
		
//		!(x == 10) => true
//		!(x >= 2) => false
//		!(x <= 20 && x == 10) => true
		
		/*
		 * Tabela verdade !
		 * 
		 * A - !A
		 * F    V  
		 * V    F
		 */
	}
}
