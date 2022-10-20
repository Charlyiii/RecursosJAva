package generica;


public class ClaseGenerica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MiClaseGenerica<String> miObjeto=new MiClaseGenerica<String>();
		//El texto está vacío, porque el constructor lo pone e null
		
		//miObjeto.setObjeto(new String("Carlos"));  También valdría
		miObjeto.setObjeto("Carlos"); //vemos como el Intelisense nos dice que tenemos que pasarle un String...
							  //...se adapta al tipo de objeto que estamos manejando,ya que la clase le dijimos que debe devolver un genérico
	
		System.out.println(miObjeto.getObjeto()); //También vemos aquí como se adapta
	
	//Ahora vemos si la clase génerica se adapta a un objeto persona (clase creada al final)
	
		MiClaseGenerica<Persona> miPersona=new MiClaseGenerica<Persona>();
		
		//miPersona.setObjeto(new Persona("Araceli")); También valdría
		Persona araceli=new Persona("Araceli");
		miPersona.setObjeto(araceli); //vemos como se adapta también, cambiamos de null a persona
		
		System.out.println(miPersona.getObjeto()); //se imprime el nombre porque sobreescribimos el método String toString()
	}
}
	//-----------MI CLASE GENERICA-------------------------------------------

	class MiClaseGenerica<T> { //por convención, nombre del parámetro T, U, K para el genérico
	
		//va asignar el valor null a cualquier objeto y después un un setter que cambie de null a otro y un getter que devuelva el objeto
	
		public MiClaseGenerica() {
		
			objeto=null;
		}
	
		public void setObjeto(T nuevoValor) { //pasamos por parametro un objeto de cualquier tipo
		
			objeto=nuevoValor;
		}
	
		public T getObjeto() {
		
			return objeto;
		}
	
		private T objeto;
	}
	//Para prueba-----------------------------
	class Persona{
	
	public Persona(String nombre) {
		
		this.nombre = nombre;
	}
	
	public String toString() {
		
		return nombre;
	}

	private String nombre;
}

