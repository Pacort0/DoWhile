package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Creamos las variables del programa
		//En la variable 'num' guardaremos el número que introduzca el usuario
		int num;
		//Creamos la variable 'i' y la inicializamos a 0. La usaremos como contador
		int i = 0;
		//Creamos la variable 'suma' y la inicializamos a 0. En ella iremos guardando la suma conforme aumenten las vueltas al bucle
		int suma = 0;
		
		//Creamos el escáner del programa.
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos el mensaje inicial, esperamos a que el usuario introduzca un número y lo guardamos en la variable 'num'
		System.out.print("Introduzca un número entero: ");
		num = sc.nextInt();
		
		do {
			//Incrementamos el valor de la suma, sumándole el valor del contador con cada vuelta
			suma += i;
			//Incrementamos el valor del contador
			i++;
		}
		//Todo este proceso se repetirá mientras el número introducido por el usuario sea mayor que el contador
		while(i <= num);
		
		//Imprimimos el mensaje final con el resultado correspondiente
		System.out.print("La suma de todos los números hasta llegar al número introducido es: " + suma);
		//Cerramos el escáner
		sc.close();
	}

}
