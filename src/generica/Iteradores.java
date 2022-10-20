package generica;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteradores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> miAL=new ArrayList<String>();
		
		miAL.add("Uno"); //al ser de objetos strings, podemos añadarlios así
		miAL.add("Dos");
		miAL.add("Tres");
		miAL.add("Cuatro");
		miAL.add("Cinco");

		//Como es una interfaz no se puede instanciar (llamar al constructor)
		Iterator<String> miIterador=miAL.iterator();
		
		while(miIterador.hasNext()) //mientras el elemento tengo otro después, continúa
		{
			System.out.println((miIterador.next())); //al ser un String valdría así.........
			//...........pero si fuera otro objeto si que habría que llamar a cualquier método (toString x ej)
			//................................con iformación a imprimir, si no nos imprime la referencia
		}
	}

}
