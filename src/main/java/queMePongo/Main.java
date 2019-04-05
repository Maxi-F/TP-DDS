package queMePongo;

import java.util.Scanner;

public class Main {
	private static Scanner teclado;

	public static void main(String[] args) {

		Prenda remeraRoja = introducirPrenda();

		System.out.println("Se ha creado la siguiente prenda: ");

		mostrarPrenda(remeraRoja);

	}

	private static void mostrarPrenda(Prenda prenda) {

		System.out.println("Tipo: " + prenda.getTipo());

		System.out.println("Categoria: " + prenda.getCategoria().name());

		System.out.println("Color primario: " + prenda.getColorPrimario().name());

		System.out.println("Color secundario: " + prenda.getColorSecundario().name());

		System.out.println("Tela: " + prenda.getTela().name());

	}

	private static Prenda introducirPrenda() {

		PrendaBuilder constructorPrenda = new PrendaBuilder();

		teclado = new Scanner(System.in);

		System.out.println("~~Introduccion De Prenda~~: ");

		System.out.print("Introduzca el tipo: (remera, pantalon, etc..)");
		constructorPrenda.setTipo(teclado.nextLine());

		System.out.print("Introduzca la categoria: ");
		System.out.println("Posibles: " + java.util.Arrays.asList(Categoria.values()));
		String categoriaString = teclado.nextLine();
		constructorPrenda.setCategoria(Categoria.valueOf(categoriaString));

		System.out.print("Introduzca el color principal: ");
		System.out.println("Posibles: " + java.util.Arrays.asList(ColorRopa.values()));
		String colorString = teclado.nextLine();
		constructorPrenda.setColorPrimario(ColorRopa.valueOf(colorString));

		System.out.print("Introduzca la tela: ");
		System.out.println("Posibles: " + java.util.Arrays.asList(Tela.values()));
		String telaString = teclado.nextLine();
		constructorPrenda.setTela(Tela.valueOf(telaString));

		return constructorPrenda.crear();
	}

}
