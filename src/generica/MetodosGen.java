package generica;


public class MetodosGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] nombres= {"Carlos", "Araceli", "Richi", "Misi"};
		System.out.println("Array de Strings:");
		System.out.println(ExaminaArrays.getElemtnos(nombres));
		
		System.out.println();
		
		//Ahora cambiamos el tipo de array y vemos como se adapta y funciona igual
		Integer [] numeros= {1,2,3,4,5,6}; //con int no funciona porque no son objetos
		System.out.println("Array de enteros:"); 
		System.out.println(ExaminaArrays.getElemtnos(numeros));
				
	}
}

class ExaminaArrays{
	
	
	//método que devuelva String con cuantos elementos tiene el array
	public static <T> String getElemtnos(T[] array) { //hay que especificar el argumento de tipo <T>, por lo demás igual

		return "El array tiene " + array.length + " elementos";
	}
}
