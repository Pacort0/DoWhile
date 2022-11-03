package ejerciciosdowhile;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Creamos la variable que iremos aumentando hasta llegar a 20
		int num = 0;
		
		//Imprimimos el mensaje inicial
		System.out.println("Programa que imprime los primeros 20 números naturales: ");
		
		do {
			//Sumamos +1 al número
			num++;
			//Imprimimos el número actual
			System.out.println(num);
		}
		//El proceso se repite mientras el número sea menor a 20
		while(num < 20);
	}

}
