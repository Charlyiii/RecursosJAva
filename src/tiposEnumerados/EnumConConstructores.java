package tiposEnumerados;

import java.util.Scanner;

public class EnumConConstructores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Pedimos al usuario que introduzca una talla por consola
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce una talla: MINI, MEDIANO, GRANDE, MUY GRANDE");
		
		String entradaDatos=entrada.nextLine().toUpperCase();
		
		//método valueOF, devuelve el nombre de la constante enumerada
		
		Talla la_talla=Enum.valueOf(Talla.class, entradaDatos); //Si escribe grande, lo reconoce
		
		System.out.println("Talla=" + la_talla);
		
		System.out.println("Abreviatura=" + la_talla.getAbreviatura());
		
		//Podemos acceder así, pero por consola no podemos llamar a Talla, por eso usamos el valueOf de la entrada de datos
		Talla s=Talla.MINI;
		System.out.println(s.getAbreviatura());
		
		entrada.close();
	}

	enum Talla {
		
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
		
		private Talla(String abreviatura) { //Constructor con parámetro. Constructor private, ya que los enum no dejan usar el new
			
			this.abreviatura=abreviatura;
		}
		
		public String getAbreviatura() {
			
			return abreviatura;
		}
		
		private String abreviatura;
	}
}
