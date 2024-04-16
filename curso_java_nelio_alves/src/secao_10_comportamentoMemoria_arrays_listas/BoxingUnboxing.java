package secao_10_comportamentoMemoria_arrays_listas;

public class BoxingUnboxing {
	
	
	static public void main(String[] args) {
		int x  = 20;
		
//		Object obj = x;
//		int y = (int) obj;
		
//		Com wrapper classes a inferência de tipo é automática e o casting desnecessário
//		O valor padrão pode ser nulo.
		
		Integer obj = x;
		int y = obj;
		
		System.out.println("x: " + x);	
		System.out.println("obj: " + obj);
		System.out.println("y: " + y);
		
		Integer z = 10;
		int w = z * 2;
		
		System.out.println("z: " + z);	
		System.out.println("w: " + w);
		
//	Wrapper Classes
		
//		public String name;
//		public Double price;
//		public Integer quantity;
//		
	}
	
}
