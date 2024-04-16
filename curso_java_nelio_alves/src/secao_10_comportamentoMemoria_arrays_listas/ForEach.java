package secao_10_comportamentoMemoria_arrays_listas;

public class ForEach {

	public static void main(String[] args) {

		String[] vect = new String[] { "Maria", "Bob", "Alex" };
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
//		forEach
		for (String obj : vect) {
			System.out.println(obj);
		}

	}

}
