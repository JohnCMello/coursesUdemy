package secao_4_estrutura_sequencial;

public class FuncoesMatematicas {

	public static void main(String[] args) {
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		
		float a = 1f;
		float b = 0f;
		float c = -1444f;
		
		float delta = (float) (Math.pow(b, 2.0) - 4*a*c);
		float x1 = (float) ((-b + Math.sqrt(delta)) / (2.0 * a));
		float x2 = (float) ((-b - Math.sqrt(delta)) / (2.0 * a));
		
		System.out.println("Formula de Bhaskara");
		System.out.println("Delta: "+ delta);
		System.out.println("x1: "+ x1);
		System.out.println("x2: "+ x2);
	}

}
