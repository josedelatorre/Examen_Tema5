package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int opcion = 0; // entero para el switch
		System.out.println("***EJERCICIO 1***");
		System.out.println();
		System.out.println();
		System.out.println("¿Cuantos alumnos tiene el aula?");
		float[] notas = new float[leerInt()];

		rellenaNotas(notas); // rellenamos el array

		do { // iteramos hasta que el usuario haga lo que le pedimos.

			System.out.println();
			System.out.println();
			System.out.println("**************************");
			System.out.println("* Menu de opciones:      *");
			System.out.println("* 1. PORCENTAJES NOTAS   *");
			System.out.println("* 2. NOTA MEDIA TOTAL    *");
			System.out.println("* 3. BAREMO 1-4          *");
			System.out.println("* 4. SALIR DEL PROGRAMA  *");
			System.out.println("* Ingrese la opcion:     *");
			System.out.println("**************************");

			opcion = leerInt();// validamos la opcion

			switch (opcion) {
			case 1: // porcentajes

				float[] porcentajes = porcentajes(notas); // llamamos a la
															// funcion

				System.out.println("El porcentaje de suspensos es de " + porcentajes[0] + "%.");
				System.out.println("El porcentaje de aprovados es de " + porcentajes[1] + "%.");
				System.out.println("El porcentaje de bienes es de " + porcentajes[2] + "%.");
				System.out.println("El porcentaje de notables es de " + porcentajes[3] + "%.");
				System.out.println("El porcentaje de sobresalientes es de " + porcentajes[4] + "%.");
				break;

			case 2: // Media
				float notamedia = calculaMedia(notas);
				System.out.println("La nota media de todas las notas introducidas es " + notamedia + "puntos.");

				break;

			case 3: // baremo 1-4
				float[] notasBaremadas = baremar(notas);
				imprimeArray(notas); // notas por teclado
				imprimeArray(notasBaremadas); // nuevo baremo

				break;

			case 4:
				System.out.println("Gracias!");
				break;

			default:
				System.out.println("Debe introducir un numero entre el 1 y el 4.");
				break;
			}
		} while (opcion != 4);

	}

	public static float[] porcentajes(float[] notas) {
		float[] porcentajes = new float[5];
		int contSus = 0;
		int contApro = 0;
		int contB = 0;
		int contN = 0;
		int contS = 0;

		for (int i = 0; i < notas.length; i++) {
			if (notas[i] < 5) {
				contSus++;
			} else if (notas[i] < 6) {
				contApro++;
			} else if (notas[i] < 7) {
				contB++;
			} else if (notas[i] < 9) {
				contN++;
			} else if (notas[i] < 11) {
				contS++;
			}
		}
		porcentajes[0] = (contSus * 100) / notas.length;
		porcentajes[1] = (contApro * 100) / notas.length;
		porcentajes[2] = (contB * 100) / notas.length;
		porcentajes[3] = (contN * 100) / notas.length;
		porcentajes[4] = (contS * 100) / notas.length;
		return porcentajes;

	}

	public static float[] baremar(float[] notas) {
		float[] notasBaremadas = new float[notas.length];
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] < 5) {
				notasBaremadas[i] = 0;
			} else if (notas[i] < 5.1) {
				notasBaremadas[i] = 1;
			} else if (notas[i] < 5.2) {
				notasBaremadas[i] = (float) 1.05;
			} else if (notas[i] < 5.3) {
				notasBaremadas[i] = (float) 1.1;
			} else if (notas[i] < 5.4) {
				notasBaremadas[i] = (float) 1.15;
			} else if (notas[i] < 5.5) {
				notasBaremadas[i] = (float) 1.20;
			} else if (notas[i] < 5.6) {
				notasBaremadas[i] = (float) 1.25;
			} else if (notas[i] < 5.7) {
				notasBaremadas[i] = (float) 1.3;
			} else if (notas[i] < 5.8) {
				notasBaremadas[i] = (float) 1.35;
			} else if (notas[i] < 5.9) {
				notasBaremadas[i] = (float) 1.4;
			} else if (notas[i] < 6) {
				notasBaremadas[i] = (float) 1.45;
			} else if (notas[i] < 6.1) {
				notasBaremadas[i] = (float) 1.5;
			} else if (notas[i] < 6.2) {
				notasBaremadas[i] = (float) 1.55;
			} else if (notas[i] < 6.3) {
				notasBaremadas[i] = (float) 1.6;
			} else if (notas[i] < 6.4) {
				notasBaremadas[i] = (float) 1.65;
			} else if (notas[i] < 6.5) {
				notasBaremadas[i] = (float) 1.7;
			} else if (notas[i] < 6.6) {
				notasBaremadas[i] = (float) 1.75;
			} else if (notas[i] < 6.7) {
				notasBaremadas[i] = (float) 1.8;
			} else if (notas[i] < 6.8) {
				notasBaremadas[i] = (float) 1.85;
			} else if (notas[i] < 6.9) {
				notasBaremadas[i] = (float) 1.9;
			} else if (notas[i] < 7) {
				notasBaremadas[i] = (float) 1.95;
			} else if (notas[i] < 7.1) {
				notasBaremadas[i] = (float) 2;
			} else if (notas[i] < 7.2) {
				notasBaremadas[i] = (float) 2.05;
			} else if (notas[i] < 7.3) {
				notasBaremadas[i] = (float) 2.1;
			} else if (notas[i] < 7.4) {
				notasBaremadas[i] = (float) 2.15;
			} else if (notas[i] < 7.5) {
				notasBaremadas[i] = (float) 2.20;
			} else if (notas[i] < 7.6) {
				notasBaremadas[i] = (float) 2.25;
			} else if (notas[i] < 7.7) {
				notasBaremadas[i] = (float) 2.3;
			} else if (notas[i] < 7.8) {
				notasBaremadas[i] = (float) 2.35;
			} else if (notas[i] < 7.9) {
				notasBaremadas[i] = (float) 2.4;
			} else if (notas[i] < 8) {
				notasBaremadas[i] = (float) 2.45;
			} else if (notas[i] < 8.1) {
				notasBaremadas[i] = (float) 2.5;
			} else if (notas[i] < 8.2) {
				notasBaremadas[i] = (float) 2.55;
			} else if (notas[i] < 8.3) {
				notasBaremadas[i] = (float) 2.6;
			} else if (notas[i] < 8.4) {
				notasBaremadas[i] = (float) 2.65;
			} else if (notas[i] < 8.5) {
				notasBaremadas[i] = (float) 2.7;
			} else if (notas[i] < 8.6) {
				notasBaremadas[i] = (float) 2.75;
			} else if (notas[i] < 8.7) {
				notasBaremadas[i] = (float) 2.8;
			} else if (notas[i] < 8.8) {
				notasBaremadas[i] = (float) 2.85;
			} else if (notas[i] < 8.9) {
				notasBaremadas[i] = (float) 2.9;
			} else if (notas[i] < 9) {
				notasBaremadas[i] = (float) 2.95;
			} else if (notas[i] < 9.1) {
				notasBaremadas[i] = (float) 3;
			} else if (notas[i] < 9.2) {
				notasBaremadas[i] = (float) 3.1;
			} else if (notas[i] < 9.3) {
				notasBaremadas[i] = (float) 3.2;
			} else if (notas[i] < 9.4) {
				notasBaremadas[i] = (float) 3.3;
			} else if (notas[i] < 9.5) {
				notasBaremadas[i] = (float) 3.4;
			} else if (notas[i] < 9.6) {
				notasBaremadas[i] = (float) 3.5;
			} else if (notas[i] < 9.7) {
				notasBaremadas[i] = (float) 3.6;
			} else if (notas[i] < 9.8) {
				notasBaremadas[i] = (float) 3.7;
			} else if (notas[i] < 9.9) {
				notasBaremadas[i] = (float) 3.8;
			} else if (notas[i] < 10) {
				notasBaremadas[i] = (float) 3.9;
			} else {
				notasBaremadas[i] = (float) 4;
			}
		}
		return notasBaremadas;

	}

	public static float[] baremoPro(float[] notas) {
		float[] notasBaremadas = new float[notas.length];
		float aux = 0.00f;
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] < 5) {
				notasBaremadas[i] = 0;
			} else if (notas[i] < 9) {
				aux = (float) (((notas[i] - 5) * 0.5) + 1);
				notasBaremadas[i] = aux;
			} else if (notas[i] < 10) {
				aux = (float) (3 + (notas[i] % 1));
				notasBaremadas[i] = aux;
			} else if (notas[i] == 10) {
				notasBaremadas[i] = 4;
			}
		}

		return notasBaremadas;
	}

	public static float[] rellenaNotas(float[] notas) {

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Introduzca la nota del alumno numero " + (i + 1));
			notas[i] = leerFloat();
		}
		return notas;
	}

	public static float leerFloat() {

		Scanner teclado = new Scanner(System.in);
		String entrada = "";
		float num = 0.00f;
		boolean error = false;

		do {
			System.out.println("Introduzca la nota:");
			entrada = teclado.nextLine();

			try {
				num = Float.parseFloat(entrada);
				error = false;
			} catch (NumberFormatException ne) {
				error = true;
				System.out.println("Error no has introducido un numero");
			} catch (Exception e) {
				error = true;
				System.out.println("Error generico, revisa la excepcion");
			}
			if (num < 0) {
				System.out.println("El numero ha de ser positivo o cero.");
				error = true;
			}
			if (num > 10) {
				System.out.println("El numero ha de estar entre 0 y 10.");
				error = true;
			}

		} while (error);
		return num;
	}

	public static int leerInt() {
		boolean esNumero = false;
		Scanner teclado = new Scanner(System.in);
		String entrada = "";
		int entero = 0;
		do {
			System.out.println("Numero:");
			entrada = teclado.next();
			try {
				entero = Integer.parseInt(entrada);
				esNumero = true;
			} catch (NumberFormatException nfe) {
				esNumero = false;
				System.out.println("Ha de introducir un numero entero.");
			}
			if (entero <= 0) {
				System.out.println("El numero ha de ser positivo.");
				esNumero = false;
			}
		} while (!esNumero);
		return entero;
	}

	public static float calculaMedia(float[] notas) {
		float media = 0.00f;
		float total = 0.00f;
		int i = 0;

		for (i = 0; i < notas.length; i++) {
			total += notas[i];
		}
		media = total / i;
		return media;
	}

	public static void imprimeArray(float[] array) {
		int f;
		System.out.print("[");
		for (f = 0; f < array.length - 1; f++) {
			System.out.print(array[f] + "\t ");
		}
		System.out.println(array[f] + "]");
	}
}
