package Ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		String frase = "Yo pienso que ratata es un gran pokemon, pero tu no. Vosotros acabareis aprendiendo a programar, no perdais la fe.";
		System.out.println(SuprimirPronombres(frase));
	}

	public static String SuprimirPronombres(String texto) {
		texto = texto.toLowerCase();
		String[] pronombres = { "yo", "tu", "el", "ella", "nosotros", "nosotras", "vosotros", "vosotras", "ellos",
				"ellas" };

		// Suprimir pronombres
		for (int i = 0; i < pronombres.length; i++)
			texto = texto.replaceAll(pronombres[i], "");

		// Suprimir dobles espacios en blanco
		texto = texto.replaceAll("  ", " ");

		// Suprimir posible espacio en blanco al comienzo de la frase
		if (texto.startsWith(" "))
			texto = texto.substring(1, texto.length());
		
		// Suprimir posible espacio en blanco al final de la frase
		if (texto.endsWith(" "))
			texto = texto.substring(0, texto.length() - 1);

		return texto;
	}

}
