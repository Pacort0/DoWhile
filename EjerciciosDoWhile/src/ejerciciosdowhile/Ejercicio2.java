package ejerciciosdowhile;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Creamos la variable del programa y la inicializamos a 0
		int num = 0;
		//Imprimimos el mensaje inicial, explicando al usuario la función del programa
		System.out.println("Programa que imprime todos los números pares del 1 al 200: ");
	
		do {
			//Vamos incrementando el número en dos unidades con cada pasada del bucle
			num += 2;
			//Imprimimos el número actual
			System.out.println(num);
		}
		//Mientras el número sea menor a 200, no ponemos '<=' porque el programa parará cuando le sume 2 a 198, ya que cuando vea 200 frenará
		while(num < 200);
	}

}
