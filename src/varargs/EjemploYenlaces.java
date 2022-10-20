package varargs;

public class EjemploYenlaces {
	
	// https://www.arquitecturajava.com/java-varargs-colecciones/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(suma(2,5,3));
	}
	
	public static int suma(int...numero) {
		
		int suma=0;
		
		for(int elementos : numero) { //foreach
			
			suma+=elementos;
		}
		
		return suma;
	}

}
