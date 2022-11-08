package tiposEnumerados;

public class TiposEnum {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Para almacenar después es ese tipo de variable solo uno de los valores que terenmos almacenado en Enum
		
		Talla s=Talla.MINI;  //solo podemos almacenar estos valores
		Talla m=Talla.MEDIANO;
		Talla l=Talla.GRANDE;
		Talla xl=Talla.MUY_GRANDE;

	}
	
	//Hay que declararlo fuera del main
	//Creamos una instancia de tipo enum
	enum Talla {MINI, MEDIANO, GRANDE, MUY_GRANDE};

}
