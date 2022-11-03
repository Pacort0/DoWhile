package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Creamos la variable 'num', que usaremos para guardar el número que introduzca el usuario 
		int num;
		//Creamos la variable 'i', que usaremos de contador para el programa
		int i = 1;
		
		//Creamos el escáner del programa
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos el mensaje inicial, esperamos a que el usuario introduzca un valor y lo guardamos en la variable 'num'
		System.out.print("Introduzca un número entero: ");
		num = sc.nextInt();
		
		do {
			//Imprimimos el mensaje final, estructurado de manera que se impriman resultados diferentes con cada pasada, aumentando el contador
			System.out.println(num + " x " + i + " = " + num*i);
			//Aumentamos el valor del contador
			i++;
		}
		//Este procesos se repite mientras el contador no sea igual a 10
		while(i <= 10);
		
		//Cerramos el escáner
	sc.close();	
	}
}
