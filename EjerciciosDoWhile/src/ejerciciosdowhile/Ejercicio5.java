package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Creamos el número aleatorio y lo multiplicamos por 99 para obtener un número entre 1 y 99
		double numRandom = Math.random()*99;
		//Creamos la variable 'mayor' y la igualamos a 100, y servirá de tope para la primera pasada del bucle
		int mayor = 100;
		//Creamos la variable 'menor' y la igualamos a 0, nos servirá de suelo para la primera pasada del bucle
		int menor = 0;
		//Creamos la variable 'respuesta', donde guardaremos lo que el usuario introduzca por teclado
		String respuesta;
		
		//Creamos el escáner del programa
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Piense en un número del 1 al 99. El ordenador intentará adivinarlo.");
		
		do {
			//Imprimimos el primer número random
			System.out.println("¿Ha pensado en el número " + (int)numRandom + "?");
			//Pedimos instrucciones al usuario y guardamos su respuesta
			System.out.print("Introduzca si el número es mayor, menor o igual al suyo: ");
			respuesta = sc.next();
			
			//Si el número generado por el programa es mayor al que pensaba el usuario:
			if(respuesta.equals("mayor")) {
				//El valor del número generado se pasa a la variable 'mayor'
				mayor = (int) numRandom;
				 //Se genera un nuevo número random comprendido en el intervalo del valor mayor y menor que el programa ha guardado hasta ahora
				numRandom = (int) (Math.random() * ((mayor -1) - menor) + menor + 1);
			}
			//Si el número generado por el programa es menor al que el usuario pensaba:
			else if (respuesta.equals("menor")){
		    	//El valor del último número generado pasa a 'menor'
		    	menor = (int) numRandom;
		    	//Se genera un nuevo número random comprendido en el intervalo del valor mayor y menor que el programa ha guardado hasta ahora
				numRandom = (int) (Math.random() * ((mayor - 1) - menor) + menor + 1);
			}
		}
		//Todo esto se repite mientras no se encuentre el número pensado por el usuario
		while(!respuesta.equals("igual"));
		
		//Imprimimos el mensaje final con el valor resultante
		System.out.print("\n¡Adivinado! Usted pensaba en el número " + (int)numRandom);
		sc.close();
	}

}
