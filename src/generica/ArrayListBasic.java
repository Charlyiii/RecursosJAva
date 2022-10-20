package generica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//No funcionan con tipos primitivos (int, double, ...)
		
				ArrayList<String> primerArrayList=new ArrayList<String>(); 
			
				
				primerArrayList.add(new String("Hola"));
				primerArrayList.add(new String("Adiós"));
				primerArrayList.add("Hasta luego"); //también vale así
				
			
						
						primerArrayList.trimToSize(); //tiene que ser después de haber agregado los objetos
				//Con esto, reducimos el arrayList a 3 elementos, sin desperdiciar memoria.
				
				//para saber la dimensión
				System.out.println(primerArrayList.size());
				
				//recorrer el ArrayList
				
				for(String e : primerArrayList) {
					
					System.out.println(e); //al ser un String así nos imprime directamente..............
					//................................pero si fuera otro objeto si que habría que llamar a cualquier método
					//................................con iformación a imprimir, si no nos imprime la referencia
				}
				
				System.out.println(primerArrayList); //imprime: [Hola, Adiós, Hasta luego]
				
				//------------------MÉTODOS FRECUENTES-------------------------
				
				
				ArrayList<String> miAL=new ArrayList<String>();
				
				miAL.add(new String("Hola"));
				miAL.add(new String("Adiós"));
				miAL.add(new String("Que tal"));
				miAL.add(new String("Ciao"));
				
				System.out.println(miAL.get(0)); //obtiene el objeto de la posición
				
				miAL.set(0, new String("hello")); //reemplazamos el elemento de la posición 0
				
				System.out.println(miAL.get(0));
				
				for(String s : miAL) {  //recorremos con foreach
					
					System.out.println(s); 
				}
				
				for(int i=0; i<miAL.size(); i++) { //recorremos con for condicional
					
					System.out.println(miAL.get(i));
				}
				
				//borramos la posicion 0 del Array list
				
				miAL.remove(0);
				
				//insertamos un elemento en la segunda (1) posicion del array list
				miAL.add(1, "Soy el segundo");
				
				//cambiamos el ultimo elemento a la penultima posición
				Collections.swap(miAL, 2, 3); //esto supongo que lo veremos más adealnte
				
				//Convertimos el el ArrayList en Array
				String [] array=new String[miAL.size()];
				miAL.toArray(array);
				
				//Recorremos el array
				for(String s : array) {
					
					System.out.println(s);
				}
				//ordenamos array
				System.out.println("Array ordenado:");
				Arrays.sort(array);
				for(String s : array) {
					
					System.out.println(s);
				}
				
				//ordenamos arrayList
				System.out.println("ArrayList ordenada:");
				Collections.sort(miAL);
				for(String s : miAL) { 
					
					System.out.println(s); 
				}
			}
		}
	


