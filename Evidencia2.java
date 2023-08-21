package Actividad4;

import java.time.LocalDate;
import java.util.Scanner;

public class Evidencia2 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		System.out.println("Bienvenido");

		System.out.println("Cuantas peliculas quieres leer:");
		int cantidad = leer.nextInt();

		Pelicula[] peliculas = new Pelicula[cantidad];

		for (int i = 0; i < cantidad; i++) {
			peliculas[i] = new Pelicula();
			System.out.println("Dame el nombre de la pelicula:");
			String nombrePelicula = leer.next();
			peliculas[i].setNombreProducto(nombrePelicula);

			System.out.println("Costo de la renta:");
			int costoRenta = leer.nextInt();
			peliculas[i].setPrecioProducto(costoRenta);

			System.out.println("Dias de renta:");
			int diasRenta = leer.nextInt();
			peliculas[i].setDiasRenta(diasRenta);

			System.out.println("Genero de la pelicula:");
			String genero = leer.next();
			peliculas[i].setGenero(genero);

			System.out.println("Anio de la pelicula:");
			int anio = leer.nextInt();
			peliculas[i].setAnio(anio);

			peliculas[i].setDisponible(i % 2);

		}

		System.out.println("Cuantos juegos quieres leer:");
		cantidad = leer.nextInt();

		Juego[] juegos = new Juego[cantidad];

		for (int i = 0; i < cantidad; i++) {
			juegos[i] = new Juego();
			System.out.println("Dame el nombre del juego:");
			String nombreJuegos = leer.next();
			juegos[i].setNombreProducto(nombreJuegos);

			System.out.println("Costo de la renta:");
			int costoRenta = leer.nextInt();
			juegos[i].setPrecioProducto(costoRenta);

			System.out.println("Dias de renta:");
			int diasRenta = leer.nextInt();
			juegos[i].setDiasRenta(diasRenta);

			System.out.println("Estilo del juego:");
			String estilo = leer.next();
			juegos[i].setEstilo(estilo);

			System.out.println("Plataforma:");
			String consola = leer.next();
			juegos[i].setPlataforma(consola);

			juegos[i].setDisponible(i % 2);
		}

		String opcion = "";
		do {
			System.out.println("Elige la opcion deseada");

			System.out.println("T/t: Despliega todos los productos");
			System.out.println("P/p: Despliega todas las películas");
			System.out.println("V/v: Despliega todos los videojuegos");
			System.out.println("S/s: Checar si una película está rentada");
			System.out.println("J/j: Verifica si un videojuego está o no rentado");
			System.out.println("C/c: Devuelve la cantidad de películas que están rentadas");
			System.out.println("X/x: Indica la cantidad de videojuegos cuya plataforma es Xbox One");
			System.out.println("U/u: Termina el programa");

			opcion = leer.next();

			switch (opcion) {
			case "T":
			case "t":
				for (int i = 0; i < peliculas.length; i++) {
					System.out.println("Nombre:" + peliculas[i].getNombreProducto());
					System.out.println("Año:" + peliculas[i].getAnio());
					System.out.println("Dias renta:" + peliculas[i].getDiasRenta());
					System.out.println("Disponible:" + peliculas[i].getDisponible());
					System.out.println("Genero:" + peliculas[i].getGenero());
					System.out.println("Precio:" + peliculas[i].getPrecioProducto());

				}
				for (int i = 0; i < juegos.length; i++) {
					System.out.println("Nombre:" + juegos[i].getNombreProducto());
					System.out.println("Dias renta:" + juegos[i].getDiasRenta());
					System.out.println("Disponible:" + juegos[i].getDisponible());
					System.out.println("Estilo:" + juegos[i].getEstilo());
					System.out.println("Precio:" + juegos[i].getPrecioProducto());
					System.out.println("Despliega todos los videojuegos");
				}

				break;
			case "P":
			case "p":
				for (int i = 0; i < peliculas.length; i++) {
					System.out.println("Nombre:" + peliculas[i].getNombreProducto());
					System.out.println("Año:" + peliculas[i].getAnio());
					System.out.println("Dias renta:" + peliculas[i].getDiasRenta());
					System.out.println("Disponible:" + peliculas[i].getDisponible());
					System.out.println("Genero:" + peliculas[i].getGenero());
					System.out.println("Precio:" + peliculas[i].getPrecioProducto());

				}
				break;
			case "V":
			case "v":
				for (int i = 0; i < juegos.length; i++) {
					System.out.println("Nombre:" + juegos[i].getNombreProducto());
					System.out.println("Dias renta:" + juegos[i].getDiasRenta());
					System.out.println("Disponible:" + juegos[i].getDisponible());
					System.out.println("Estilo:" + juegos[i].getEstilo());
					System.out.println("Precio:" + juegos[i].getPrecioProducto());
					System.out.println("Despliega todos los videojuegos");
				}
				break;

			case "S":
			case "s":
				for (int i = 0; i < peliculas.length; i++) {
					if (peliculas[i].getDisponible() == 1) {
						System.out.println("Nombre:" + juegos[i].getNombreProducto());
						System.out.println("Dias renta:" + peliculas[i].getDiasRenta());
						System.out.println("Disponible:" + peliculas[i].getDisponible());
						System.out.println("Checar si una película está rentada");

					}

				}

				break;

			case "J":
			case "j":
				for (int i = 0; i < juegos.length; i++) {
					if (juegos[i].getDisponible() == 1) {
						System.out.println("Este juego estan rentado");
						System.out.println("Nombre:" + juegos[i].getNombreProducto());
						System.out.println("Dias renta:" + juegos[i].getDiasRenta());
						System.out.println("Estilo:" + juegos[i].getEstilo());
						System.out.println("Disponible:" + juegos[i].getDisponible());
					}

					if (juegos[i].getDisponible() == 0) {
						System.out.println("Nombre:" + juegos[i].getNombreProducto());
						System.out.println("Dias renta:" + juegos[i].getDiasRenta());
						System.out.println("Estilo:" + juegos[i].getEstilo());
						System.out.println("Disponible:" + juegos[i].getDisponible());
						System.out.println("Este juego esta disponible");
					}
				}

				break;

			case "C":
			case "c":
				int contador = 0;
				for (int i = 0; i < peliculas.length; i++) {
					if (peliculas[i].getDisponible() == 0) {
						contador++;

					}

				}
				System.out.println("El numero de peliculas rentadas es: " + contador);
				break;

			case "X":
			case "x":
				int plataforma = 0;
				for (int i = 0; i < juegos.length; i++) {
					if (juegos[i].getPlataforma().equalsIgnoreCase("Xbox one")) {
						plataforma++;

					}

				}

				System.out.println("Esta es la cantidad de videojuegos de Xbox One " + plataforma);
				break;
			case "U":
			case "u":
				System.out.println("Termina el programa");
				break;
			default:
				System.out.println("Opcion no valida, eligina una correcta");
				break;
			}
		} while (!opcion.equalsIgnoreCase("U"));
	}
}
