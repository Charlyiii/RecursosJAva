package aleatorios;

import java.util.Random;

public class AleatorioRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //aleatorio entre 1 y 10 (incluidos) con Clase Randmom
		
		Random aleatorio=new Random();
		
		System.out.println(aleatorio.nextInt(1, 11)); //el primero se incluye, el segundo no
	}

}
