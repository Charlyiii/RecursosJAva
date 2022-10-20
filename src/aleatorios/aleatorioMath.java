package aleatorios;

public class aleatorioMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//aleatorio con Math entre 1 y 10 (incluidos)
		//Formula: Fórmula *(X - Y +1) + Y
		
		//int numero=(int)(Math.random()*(10 -1 + 1) +1);
		//int numero=(int)(Math.random()*(10) + 1); //forma de acordarse: tiene que haber 10 números (multiplicación) y el primero es el 1 (suma)
		int numero=(int)(Math.random()*(11) +20); //el primero es el 20 y hay 11 múmeros (del 20 al 30)
		
		System.out.println(numero);
	}

}
